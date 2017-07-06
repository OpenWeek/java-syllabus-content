/**
 *  Copyright (c) 2015, 2016 Fitvoye Florian, Dubray Alexandre, Antoine Habran
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
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.Failure;

public class Transpos {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void testTranspos(){
		try{
        	assertNull("n'oubliez pas ou le cas ou le parametre est null",TransposStu.transpos(null));
            int[][] a = { {17,43,32},{98,5,13},{7,8,9} };
            int[][] b = TransposStu.transpos(a);
            int[][] c = MyTranspos(a);
            for(int i = 0;i<a.length;i++)
            {
                assertArrayEquals("le tableau retourne par Transpos({ {17,43,32},{98,5,13},{7,8,9} }) est incorrect",b[i],c[i]);
            }
            
            a = new int[0][0];
            b = TransposStu.transpos(a);
            assertArrayEquals("le tableau renvoye par Transpos([][]) (un tableau vide) est incorrect",a,b);
            
		}catch (ArithmeticException e){
			fail(str + "Le code est incorrect : il est interdit de diviser par zéro.");
			e.printStackTrace();
		}catch(ClassCastException e){
			fail(str + "Attention, certaines variables ont été mal castées	!");
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
			fail(str + "Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			//e.printStackTrace();
			fail(str + "Attention, vous tentez de lire en dehors des limites d'un tableau ! (ArrayIndexOutOfBoundsException)");
			//e.printStackTrace();
		}catch(NullPointerException e){
			fail(str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
			e.printStackTrace();
		}catch(Exception e){
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}
    
    //correction de l'exercice pour vérifier.
    public int[][] MyTranspos(int[][] tab)
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
    
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Transpos.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
