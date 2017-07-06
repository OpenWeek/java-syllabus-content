/**
 *  Copyright (c) 2015, 2016 Fitvoye Florian, Dubray Alexandre, Antoine Habran, Maxime Mawait, William Visée.
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package student;

public class Transpos 
{
    public static int[][] Transpos(int[][] tab)
    {
        if(tab==null||tab.length==0)
			return tab;

		int[][] res = new int[tab.length][tab[0].length];
        
        int i = 0;
        int j = 0;
 
	    for(i = 0; i < tab.length; i++)
	    {
	        for(j = 0; j < res.length; j++)
	        {
	    	    res[j][i] = tab[i][j];
	        }
	    }
	    return res;
    }
}