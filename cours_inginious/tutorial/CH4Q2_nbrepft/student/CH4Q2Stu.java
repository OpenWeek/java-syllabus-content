/**
 *  Copyright (c) 2017 Jean-Martin Vlaeminck, Alexandre Fiset, Florian Fitvoye
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package student;

public class CH4Q2Stu {

    /*
     * Fonction à tester
     */
	public static boolean isPerfect(int n) {
		int nombre = n;
        boolean isPerfect = false;
        if (n <= 0)
            isPerfect = false;
        else {
            // lolilol
            int sum = 0;
            for (int i = 1; i < n; i+=)
                if (n % i == 0)
                    sum += i;
            isPerfect = (sum == n);
        }
        return isPerfect;
	}
}
