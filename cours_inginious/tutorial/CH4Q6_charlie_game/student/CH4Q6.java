/**
 *  Copyright (c) 2017 Alexandre Fiset, Florian Fitvoye
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
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import org.junit.runner.notification.Failure;

public class CH4Q6 {

    private static String str = "Le code semble comporter des erreurs : ";

    @Test
    public void testPos(){
        try{
            CH4Q6Stu one = new CH4Q6Stu(40, 10);
            int rep = one.jeux();
            assertTrue("Votre code ne fonctionne pas pour chercher la porte 10 dans un set de 40 portes. Porte renvoyée : " + rep, rep == 10);
            assertTrue("Votre code n'utilise pas une recherche par bissection : vous avez utilisé trop de coups (" + one.turn +").", one.turn < 3);
            CH4Q6Stu two = new CH4Q6Stu(40, 0);
            rep = two.jeux();
            assertTrue("Votre code ne fonctionne pas pour chercher la porte 0 dans un set de 40 portes. Porte renvoyée : " + rep, rep == 0);
            assertTrue("Votre code n'utilise pas une recherche par bissection : vous avez utilisé trop de coups (" + two.turn +").", two.turn < 10);
            CH4Q6Stu three = new CH4Q6Stu(40, 39);
            rep = three.jeux();
            assertTrue("Votre code ne fonctionne pas pour chercher la porte 39 dans un set de 40 portes Porte renvoyée : " + rep, rep == 39);
            CH4Q6Stu four = new CH4Q6Stu(40, 10);
            rep = four.jeux();
            assertTrue("Votre code n'utilise pas une recher par bissection",four.turn < 3);
            CH4Q6Stu five = new CH4Q6Stu(40, 30);
            rep = five.jeux();
            assertTrue("Votre code n'utilise pas une recher par bissection", five.turn < 4);
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
            e.printStackTrace();
            fail(str + "Attention, vous tentez de lire en dehors des limites d'un tableau ! (ArrayIndexOutOfBoundsException)");
            e.printStackTrace();
        }catch(NullPointerException e){
            fail(str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
            e.printStackTrace();
        }catch(NumberFormatException e){
            fail(str + "Il fallait renvoyer un entier !");
            e.printStackTrace();
        }catch(Exception e){
            fail(str + "\n" + e.getMessage());
            e.printStackTrace();
        }
    }

    // Code verificateur
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CH4Q6.class);
        for (Failure failure: result.getFailures()) {
            System.err.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("Tous les tests se sont passés sans encombre");
            System.exit(127);
        }
    }
}
