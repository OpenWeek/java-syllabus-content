package student;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.Test;
import java.util.Random;
import org.junit.runner.notification.Failure;
import java.util.*;
import java.io.PrintStream;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.IOException;

public class Boucle {
    private static String str = "Le code semble comporter des erreurs :\n";

    public void testAdder(int testNumber, String expectedResult) {
        try {
            PrintStream ps = new PrintStream("student/output" + testNumber + ".txt");
            System.setOut(ps);
            InputStream is = new FileInputStream("student/input" + testNumber + ".txt");
            System.setIn(is);
            BoucleStu.runAdder();
            ps.close();
            is.close();
            BufferedReader bf = new BufferedReader(new FileReader("student/output" + testNumber + ".txt"));
            String actualResult = bf.readLine();
            bf.close();
            assertEquals(str + "Votre programme n'a pas calculé la bonne somme : il devait afficher <" + expectedResult + "> mais a affiché <" + actualResult + ">\n", expectedResult.equals(actualResult), true);
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
        } catch (IOException e) {
            e.printStackTrace();
            fail(str + "Problème d'entrées-sorties. Prévenez les administrateurs, il y a un bug.");
        } catch (Exception e) {
           	 fail(str + "Vous avez fait l'erreur suivante : " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Test
    public void testAdder1() {
        testAdder(1, "14");
    }
    @Test
    public void testAdder2() {
        testAdder(2, "0");
    }
    @Test
    public void testAdder3() {
        testAdder(3, "0");
    }
    @Test
    public void testAdder4() {
        testAdder(4, "-7");
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Boucle.class);
        for (Failure failure : result.getFailures())
            System.err.println(failure.toString());
        if (result.wasSuccessful()) {
            System.out.println("Tous les tests se sont passés sans concombre ;-).");
            System.exit(127);
        }
    }
}