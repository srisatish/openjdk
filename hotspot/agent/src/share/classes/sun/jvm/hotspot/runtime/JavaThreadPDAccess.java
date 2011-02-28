/*
 * Copyright (c) 2000, 2003, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 *
 */

package sun.jvm.hotspot.runtime;

import java.io.*;
import java.util.*;
import sun.jvm.hotspot.debugger.*;
import sun.jvm.hotspot.oops.*;
import sun.jvm.hotspot.types.*;
import sun.jvm.hotspot.utilities.*;

public interface JavaThreadPDAccess {
  public    Address getLastJavaFP(Address addr);
  public    Address getLastJavaPC(Address addr);
  public    Address getBaseOfStackPointer(Address addr);
  public    Frame getLastFramePD(JavaThread thread, Address addr);
  public    RegisterMap newRegisterMap(JavaThread thread, boolean updateMap);
  public    Frame getCurrentFrameGuess(JavaThread thread, Address addr);
  public    void printThreadIDOn(Address addr, PrintStream tty);
  public    void printInfoOn(Address threadAddr, PrintStream tty);
  public    Address getLastSP(Address addr);
  public    ThreadProxy getThreadProxy(Address addr);
}
