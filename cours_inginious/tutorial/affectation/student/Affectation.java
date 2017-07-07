/*
#   Copyright (c) 2017 Mottet Sebastien et Fitvoye Florian
#   This program is free software: you can redistribute it and/or modify
#   it under the terms of the GNU Affero General Public License as published by
#   the Free Software Foundation, either version 3 of the License, or
#   (at your option) any later version.
#
#   This program is distributed in the hope that it will be useful,
#   but WITHOUT ANY WARRANTY; without even the implied warranty of
#   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
#   GNU Affero General Public License for more details.
#
#   You should have received a copy of the GNU Affero General Public License
#   along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/
package student;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.Failure;

public class Affectation{
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void test(){
		try{
           	Object obj[] = AffectationStu.getAns();
            float goodAnsF = 3.14F;
            char goodAnsC = 'q';
            long goodAnsL = 0;
            float AnsF = (float)obj[0];
            long AnsL = (long)obj[1];
            char AnsC = (char)obj[2];
            assertEquals("Ce n'est pas la valeur de pi attendue\n",goodAnsF,AnsF,0.01);
            
            assertEquals("Ce n'est pas la bonne lettre\n",goodAnsC,AnsC);
            assertEquals("Ce n'est pas la valeur de popWorld attendue\n",goodAnsL,AnsL);
			 
		}catch (ArithmeticException e){
			fail(str + "Le code est incorrect : il est interdit de diviser par zéro.");
			e.printStackTrace();
		}catch(ClassCastException e){
			fail(str + "Attention, vous avez utilisé un mauvais type !");
			e.printStackTrace();
		}catch(StringIndexOutOfBoundsException e){
			e.printStackTrace();
			fail(str + "Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)");
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e){
			e.printStackTrace();
			fail(str + "Attention, vous tentez de lire en dehors des limites d'un tableau ! (ArrayIndexOutOfBoundsException)");
			e.printStackTrace();
		}catch(NullPointerException e){
			fail(str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
			e.printStackTrace();
		}catch(Exception e){
			fail(str + "\n");
			e.printStackTrace();
		}
	}
	
	// Code verificateur
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Affectation.class);
		for (Failure failure: result.getFailures()) {
       
			System.err.println(failure.toString().split("\n")[0]);
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}