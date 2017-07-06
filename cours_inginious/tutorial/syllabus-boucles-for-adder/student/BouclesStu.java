package student;
import java.util.Scanner;
import java.io.*;
public class BoucleStu {
    private Scanner sc;
    /**
     * Exécute un petit programme qui calcule le produit des nombres entrés au terminal par l'utilisateur. Le programme se termine quand l'utilisateur rentre 0, et le produit est affiché sur la sortie standard.
     */
    public static void runAdder() {
        sc = new Scanner(System.in);
        int sum = 0;
        int n = nextInt();
        for (int i = 0; i < n; i++)
            int current = nextInt();
            sum += current;
        }
        System.out.println(sum);
        System.out.println(); // pour s'assurer qu'il y ait un retour à la ligne
    }
    private static int nextInt() {
        try {
            return sc.nextInt();
        } catch (Exception e) {
            System.err.println("Problème lors de la lecture. " + e.getMessage());
            return 0;
        }
    }
}