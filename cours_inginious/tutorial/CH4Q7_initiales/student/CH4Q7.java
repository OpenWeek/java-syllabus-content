/**
 *  Copyright (c) 2017 Alexandre Fiset, Florian Fitvoye, Jean-Martin Vlaeminck
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

public class CH4Q7 {
    private static String str = "Le code semble comporter des erreurs :\n";

    public void testInitials(String s1, String s2) {
        try {
            PrintStream ps = new PrintStream("student/output.txt");
            System.setOut(ps);
            CH4Q7Stu.printInitials(s1);
            ps.close();
            BufferedReader bf = new BufferedReader(new FileReader("student/output.txt"));
            String s = bf.readLine();
            assertEquals(str + "Vous deviez afficher <" + s2 + "> mais vous avez affiché <" + s + ">\n", s2, s);
            bf.close();
        } catch (ArithmeticException e) {
            fail(str + "Il est interdit de diviser par zéro !");
            e.printStackTrace();
        } catch (ClassCastException e) {
            fail(str + "Certaines variables ont été mal castées.");
            e.printStackTrace();
        } catch (StringIndexOutOfBoundsException e) {
            fail(str + "Vous tentez de lire en dehors des limites d'une chaine de caractères.");
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            fail(str + "Vous tentez de lire en dehors des limites d'une chaine de caractères.");
            e.printStackTrace();
        } catch (NullPointerException e) {
            fail(str + "Vous faites une opération sur un objet qui est null. Veuillez à bien gérer ce cas.");
            e.printStackTrace();
        } catch (Exception e) {
           	 fail(str + "Vous avez fait l'erreur suivante : " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void testInitials1() {
        testInitials("Jean Didier Legat", "JDL");
    }
    @Test
    public void testInitials2() {
        testInitials("Jean-Didier Legat", "JL");
    }
    @Test
    public void testInitials3() {
        testInitials("Abracadabra", "A");
    }
    @Test
    public void testInitials4() {
        testInitials("J'aime la programmation", "Jlp");
    }
    @Test
    public void testInitials5() {
        testInitials(" ", " ");
    }
    @Test
    public void testInitials6() {
        testInitials("", "");
    }
    @Test
    public void testInitials7() {
        testInitials("Salut    à tous !", "S   àt!");
    }
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CH4Q7.class);
        for (Failure f : result.getFailures())
            System.err.println(f.toString());
        if (result.wasSuccessful()) {
            System.out.println("Tous les tests se sont déroulés sans encombre.");
            System.exit(127);
        }
    }
}
