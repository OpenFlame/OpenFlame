/*
 * The OpenFlame Project <http://stuartmscott.github.io/OpenFlame/>.
 *
 * Copyright (C) 2015 OpenFlame Project
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package internalrep.assembly.controlflow;


public class Jez extends Jump {

    public Jez(int conditionRegister, String destination, String comment) {
        super(EZ, conditionRegister, destination, comment);
        // if conditionRegister contains 0, program flow will be directed to label destination
    }

    public String toString() {
        return "jez r" + mConditionRegister + " " + mDestination + super.toString();
    }

}
