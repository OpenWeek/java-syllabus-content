/**
 *  Copyright (c) 2017 Alexandre Fiset, Fitvoye Florian
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
import java.util.*;
import java.io.*;
import java.math.*;


public class CH4Q6Stu {

    int turn = 0;
    int nDoors; // nombres de portes
    int door; // numéro de la porte à choisir
    public CH4Q6Stu(int nDoors, int door)
    {
        this.nDoors = nDoors;
        this.door = door;
    }

    // Solution de la question
    public int jeux(){
        int candidateDoor = -42;
        char c = 'a';
        int lower = 0, upper = nDoors;
        int nLoops = 0;
        while ((lower + 1) < upper && nLoops < 10) {
            nLoops++;
            int mid = (lower + upper) / 2;
            c = isDoor(mid);
            System.err.println(lower + " " + mid + " " + upper + " : " + c);
            if (c == 'r')
                //upper = mid;
                lower = mid;
            else if (c == 'l')
                //lower = mid;
                upper = mid;
            else if (c == '!') {
                lower = mid;
                System.err.println("Trouvé !");
                break;
            }
        }
        candidateDoor = lower;
        return candidateDoor;
    }

    public char isDoor(int n)
    {
        turn ++;
        if(n == door)
        {
            return '!';
        }
        else if(n>door)
        {
            return 'l';
        }
        return 'r';
    }
}
