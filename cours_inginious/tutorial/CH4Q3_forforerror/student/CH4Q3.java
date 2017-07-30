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
import org.junit.runner.notification.Failure;
import java.util.*;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.IOException;

public class CH4Q3 {

    private static String str = "Le code semble comporter des erreurs :\n";

    @Test
    public void verifierPrint1() {
        try {
            PrintStream ps = new PrintStream("student/output.txt");
            System.setOut(ps);
            CH4Q3Stu.printSum(17, 6);
            ps.close();
            assertEquals("Votre programme n'affiche pas la bonne sortie", true, filesEquals("student/output.txt", "student/corr_output1.txt"));
        } catch(IOException e) {
            e.printStackTrace();
            fail("Attention, votre programme affiche un résultat trop grand, ou n'a pas pu s'exécuter.");
        } catch (ArithmeticException e) {
            fail(str + "Le code est incorrect : il est interdit de diviser par zéro.");
            e.printStackTrace();
        } catch(ClassCastException e) {
            fail(str + "Attention, certaines variables ont été mal castées	!");
            e.printStackTrace();
        } catch(StringIndexOutOfBoundsException e) {
            fail(str + "Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)");
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException e) {
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

    @Test
    public void verifierPrint2() {
        try {
            PrintStream ps = new PrintStream("student/output.txt");
            System.setOut(ps);
            CH4Q3Stu.printSum(5, 0);
            ps.close();
            assertEquals("Votre programme n'affiche pas la bonne sortie", true, filesEquals("student/output.txt", "student/corr_output2.txt"));
        } catch(IOException e) {
            e.printStackTrace();
            fail("Attention, votre programme affiche un résultat trop grand, ou n'a pas pu s'exécuter.");
        } catch (ArithmeticException e) {
            fail(str + "Le code est incorrect : il est interdit de diviser par zéro.");
            e.printStackTrace();
        } catch(ClassCastException e) {
            fail(str + "Attention, certaines variables ont été mal castées	!");
            e.printStackTrace();
        } catch(StringIndexOutOfBoundsException e) {
            fail(str + "Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)");
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException e) {
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

    @Test
    public void verifierPrint3() {
        try {
            PrintStream ps = new PrintStream("student/output.txt");
            System.setOut(ps);
            CH4Q3Stu.printSum(0, 5);
            ps.close();
            assertEquals("Votre programme n'affiche pas la bonne sortie", true, filesEquals("student/output.txt", "student/corr_output3.txt"));
        } catch(IOException e) {
            e.printStackTrace();
            fail("Attention, votre programme affiche un résultat trop grand, ou n'a pas pu s'exécuter.");
        } catch (ArithmeticException e) {
            fail(str + "Le code est incorrect : il est interdit de diviser par zéro.");
            e.printStackTrace();
        } catch(ClassCastException e) {
            fail(str + "Attention, certaines variables ont été mal castées	!");
            e.printStackTrace();
        } catch(StringIndexOutOfBoundsException e) {
            fail(str + "Attention, vous tentez de lire en dehors des limites d'un String ! (StringIndexOutOfBoundsException)");
            e.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException e) {
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

    public static boolean filesEquals(String s1, String s2) throws IOException {
        BufferedReader f1 = new BufferedReader(new FileReader(s1));
        BufferedReader f2 = new BufferedReader(new FileReader(s2));
        String l1 = null, l2 = null;
        boolean correct = true;
        while (correct && (l1 = f1.readLine()) != null && (l2 = f2.readLine()) != null) {
            if (!l1.equals(l2)) {
                correct = false;
                break;
            }
        }
        f1.close();
        f2.close();
        return correct;
    }

    public static void main(String[] args) {
        Result res = JUnitCore.runClasses(CH4Q3.class);
        for (Failure fail : res.getFailures()) {
            System.err.println(fail.toString());
        }
        if (res.wasSuccessful()) {
            System.out.println("Tous les tests se sont passés sans encombre.");
            System.exit(127);
        }
    }
}
