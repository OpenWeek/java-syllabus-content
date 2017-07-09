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
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;
import org.junit.runner.notification.Failure;

public class CH4Q2 {

	private static String str = "Le code comporte des erreurs :\n";

    /**
     * Vérification du programme avec des nombres parfaits.
     */
	@Test
	public void testPerfects() {
		try {
			int[] perfects = {6, 28, 496, 8128, 33550336};
            for (int n : perfects) {
                boolean res = CH4Q2Stu.isPerfect(n);
                assertEquals(str + "Le nombre " + n + " est parfait, mais votre programme l'affirme comme ne l'étant pas.", res, true);
            }
		} catch (ArithmeticException e) {
			fail(str + "Le code est incorrect : il est interdit de diviser par zéro.");
			e.printStackTrace();
		} catch(ClassCastException e) {
			fail(str + "Attention, certaines variables ont été mal castées (converties)	!");
			e.printStackTrace();
		} catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
			fail(str + "Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)");
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			fail(str + "Attention, vous tentez de lire en dehors des limites d'un tableau ! (ArrayIndexOutOfBoundsException)");
			e.printStackTrace();
		} catch(NullPointerException e) {
			fail(str + "Attention, vous faites une opération sur un objet qui vaut null ! Veillez à bien gérer ce cas.");
			e.printStackTrace();
		} catch(Exception e) {
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}

    /**
     * Vérification du programme avec des nombres non parfaits.
     */
    @Test
	public void testNonPerfects() {
		try {
			int[] perfects = {0, 1, 2, 5, 8, 12, 20, 30, 37, 42, 2048};
            for (int n : perfects) {
                boolean res = CH4Q2Stu.isPerfect(n);
                assertEquals(str + "Le nombre " + n + " n'est pas parfait, mais votre programme l'affirme comme l'étant.", res, false);
            }
		} catch (ArithmeticException e) {
			fail(str + "Le code est incorrect : il est interdit de diviser par zéro.");
			e.printStackTrace();
		}catch(ClassCastException e){
			fail(str + "Attention, certaines variables ont été mal castées (converties)	!");
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
			fail(str + "\n" + e.getMessage());
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(CH4Q2.class);
		for (Failure failure : result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombres !");
			System.exit(127);
		}
	}
}
