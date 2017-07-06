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

public class Q3 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void testPos(){
		try{
			Q3Stu one = new Q3Stu(10);
			assertEquals("votre code ne fonctionne pas pour chercher la porte 10 dans un set de 40 portes",one.jeux(40),10);
			Q3Stu two = new Q3Stu(0);
			assertEquals("votre code ne fonctionne pas pour chercher la porte 0 dans un set de 40 portes",two.jeux(40),0);
			Q3Stu three = new Q3Stu(39);
			assertEquals("votre code ne fonctionne pas pour chercher la porte 40 dans un set de 40 portes",three.jeux(40),39);
			Q3Stu four = new Q3Stu(10);
			int err = four.jeux(20);
			assertEquals("votre code n'utilise pas une recher par bissection",four.turn,1);
			Q3Stu five = new Q3Stu(30);
			err = five.jeux(40);
			assertEquals("votre code n'utilise pas une recher par bissection",five.turn,2);
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
		Result result = JUnitCore.runClasses(Q3.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
