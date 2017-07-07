package student;
public class CH4Q3Stu {
    public static void printSum(int n, int m) {
        /*
         * Effectue la somme sur chaque ligne des n premiers nombres multiples de 1, 2, 3, ..., m
         */
        for (int i = 0; i <= m; i++) {
            int sum = 0;
            for (int j = 0; j <= n; j++) {
                sum = sum + j * i;
            }
            System.out.println("Somme des " + n + " premiers nombres multiples de " + i + " : " + sum);
        }
    }
}
