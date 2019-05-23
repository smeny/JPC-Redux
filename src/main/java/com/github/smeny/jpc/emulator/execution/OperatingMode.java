/*
    JPC: An x86 PC Hardware Emulator for a pure Java Virtual Machine

    Copyright (C) 2015 Stephane Meny

    This program is free software; you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation; either version 2 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License along
    with this program; if not, write to the Free Software Foundation, Inc.,
    51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.github.smeny.jpc.emulator.execution;

public enum OperatingMode {
  REAL_MODE("rm"),
  PROTECTED_MODE("pm"),
  VIRTUAL_8086_MODE("vm");

  private final String value;

  OperatingMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

}
