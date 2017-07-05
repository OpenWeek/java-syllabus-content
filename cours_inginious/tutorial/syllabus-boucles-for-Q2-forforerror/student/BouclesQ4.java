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

public class BouclesQ4 {

    private static String str = "Le code semble comporter des erreurs :\n";

    @Test
    public void verifierPrint1() {
        try {
            /* Code permettant d'exécuter un sous-processus.
             * Je ne le garde que parce que j'ai peur de ne plus le retrouver quand j'en aurai besoin.
            Process p = Runtime.getRuntime().exec("ls -al");
            BufferedReader bf1 = new BufferedReader(new InputStreamReader(p.getInputStream()));
            BufferedReader bf2 = new BufferedReader(new InputStreamReader(p.getErrorStream()));
            p.waitFor();
            System.err.println("Return value " + p.exitValue());
            String temp = null;
            System.err.println("Start of output");
            while ((temp = bf1.readLine()) != null) {
                System.err.println("\t" + temp);
            }
            System.err.println("End of output, start of error");
            while ((temp = bf2.readLine()) != null) {
                System.err.println("\t" + temp);
            }
            System.err.println("End of error");*/
            PrintStream ps = new PrintStream("student/output.txt");
            System.setOut(ps);
            BouclesQ4Stu.printSum(17, 6); // ça devrait suffir
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
            BouclesQ4Stu.printSum(5, 0);
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
            BouclesQ4Stu.printSum(0, 5);
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
        Result res = JUnitCore.runClasses(BouclesQ4.class);
        for (Failure fail : res.getFailures()) {
            System.err.println(fail.toString());
        }
        if (res.wasSuccessful()) {
            System.out.println("Tous les tests se sont passés sans encombre.");
            System.exit(127);
        }
    }
}