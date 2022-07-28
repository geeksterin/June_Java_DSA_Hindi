import java.util.*;

public class l001 {
    public static Scanner scn = new Scanner(System.in);

    public static boolean isSmallVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isLargeVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    // 'a', 'e', 'i', 'o', 'u'
    public static int countVowles(String str) {
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (isSmallVowel(ch) || isLargeVowel(ch))
                count++;
        }
        return count;
    }

    public static int countConst(String str) {
        return str.length() - countVowles(str);
    }

    public static int countConst_02(String str) {
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (!isSmallVowel(ch) && !isLargeVowel(ch))
                count++;
        }
        return count;
    }

    public static void printReverseString(String str) {
        int n = str.length();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }

    public static int countSpace() {
        String str = <-Input;
        //jvdskfd sjakfdsj kd sadgsa fdc -> 4

    }

    public static void printAlternateString(String str) {
        int n = str.length();
        for (int i = 1; i < n; i += 2) {
            System.out.print(str.charAt(i));
        }
    }

    public static void main(String[] args) {

    }

}