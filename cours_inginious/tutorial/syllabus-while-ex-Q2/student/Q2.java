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

public class Q2 {
	
	private static String str = "Le code semble comporter des erreurs : ";
	
	@Test
	public void testPos(){
		try{
			int i = 0;
			int sum = 0;
			assertTrue("Factoriel 0 devrais renvoyer 1, mais votre code renvoit "+Q2Stu.fact(i),Q2Stu.fact(0) == 1);
			while(i++ < 20)
			{
				sum = sum +i;
				assertTrue("Factoriel "+i+" devrais renvoyer"+sum+", mais votre code renvoit "+Q2Stu.fact(i),Q2Stu.fact(i) == sum);
			}

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
		Result result = JUnitCore.runClasses(Q2.class);
		for (Failure failure: result.getFailures()) {
			System.err.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("Tous les tests se sont passés sans encombre");
			System.exit(127);
		}
	}
}
