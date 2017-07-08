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
import java.util.Scanner;
import java.io.*;
public class CH4Q9Stu {
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
