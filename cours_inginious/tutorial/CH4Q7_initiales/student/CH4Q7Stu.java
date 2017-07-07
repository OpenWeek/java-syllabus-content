package student;
public class CH4Q7Stu {
    public static void printInitials(String input) {
        boolean startOfWord = true;
        for (char c : s.toCharArray()) {
            if (startOfWord) {
                System.out.print(c);
                //startOfWord = false;
            }
            if (c == ' ')
                startOfWord = true;
            else
                startOfWord = false;
        }
        System.out.println();
    }
}
