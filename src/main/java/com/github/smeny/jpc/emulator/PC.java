/*
 * JPC: An x86 PC Hardware Emulator for a pure Java Virtual Machine Original project from the
 * Physics Dept, The University of Oxford
 * 
 * Copyright (C) 2007-2010 The University of Oxford Copyright (C) 2015 Stephane Meny
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License version 2 as published by the Free Software Foundation.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program; if
 * not, write to the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301 USA.
 */

package com.github.smeny.jpc.emulator;

import com.github.smeny.jpc.debugger.LinearMemoryViewer;
import com.github.smeny.jpc.emulator.execution.codeblock.CodeBlock;
import com.github.smeny.jpc.emulator.execution.codeblock.CodeBlockManager;
import com.github.smeny.jpc.emulator.execution.codeblock.PeekableMemoryStream;
import com.github.smeny.jpc.emulator.execution.decoder.*;
import com.github.smeny.jpc.emulator.memory.LinearAddressSpace;
import com.github.smeny.jpc.emulator.memory.PhysicalAddressSpace;
import com.github.smeny.jpc.emulator.motherboard.*;
import com.github.smeny.jpc.emulator.pci.PCIBus;
import com.github.smeny.jpc.emulator.pci.PCIHostBridge;
import com.github.smeny.jpc.emulator.pci.PCIISABridge;
import com.github.smeny.jpc.emulator.pci.peripheral.DefaultVGACard;
import com.github.smeny.jpc.emulator.pci.peripheral.EthernetCard;
import com.github.smeny.jpc.emulator.pci.peripheral.PIIX3IDEInterface;
import com.github.smeny.jpc.emulator.pci.peripheral.VGACard;
import com.github.smeny.jpc.emulator.peripheral.*;
import com.github.smeny.jpc.emulator.processor.*;
import com.github.smeny.jpc.j2se.KeyMapping;
import com.github.smeny.jpc.j2se.Option;
import com.github.smeny.jpc.j2se.PCMonitor;
import com.github.smeny.jpc.j2se.VirtualClock;
import com.github.smeny.jpc.support.ArgProcessor;
import com.github.smeny.jpc.support.Clock;
import com.github.smeny.jpc.support.DriveSet;

import javax.swing.*;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/**
 * This class represents the emulated PC and holds references to the hardware components.
 *
 * @author Ian Preston
 */
public class PC {

  public static final int DEFAULT_RAM_SIZE = Option.ram.intValue(16) * 1024 * 1024;
  public static final int INSTRUCTIONS_BETWEEN_INTERRUPTS = 1;
  public static final boolean ETHERNET = Option.ethernet.isSet();

  public static volatile boolean compile = Option.compile.isSet();

  public static final boolean HISTORY = Option.history.isSet();
  public static final int HISTORY_SIZE = 200;
  private static final int[] ipHistory = new int[HISTORY_SIZE];
  private static int historyIndex = 0;
  private static int insHistoryIndex = 0;
  private static CodeBlock[] prevBlocks = new CodeBlock[HISTORY_SIZE];

  private static final Logger LOGGING = Logger.getLogger(PC.class.getName());

  private final Processor processor;
  private final PhysicalAddressSpace physicalAddr;
  private final LinearAddressSpace linearAddr;
  private final Clock vmClock;
  private final InterruptController pic;
  private final List<HardwareComponent> hardwareComponents;
  private final CodeBlockManager manager;
  private EthernetCard ethernet;
  private final Keyboard keyboard;
  private final int systemRamSize;
  private final Calendar startTime;

  private volatile boolean running;

  /**
   * Constructs a new <code>PC</code> instance with the specified external time-source and drive
   * set.
   *
   * @param clock <code>Clock</code> object used as a time source
   * @param hardwareComponents instances of HardwareComponents associated with this PC.
   * @param systemRamSize the size of the system ram for the virtual machine in bytes.
   * @throws java.io.IOException propagated from BIOS resource loading.
   */
  private PC(Clock clock, List<HardwareComponent> hardwareComponents, int systemRamSize,
      Calendar startTime) {
    this.systemRamSize = systemRamSize;
    this.startTime = startTime;
    this.vmClock = clock;
    this.processor = new Processor(vmClock);
    this.hardwareComponents = hardwareComponents;
    this.manager = new CodeBlockManager();
    this.physicalAddr = new PhysicalAddressSpace(systemRamSize, manager);
    this.linearAddr = new LinearAddressSpace();
    this.pic = new InterruptController();
    this.keyboard = new Keyboard();

    initialiseComponents();
  }

  private void initialiseComponents() {
    hardwareComponents.add(processor);
    hardwareComponents.add(physicalAddr);
    hardwareComponents.add(linearAddr);
    hardwareComponents.add(pic);
    hardwareComponents.add(keyboard);

    hardwareComponents.add(new IOPortHandler());
    hardwareComponents.add(new DMAController(false, true));
    hardwareComponents.add(new DMAController(false, false));
    hardwareComponents.add(new RTC(0x70, 8, systemRamSize, startTime));
    hardwareComponents.add(new IntervalTimer(0x40, 0));
    hardwareComponents.add(new GateA20Handler());

    hardwareComponents.add(new PIIX3IDEInterface());
    hardwareComponents.add(new DefaultVGACard());

    hardwareComponents.add(new SerialPort(0));
    hardwareComponents.add(new SerialPort(1));
    hardwareComponents.add(new SerialPort(2));
    hardwareComponents.add(new SerialPort(3));
    hardwareComponents.add(new FloppyController());
    hardwareComponents.add(new PCSpeaker());

    hardwareComponents.add(new PCIHostBridge());
    hardwareComponents.add(new PCIISABridge());
    hardwareComponents.add(new PCIBus());

    if (Option.ethernet.isSet()) {
      hardwareComponents.add(new EthernetCard());
    }

    instantiateBIOS();
    instantiateSound();

    if (!configure()) {
      throw new IllegalStateException("PC Configuration failed");
    }
  }

  private void instantiateBIOS() {
    try {
      hardwareComponents.add(new SystemBIOS(Option.bios.value("/resources/bios/bios.bin")));
      hardwareComponents.add(new VGABIOS("/resources/bios/vgabios.bin"));
    } catch (IOException ioe) {
      throw new RuntimeException("IOException while instantiating BIOS resources", ioe);
    }
  }

  private void instantiateSound() {
    if (Option.sound.value()) {
      Midi.MIDI_Init();
      Mixer.MIXER_Init();
      String device = Option.sounddevice.value("sb16");
      if (device.equals("sb16")) {
        hardwareComponents.add(new Mixer());
        hardwareComponents.add(new MPU401());
        hardwareComponents.add(new SBlaster());
        hardwareComponents.add(new Adlib());
      }
    }
  }

  public int getSystemRamSize() {
    return systemRamSize;
  }

  public Calendar getStartTime() {
    return startTime;
  }

  public Instruction getInstruction() {
    return getInstruction(processor.getInstructionPointer());
  }

  public Instruction getInstruction(int address) {
    byte[] code = createCodeBlockFromMemory(address);
    PeekableInputStream peekableInputStream = new Disassembler.ByteArrayPeekStream(code);

    if (processor.isProtectedMode() && processor.cs.getDefaultSizeFlag()) {
      return Disassembler.disassemble32(peekableInputStream);
    }
    return Disassembler.disassemble16(peekableInputStream);
  }

  private byte[] createCodeBlockFromMemory(int address) {
    final int wordSize = 15; // Investigate why not 16 ?
    byte[] code = new byte[wordSize];
    physicalAddr.copyContentsIntoArray(address, code, 0, code.length);
    return code;
  }

  public void setState(int[] s) {
    processor.r_eax.set32(s[0]);
    processor.r_ecx.set32(s[1]);
    processor.r_edx.set32(s[2]);
    processor.r_ebx.set32(s[3]);
    processor.r_esp.set32(s[4]);
    processor.r_ebp.set32(s[5]);
    processor.r_esi.set32(s[6]);
    processor.r_edi.set32(s[7]);
    processor.eip = s[8];
    try {
      processor.setEFlags(s[9]);
    } catch (ProcessorException e) {
    }
    vmClock.update(s[16] - (int) vmClock.getTicks());
    if (!processor.isProtectedMode() && !processor.isVirtual8086Mode()) {
      processor.es(s[10]);
      processor.cs(s[11]);
      processor.ss(s[12]);
      processor.ds(s[13]);
      processor.fs(s[14]);
      processor.gs(s[15]);
    }
    try {
      processor.setCR0(s[36]);
    } catch (ModeSwitchException e) {
    }
    double[] newFPUStack = new double[8];
    for (int i = 0; i < 8; i++)
      newFPUStack[i] = Double
          .longBitsToDouble(0xffffffffL & s[2 * i + 37] | ((0xffffffffL & s[2 * i + 38]) << 32));
    processor.fpu.setStack(newFPUStack);
  }

  public void setPhysicalMemory(Integer addr, byte[] data) {
    physicalAddr.copyArrayIntoContents(addr, data, 0, data.length);
  }

  public Boolean getPITIrqLevel() {
    return BochsPIT.getIrqLevel();
  }

  public void setCode(byte[] code) {
    if (processor.isProtectedMode()) {
      // assume paging is off
      physicalAddr.copyArrayIntoContents(processor.getInstructionPointer(), code, 0, code.length);
    } else {
      physicalAddr.copyArrayIntoContents(processor.getInstructionPointer(), code, 0, code.length);
    }
  }

  public String getScreenText() {
    return ((VGACard) getComponent(VGACard.class)).getText();
  }

  public void sendKeysDown(String text) {
    for (char c : text.toCharArray()) {
      int[] keycodes = KeyMapping.getJavaKeycodes(c);
      for (int i = 0; i < keycodes.length; i++)
        keyboard.keyPressed(KeyMapping.getScancode(keycodes[i]));
    }
  }

  public void sendKeysUp(String text) {
    for (char c : text.toCharArray()) {
      int[] keycodes = KeyMapping.getJavaKeycodes(c);
      for (int i = 0; i < keycodes.length; i++)
        keyboard.keyReleased(KeyMapping.getScancode(keycodes[i]));
    }
  }

  public void sendMouse(Integer dx, Integer dy, Integer dz, Integer buttons) {
    keyboard.putMouseEvent(dx, dy, dz, buttons);
  }

  public int[] getState() {
    int[] res = new int[] {processor.r_eax.get32(), processor.r_ecx.get32(),
        processor.r_edx.get32(), processor.r_ebx.get32(), processor.r_esp.get32(),
        processor.r_ebp.get32(), processor.r_esi.get32(), processor.r_edi.get32(), processor.eip,
        processor.getEFlags(), processor.es.getSelector(), processor.cs.getSelector(),
        processor.ss.getSelector(), processor.ds.getSelector(), processor.fs.getSelector(),
        processor.gs.getSelector(), (int) getTicks(), getLimit(processor.es),
        getLimit(processor.cs), getLimit(processor.ss), getLimit(processor.ds),
        getLimit(processor.fs), getLimit(processor.gs),
        (processor.cs.getDefaultSizeFlag() ? 1 : 0)
            | (processor.ss.getDefaultSizeFlag() ? 0x10 : 0),
        getBase(processor.gdtr), getLimit(processor.gdtr), getBase(processor.idtr),
        getLimit(processor.idtr), getBase(processor.ldtr), getLimit(processor.ldtr),
        getBase(processor.es), getBase(processor.cs), getBase(processor.ss), getBase(processor.ds),
        getBase(processor.fs), getBase(processor.gs), processor.getCR0(), 0, 0, 0, 0, 0, 0, 0, 0, 0,
        0, 0, 0, 0, 0, 0, 0,
        // (int)vmClock.nextExpiry()
    };
    double[] fpuStack = processor.fpu.getStack();
    for (int i = 0; i < 8; i++) {
      res[2 * i + 37] = (int) (Double.doubleToRawLongBits(fpuStack[i]) >>> 32);
      res[2 * i + 38] = (int) Double.doubleToRawLongBits(fpuStack[i]);
    }
    return res;
  }

  private int getBase(Segment s) {
    if (s instanceof SegmentFactory.NullSegment) {
      return 0;
    }
    return s.getBase();
  }

  private int getLimit(Segment s) {
    if (s instanceof SegmentFactory.NullSegment) {
      return 0xffff;
    }
    return s.getLimit();
  }

  private long getTicks() {
    for (HardwareComponent component : hardwareComponents)
      if (component instanceof Clock) {
        return ((VirtualClock) component).getTicks();
      }
    return 0;
  }

  public byte[] getCMOS() {
    RTC rtc = (RTC) getComponent(RTC.class);
    return rtc.getCMOS();
  }

  public int[] getPit() {
    IntervalTimer pit = (IntervalTimer) getComponent(IntervalTimer.class);
    return pit.getState();
  }

  public JPanel getNewMonitor() {
    PCMonitor mon = new PCMonitor(this);
    mon.startUpdateThread();
    return mon;
  }

  public Integer savePage(Integer page, byte[] data, Boolean linear) throws IOException {
    if (!linear) {
      return physicalAddr.getPage(page, data);
    }
    return physicalAddr.getPage(
        LinearMemoryViewer.translateLinearAddressToInt(physicalAddr, processor, page), data);
  }

  public void loadPage(Integer page, byte[] data, Boolean linear) throws IOException {
    if (!linear) {
      physicalAddr.setPage(page, data);
    } else {
      physicalAddr.setPage(
          LinearMemoryViewer.translateLinearAddressToInt(physicalAddr, processor, page), data);
    }
  }

  public void triggerSpuriousInterrupt() {
    pic.triggerSpuriousInterrupt();
  }

  public void triggerSpuriousMasterInterrupt() {
    pic.triggerSpuriousMasterInterrupt();
  }

  /**
   * Starts this PC's attached clock instance.
   */
  public void start() {
    running = true;
    vmClock.resume();
    if (Option.sound.value()) {
      AudioLayer.open(Option.mixer_javabuffer.intValue(8820),
          Option.mixer_rate.intValue(SBlaster.OPL_RATE));
    }
  }

  /**
   * Stops this PC's attached clock instance
   */
  public void stop() {
    running = false;
    vmClock.pause();
    if (Option.sound.value()) {
      AudioLayer.stop();
    }
  }

  /**
   * Inserts the specified floppy disk into the drive identified.
   *
   * @param disk new floppy disk to be inserted.
   * @param index drive which the disk is inserted into.
   */
  public void changeFloppyDisk(com.github.smeny.jpc.support.BlockDevice disk, int index) {
    ((FloppyController) getComponent(FloppyController.class)).changeDisk(disk, index);
  }

  private boolean configure() {
    boolean fullyInitialised;
    int count = 0;
    do {
      fullyInitialised = true;
      for (HardwareComponent outer : hardwareComponents) {
        if (outer.initialised()) {
          continue;
        }

        for (HardwareComponent inner : hardwareComponents) {
          outer.acceptComponent(inner);
        }

        fullyInitialised &= outer.initialised();
      }
      count++;
    } while ((fullyInitialised == false) && (count < 100));

    if (!fullyInitialised) {
      StringBuilder sb = new StringBuilder("pc >> component configuration errors\n");
      List<HardwareComponent> args = new ArrayList<HardwareComponent>();
      for (HardwareComponent hwc : hardwareComponents) {
        if (!hwc.initialised()) {
          sb.append("component {" + args.size() + "} not configured");
          args.add(hwc);
        }
      }

      LOGGING.log(Level.WARNING, sb.toString(), args.toArray());
      return false;
    }

    for (HardwareComponent hwc : hardwareComponents) {
      if (hwc instanceof PCIBus) {
        ((PCIBus) hwc).biosInit();
      }
    }

    return true;
  }

  /**
   * Saves the state of this PC and all of its associated components out to the specified stream.
   *
   * @param out stream the serialised state is written to
   * @throws java.io.IOException propogated from the supplied stream.
   */
  public void saveState(OutputStream out) throws IOException {
    LOGGING.log(Level.INFO, "snapshot saving");
    ZipOutputStream zout = new ZipOutputStream(out);
    for (HardwareComponent hwc : hardwareComponents) {
      saveComponent(zout, hwc);
    }

    zout.finish();
    LOGGING.log(Level.INFO, "snapshot done");
  }

  private void saveComponent(ZipOutputStream zip, HardwareComponent component) throws IOException {
    LOGGING.log(Level.FINE, "snapshot saving {0}", component);
    int i = 0;
    while (true) {
      ZipEntry entry = new ZipEntry(component.getClass().getName() + "#" + i);
      try {
        zip.putNextEntry(entry);
        break;
      } catch (ZipException e) {
        if (e.getMessage().matches(".*(duplicate entry).*")) {
          i++;
        } else {
          throw e;
        }
      }
    }

    DataOutputStream dout = new DataOutputStream(zip);
    component.saveState(dout);
    dout.flush();
    zip.closeEntry();
  }

  /**
   * Loads the state of this PC and all of its associated components from the specified stream.
   *
   * @param in stream the serialised data is read from.
   * @throws java.io.IOException propogated from the supplied stream.
   */
  public void loadState(InputStream in) throws IOException {
    LOGGING.log(Level.INFO, "snapshot loading");
    physicalAddr.reset();
    ZipInputStream zin = new ZipInputStream(in);
    Set<HardwareComponent> newParts = new HashSet<HardwareComponent>();
    IOPortHandler ioHandler = (IOPortHandler) getComponent(IOPortHandler.class);
    ioHandler.reset();
    newParts.add(ioHandler);
    try {
      for (ZipEntry entry = zin.getNextEntry(); entry != null; entry = zin.getNextEntry()) {
        DataInputStream din = new DataInputStream(zin);

        String cls = entry.getName().split("#")[0];
        Class clz;
        try {
          clz = Class.forName(cls);
        } catch (ClassNotFoundException e) {
          LOGGING.log(Level.WARNING, "unknown class in snapshot", e);
          continue;
        }
        HardwareComponent hwc = getComponent(clz);
        if (hwc instanceof PIIX3IDEInterface) {
          ((PIIX3IDEInterface) hwc).loadIOPorts(ioHandler, din);
        } else if (hwc instanceof EthernetCard) {
          ((EthernetCard) hwc).loadIOPorts(ioHandler, din);
        } else if (hwc instanceof VirtualClock) {
          ((VirtualClock) hwc).loadState(din, this);
        } else if (hwc instanceof PhysicalAddressSpace) {
          ((PhysicalAddressSpace) hwc).loadState(din, manager);
        } else {
          hwc.loadState(din);
        }

        if (hwc instanceof IODevice) {
          ioHandler.registerIOPortCapable((IODevice) hwc);
        }

        hardwareComponents.remove(hwc);
        newParts.add(hwc);
      }

      hardwareComponents.clear();
      hardwareComponents.addAll(newParts);

      linkComponents();
      LOGGING.log(Level.INFO, "snapshot load done");
      // pciBus.biosInit();
    } catch (IOException e) {
      LOGGING.log(Level.WARNING, "snapshot load failed", e);
      throw e;
    }
  }

  private void linkComponents() {
    boolean fullyInitialised;
    int count = 0;

    do {
      fullyInitialised = true;
      for (HardwareComponent outer : hardwareComponents) {
        if (outer.updated()) {
          continue;
        }

        for (HardwareComponent inner : hardwareComponents) {
          outer.updateComponent(inner);
        }

        fullyInitialised &= outer.updated();
      }
      count++;
    } while ((fullyInitialised == false) && (count < 100));

    if (!fullyInitialised) {
      StringBuilder sb = new StringBuilder("pc >> component linking errors\n");
      List<HardwareComponent> args = new ArrayList<HardwareComponent>();
      for (HardwareComponent hwc : hardwareComponents) {
        if (!hwc.initialised()) {
          sb.append("component {" + args.size() + "} not linked");
          args.add(hwc);
        }
      }
      LOGGING.log(Level.WARNING, sb.toString(), args.toArray());
    }
  }

  public void destroy() {
    for (HardwareComponent hwc : hardwareComponents) {
      if (hwc instanceof DriveSet) {
        ((DriveSet) hwc).close();
      }
    }
  }

  /**
   * Reset this PC back to its initial state.
   * <p>
   * This is roughly equivalent to a hard-reset (power down-up cycle).
   */
  public void reset() {
    for (HardwareComponent hwc : hardwareComponents) {
      hwc.reset();
    }
    configure();
  }

  /**
   * Get an subclass of <code>cls</code> from this instance's hardwareComponents list.
   * <p>
   * If <code>cls</code> is not assignment compatible with <code>HardwareComponent</code> then this
   * method will return null immediately.
   *
   * @param cls component type required.
   * @return an instance of class <code>cls</code>, or <code>null</code> on failure
   */
  public HardwareComponent getComponent(Class<? extends HardwareComponent> cls) {
    if (!HardwareComponent.class.isAssignableFrom(cls)) {
      return null;
    }

    for (HardwareComponent hwc : hardwareComponents) {
      if (cls.isInstance(hwc)) {
        return hwc;
      }
    }
    return null;
  }

  /**
   * Gets the processor instance associated with this PC.
   *
   * @return associated processor instance.
   */
  public Processor getProcessor() {
    return processor;
  }

  public int eipBreak(Integer breakEip) {
    int instrs = 0;
    while (processor.eip != breakEip)
      instrs += executeBlock();
    return instrs;
  }

  public String getInstructionInfo(Integer instrs) {
    StringBuilder b = new StringBuilder();
    int eip = processor.getInstructionPointer();
    for (int c = 0; c < instrs; c++) {
      PeekableMemoryStream input = new PeekableMemoryStream();
      try {
        Instruction in;
        String e;
        if (processor.isProtectedMode()) {
          if (processor.isVirtual8086Mode()) {
            input.set(linearAddr, eip);
            in = Disassembler.disassemble16(input);
            e = Disassembler.getExecutableName(3, in);
          } else {
            input.set(linearAddr, eip);
            boolean opSize = processor.cs.getDefaultSizeFlag();
            if (opSize) {
              in = Disassembler.disassemble32(input);
            } else {
              in = Disassembler.disassemble16(input);
            }
            e = Disassembler.getExecutableName(2, in);
          }
        } else {
          input.set(physicalAddr, eip);
          in = Disassembler.disassemble16(input);
          e = Disassembler.getExecutableName(1, in);
        }
        b.append(in.toString());
        b.append(" == ");
        b.append(e);
        b.append(" == ");
        input.seek(-in.x86Length);
        for (int i = 0; i < in.x86Length; i++)
          b.append(String.format("%02x ", input.read8()));
        b.append("\n");
        eip += in.x86Length;
        if (in.toString().equals("sti")) {
          c--; // do one more instruction
        }
        if (in.isBranch()) {
          break;
        }
      } catch (IllegalStateException e) {
        b.append(e.getMessage());
      }
    }
    return b.toString();
  }

  public void getDirtyPages(Set<Integer> res) {
    physicalAddr.getDirtyPages(res);
  }

  public static String disam(byte[] code, Integer ops, Boolean is32Bit) {
    Disassembler.ByteArrayPeekStream mem = new Disassembler.ByteArrayPeekStream(code);
    StringBuilder b = new StringBuilder();
    for (int i = 0; i < ops; i++) {
      Instruction disam =
          is32Bit ? Disassembler.disassemble32(mem) : Disassembler.disassemble16(mem);
      mem.seek(disam.x86Length);
      b.append(disam.toString() + "\n");
    }
    return b.toString();
  }

  public static Integer x86Length(byte[] code, Boolean is32Bit) {
    Disassembler.ByteArrayPeekStream mem = new Disassembler.ByteArrayPeekStream(code);
    Instruction disam = is32Bit ? Disassembler.disassemble32(mem) : Disassembler.disassemble16(mem);
    return disam.x86Length;
  }

  public int executeBlock() {
    if (processor.isProtectedMode()) {
      if (processor.isVirtual8086Mode()) {
        return executeVirtual8086Block();
      } else {
        return executeProtectedBlock();
      }
    } else {
      return executeRealBlock();
    }
  }

  // returns whether an interrupt was entered
  public boolean checkInterrupts(Integer cycles, Boolean bochsinPitInt) {
    if (!Option.singlesteptime.value()) {
      for (int i = 0; i < cycles; i++)
        vmClock.update(1);
    }
    try {
      if (processor.isProtectedMode()) {
        if (processor.isVirtual8086Mode()) {
          return processor.processVirtual8086ModeInterrupts(0);
        } else {
          return processor.processProtectedModeInterrupts(0, bochsinPitInt);
        }
      } else {
        return processor.processRealModeInterrupts(0, bochsinPitInt);
      }
    } catch (ModeSwitchException e) {
      // System.out.println("Switched mode: "+e.getMessage());
      return true; // must have been triggered by the interrupt handler
    }
  }

  public int executeRealBlock() {
    try {
      int block = physicalAddr.executeReal(processor, processor.getInstructionPointer());
      // staticClockx86Count += block;
      // if (staticClockx86Count >= INSTRUCTIONS_BETWEEN_INTERRUPTS)
      // {
      // //processor.processRealModeInterrupts(staticClockx86Count);
      // // for multi instruction blocks simulate checking interrupts at each instruction
      // // this ensures timers expire the same as in single stepped execution
      // if (!Option.singlesteptime.value())
      // for (int i=0; i < staticClockx86Count; i++)
      // vmClock.update(1);
      // staticClockx86Count = 0;
      // }
      return block;
    } catch (ProcessorException p) {
      processor.handleRealModeException(p);
    } catch (ModeSwitchException e) {
      // uncomment for compare to single stepping or comparing to Bochs...
      // staticClockx86Count += e.getX86Count();
      // if (Option.singlesteptime.value())
      // vmClock.updateAndProcess(1);
      // else if (staticClockx86Count >0)
      // {
      // for (int i=0; i < staticClockx86Count; i++)
      // vmClock.updateAndProcess(1);
      // }
      // else
      // vmClock.updateAndProcess(0);
      // staticClockx86Count = 0;
      LOGGING.log(Level.FINE, "Mode switch in RM @ cs:eip "
          + Integer.toHexString(processor.cs.getBase()) + ":" + Integer.toHexString(processor.eip));
      return e.getX86Count();
    }
    return 0;
  }

  public int executeVirtual8086Block() {
    try {
      int block = linearAddr.executeVirtual8086(processor, processor.getInstructionPointer());
      // staticClockx86Count += block;
      // if (staticClockx86Count >= INSTRUCTIONS_BETWEEN_INTERRUPTS)
      // {
      // //processor.processVirtual8086ModeInterrupts(staticClockx86Count);
      // // for multi instruction blocks simulate checking interrupts at each instruction
      // // this ensures timers expire the same as in single stepped execution
      // if (!Option.singlesteptime.value())
      // for (int i=0; i < staticClockx86Count; i++)
      // vmClock.update(1);
      // staticClockx86Count = 0;
      // }
      return block;
    } catch (ProcessorException p) {
      processor.handleVirtual8086ModeException(p);
    } catch (ModeSwitchException e) {
      // uncomment for compare to single stepping...
      // staticClockx86Count += e.getX86Count();
      // if (Option.singlesteptime.value())
      // vmClock.updateAndProcess(1);
      // else if (staticClockx86Count > 0)
      // {
      // for (int i=0; i < staticClockx86Count; i++)
      // vmClock.updateAndProcess(1);
      // }
      // else
      // vmClock.updateAndProcess(0);
      // staticClockx86Count = 0;
      LOGGING.log(Level.FINE, "Mode switch in VM @ cs:eip "
          + Integer.toHexString(processor.cs.getBase()) + ":" + Integer.toHexString(processor.eip));
      return e.getX86Count();
    }
    return 0;
  }

  public int executeProtectedBlock() {
    try {
      int block = linearAddr.executeProtected(processor, processor.getInstructionPointer());
      // staticClockx86Count += block;
      // if (staticClockx86Count >= INSTRUCTIONS_BETWEEN_INTERRUPTS)
      // {
      // //processor.processProtectedModeInterrupts(staticClockx86Count);
      // // for multi instruction blocks simulate checking interrupts at each instruction
      // // this ensures timers expire the same as in single stepped execution
      // if (!Option.singlesteptime.value())
      // for (int i=0; i < staticClockx86Count; i++)
      // vmClock.update(1);
      // staticClockx86Count = 0;
      // }
      return block;
    } catch (ProcessorException p) {
      processor.handleProtectedModeException(p);
    } catch (ModeSwitchException e) {
      // uncomment for compare to single stepping...
      // staticClockx86Count += e.getX86Count();
      // if (Option.singlesteptime.value())
      // vmClock.updateAndProcess(1);
      // else if (staticClockx86Count >0)
      // {
      // for (int i=0; i < staticClockx86Count; i++)
      // vmClock.updateAndProcess(1);
      // }
      // else
      // vmClock.updateAndProcess(0);
      // staticClockx86Count = 0;
      LOGGING.log(Level.FINE, "Mode switch in PM @ cs:eip "
          + Integer.toHexString(processor.cs.getBase()) + ":" + Integer.toHexString(processor.eip));
      return e.getX86Count();
    }
    return 0;
  }

  /**
   * Execute an arbitrarily large amount of code on this instance.
   * <p>
   * This method will execute continuously until there is either a mode switch, or a unspecified
   * large number of instructions have completed. It should never run indefinitely.
   *
   * @return total number of x86 instructions executed.
   */
  public final int execute() {
    try {
      if (processor.isProtectedMode()) {
        if (processor.isVirtual8086Mode()) {
          return executeVirtual8086();
        } else {
          return executeProtected();
        }
      } else {
        return executeReal();
      }
    } catch (RuntimeException e) {
      System.out.printf("Error at cs:eip = %08x\n", processor.getInstructionPointer());
      System.out.printf("Last exit eip = %08x\n", BasicBlock.lastExitEip);
      // printHistory();
      System.out.println("*****");
      printInsHistory();
      System.out.printf("Error at cs:eip = %08x\n", processor.getInstructionPointer());
      throw e;
    }
  }

  private void printInsHistory() {
    for (int i = historyIndex; i != (historyIndex - 1 + HISTORY_SIZE) % HISTORY_SIZE; i =
        (i + 1) % HISTORY_SIZE) {
      if (prevBlocks[i] == null) {
        continue;
      }
      DebugBasicBlock deb = (DebugBasicBlock) prevBlocks[i];
      // CodeBlock block = prevBlocks[i];
      // if (block instanceof AbstractCodeBlockWrapper)
      // deb =
      // (DebugBasicBlock)(((InterpretedRealModeBlock)((AbstractCodeBlockWrapper)block).getTargetBlock()).b);
      // else
      // System.out.println(block.getClass().getName());
      // Instruction disam = deb.start;
      // int length = disam.x86Length;
      // StringBuilder b = new StringBuilder();
      // while (!disam.isBranch())
      // {
      // b.append(String.format(" %s\n", disam));
      // length += disam.x86Length;
      // disam = disam.next;
      // }
      // b.append(String.format(" %s\n", disam));
      System.out.printf("Block at %08x length: %d\n", ipHistory[i], deb.getX86Length());
      System.out.printf(deb.getDisplayString());
    }
  }

  // private void printHistory()
  // {
  // for (int i = historyIndex; i != (historyIndex-1+HISTORY_SIZE)%HISTORY_SIZE; i =
  // (i+1)%HISTORY_SIZE)
  // {
  // if (ipHistory[i] == 0) continue;
  // int addr = ipHistory[i];
  // Instruction disam = getInstruction(addr); // won't work if there was a recent mode switch
  // int length = disam.x86Length;
  // StringBuilder b = new StringBuilder();
  // while (!disam.isBranch())
  // {
  // b.append(String.format(" %s\n", disam));
  // addr += disam.x86Length;
  // length += disam.x86Length;
  // disam = getInstruction(addr);
  // }
  // b.append(String.format(" %s\n", disam));
  // System.out.printf("Block at %08x length: %d\n", addr, length);
  // System.out.printf(b.toString());
  // }
  // }

  private static void logIP(int cseip) {
    ipHistory[historyIndex % HISTORY_SIZE] = cseip;
    historyIndex++;
    historyIndex %= HISTORY_SIZE;
  }

  public static void logBlock(int cseip, CodeBlock block) {
    logIP(cseip);
    prevBlocks[insHistoryIndex % HISTORY_SIZE] = block;
    insHistoryIndex++;
    insHistoryIndex %= HISTORY_SIZE;
  }

  public final int executeReal() {
    int x86Count = 0;
    int clockx86Count = 0;
    int nextClockCheck = INSTRUCTIONS_BETWEEN_INTERRUPTS;
    try {
      for (int i = 0; i < 100; i++) {
        if (ETHERNET) {
          ethernet.checkForPackets();
        }
        // if (!princeAddrs.contains(processor.getInstructionPointer()))
        // throw new IllegalStateException("new address reached
        // "+Integer.toHexString(processor.getInstructionPointer()));
        int block = physicalAddr.executeReal(processor, processor.getInstructionPointer());
        x86Count += block;
        clockx86Count += block;
        if (x86Count > nextClockCheck) {
          nextClockCheck = x86Count + INSTRUCTIONS_BETWEEN_INTERRUPTS;
          processor.processRealModeInterrupts(clockx86Count);
          clockx86Count = 0;
        }
      }
    } catch (ProcessorException p) {
      System.out.printf("Proc exception %s\n", p);
      processor.handleRealModeException(p);
    } catch (ModeSwitchException e) {
      // State.print(processor);
      // e.printStackTrace();
      LOGGING.log(Level.FINE, "Mode switch in RM @ cs:eip "
          + Integer.toHexString(processor.cs.getBase()) + ":" + Integer.toHexString(processor.eip));
    }
    return x86Count;
  }

  public final int executeProtected() {
    int x86Count = 0;
    int clockx86Count = 0;
    int nextClockCheck = INSTRUCTIONS_BETWEEN_INTERRUPTS;
    try {
      for (int i = 0; i < 100; i++) {
        int block = linearAddr.executeProtected(processor, processor.getInstructionPointer());
        x86Count += block;
        clockx86Count += block;
        if (x86Count > nextClockCheck) {
          nextClockCheck = x86Count + INSTRUCTIONS_BETWEEN_INTERRUPTS;
          if (ETHERNET) {
            ethernet.checkForPackets();
          }
          processor.processProtectedModeInterrupts(clockx86Count);
          clockx86Count = 0;
        }
      }
    } catch (ProcessorException p) {
      processor.handleProtectedModeException(p);
    } catch (ModeSwitchException e) {
      LOGGING.log(Level.FINE, "Mode switch in PM @ cs:eip "
          + Integer.toHexString(processor.cs.getBase()) + ":" + Integer.toHexString(processor.eip));
    }
    return x86Count;
  }

  public final int executeVirtual8086() {
    int x86Count = 0;
    int clockx86Count = 0;
    int nextClockCheck = INSTRUCTIONS_BETWEEN_INTERRUPTS;
    try {
      for (int i = 0; i < 100; i++) {
        int block = linearAddr.executeVirtual8086(processor, processor.getInstructionPointer());
        x86Count += block;
        clockx86Count += block;
        if (x86Count > nextClockCheck) {
          nextClockCheck = x86Count + INSTRUCTIONS_BETWEEN_INTERRUPTS;
          if (ETHERNET) {
            ethernet.checkForPackets();
          }
          processor.processVirtual8086ModeInterrupts(clockx86Count);
          clockx86Count = 0;
        }
      }
    } catch (ProcessorException p) {
      processor.handleVirtual8086ModeException(p);
    } catch (ModeSwitchException e) {
      LOGGING.log(Level.FINE, "Mode switch in VM8086 @ cs:eip "
          + Integer.toHexString(processor.cs.getBase()) + ":" + Integer.toHexString(processor.eip));
    }
    return x86Count;
  }

  public static void main(String[] args) {
    if (args.length == 0) {
      LOGGING.log(Level.INFO, "No configuration specified, using defaults");
      args = getDefaultArguments();

    } else {
      LOGGING.log(Level.INFO, "Using configuration specified on command line");
    }

    if (ArgProcessor.findVariable(args, "compile", "yes").equalsIgnoreCase("no")) {
      compile = false;
    }

    PCBuilder pcBuilder = new PCBuilder().withDrivesFromArgs(args);
    PC pc = pcBuilder.build();
    
    pc.start();
    try {
      while (pc.isRunning()) {
        pc.execute();
      }
    } finally {
      pc.stop();
      LOGGING.log(Level.INFO, "PC Stopped");
      pc.getProcessor().printState();
    }
  }

  private boolean isRunning() {
    return running;
  }

  private static String[] getDefaultArguments() {
    return new String[] {"-fda", "mem:resources/images/floppy.img", "-hda",
        "mem:resources/images/dosgames.img", "-boot", "fda"};
  }

  public static class PCBuilder {

    private final List<HardwareComponent> hardwareComponents;
    private final Clock clock;
    private int systemRamSize;
    private Calendar startTime;

    public PCBuilder() {
      this(new VirtualClock());
    }

    public PCBuilder(Clock clock) {
      this.clock = clock;
      this.hardwareComponents = new LinkedList<>();
      this.systemRamSize = DEFAULT_RAM_SIZE;
      this.startTime = Calendar.getInstance();
    }
    
    public PCBuilder withDrivesFromArgs(String[] args) {
      return withDrives(DriveSet.buildFromArgs(args));
    }

    public PCBuilder withDrives(DriveSet drives) {
      hardwareComponents.add(drives);
      return this;
    }
    
    public PCBuilder withStartTime(Calendar startTime) {
      this.startTime = startTime;
      return this;
    }

    public PCBuilder withSystemRamSize(int sizeInBytes) {
      systemRamSize = sizeInBytes;
      return this;
    }

    public PC build() {
      return new PC(clock, hardwareComponents, systemRamSize, startTime);
    }

  }


}
