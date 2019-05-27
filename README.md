# JPC Redux
A fork from the original JPC project
-----
The JPC project was originally started in the Particle Physics department of Oxford university by Dr Rhys Newman and Dr Jeff Tseng. The original team included Chris Dennis, Ian Preston, Mike Moleschi and Guillaume Kirsch.

The current team of the official project includes Ian Preston and Kevin O'Dwyer.\
Original source code available at: https://github.com/ianopolous/JPC

### Purpose of this fork
* Learn the x86 architecture more in details
* Learn from an existing x86 simulator written in Java rather then starting from scratch
* Apply industry coding standards and practices (where possible)

### Running
To get started with JPC just run it with:\
`java -jar JPCApplication.jar -boot hda -hda yourdiskimage.img`\
or get a list of options by running:\
`java -jar JPCApplication.jar -help`

To run some dos games easily, put them in a directory on your real computer and use JPC's ability to view a directory tree as a virtual FAT32 drive. For example, if some games are in "dosgames" in the directory where you expanded all the JPC files then type:\
`java -jar JPCApplication.jar -boot fda -fda resources/images/floppy.img -hda dir:dosgames`

This won't save any writes you make to the virtual FAT32 drive. If you would like to sync write to the underlying files, run with -hda dir:sync:dosgames

### Debugger
The JPC debugger allows you to run x86 code step by step, use breakpoints, memory watchpoints, directly view the memory, cpu state etc in a nice colourful GUI.
Once you've set your disks in the debugger (you can pass command line options identical to the Application or just use the menus), click "create new pc" in the File menu. Then to start execution click "start" in the run menu.
![Debugger](/resources/debugger.png)

### Credits
* The BIOS used in JPC is the Bochs BIOS\
http://bochs.sourceforge.net/
* The VGA BIOS used in JPC is the Plex86/Bochs LGPL'd bios\
http://www.nongnu.org/vgabios
* The test Floppy image "floppy.img" is from the Odin FreeDOS project\
http://odin.fdos.org/

> Please note that the current code is not compiling because of ongoing refactoring.
I will update this notice as soon as the project is building again.
For a stable version please consult the original project repository.
