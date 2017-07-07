package student;

public class CH4Q2Stu {

    /*
     * Fonction à tester
     */
	public static boolean isPerfect(int n) {
		int nombre = n;
        boolean isPerfect = false;
        if (n <= 0)
            isPerfect = false;
        else {
            // lolilol
            int sum = 0;
            for (int i = 1; i < n; i+=)
                if (n % i == 0)
                    sum += i;
            isPerfect = (sum == n);
        }
        return isPerfect;
	}
}
