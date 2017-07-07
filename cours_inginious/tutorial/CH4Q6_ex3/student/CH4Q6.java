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
			CH4Q6Stu one = new CH4Q6Stu(10);
			assertTrue("Votre code ne fonctionne pas pour chercher la porte 10 dans un set de 40 portes. Porte renvoyée : "+one.jeux(40),one.jeux(40) == 10);
			CH4Q6Stu two = new CH4Q6Stu(0);
			assertTrue("Votre code ne fonctionne pas pour chercher la porte 0 dans un set de 40 portes. Porte renvoyée : "+two.jeux(40),two.jeux(40) == 0);
			CH4Q6Stu three = new CH4Q6Stu(39);
			assertTrue("Votre code ne fonctionne pas pour chercher la porte 39 dans un set de 40 portes Porte renvoyée : "+three.jeux(40),three.jeux(40) == 39);
			CH4Q6Stu four = new CH4Q6Stu(10);
			int err = four.jeux(20);
			assertTrue("Votre code n'utilise pas une recher par bissection",four.turn == 1);
			CH4Q6Stu five = new CH4Q6Stu(30);
			err = five.jeux(40);
			assertTrue("Votre code n'utilise pas une recher par bissection",five.turn == 2);
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
