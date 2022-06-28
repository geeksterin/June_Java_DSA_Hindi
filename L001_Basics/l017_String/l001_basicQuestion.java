import java.util.*;

public class l001_basicQuestion {

    public static Scanner scn = new Scanner(System.in);

    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i))
                count++;
        }

        return count;
    }

    public static void printSmallUpperCase(String str) {
        int smallCaseChar = 0, upperCaseChar = 0;
        // code
        System.out.println("Small Character Count: " + smallCaseChar);
        System.out.println("Upper Character Count: " + upperCaseChar);
    }

    // abADv -> ABadV
    public static String caseConversion(String str) {
        
    }

    public static void main(String[] args) {
        String str = scn.nextLine();
        char ch = scn.next().charAt(0);

        System.out.println(countChar(str, ch));
    }

}