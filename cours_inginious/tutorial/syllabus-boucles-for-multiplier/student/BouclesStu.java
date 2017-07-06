package student;
import java.util.Scanner;
import java.io.*;
public class BoucleStu {
    private Scanner sc;
    /**
     * Exécute un petit programme qui calcule le produit des nombres entrés au terminal par l'utilisateur. Le programme se termine quand l'utilisateur rentre 0, et le produit est affiché sur la sortie standard.
     */
    public static void runMultiplier() {
        sc = new Scanner(System.in);
        int mult = 1;
        int current = 0;
        do {
            current = nextInt();
            if (current != 0)
                mult *= current;
        } while (current != 0);
        System.out.println(mult);
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