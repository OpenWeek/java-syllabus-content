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

    // Code a verifier
    public int jeux(){
        int candidateDoor = -42;
        @@q1@@
        return candidateDoor;
    }

    public char isDoor(int suggestion)
    {
        turn ++;
        if (suggestion == door)
        {
            return '!';
        }
        else if (suggestion > door) // l'étudiant a visé à droite
        {
            return 'l';
        }
        else // suggestion < door : l'étudiant a visé à gauche
        {
            return 'r';
        }
    }
}
