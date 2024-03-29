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
        // jvdskfd sjakfdsj kd sadgsa fdc -> 4
        String str = scn.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void printAlternateString(String str) {
        int n = str.length();
        for (int i = 1; i < n; i += 2) {
            System.out.print(str.charAt(i));
        }
    }

    public static void isMultipleOf3AndPrintAll3LenStrings(String str) {
        int n = str.length();
        System.out.println((n % 3 == 0 ? "Yes" : "No"));

        int idx = 0;
        while (n >= 3) {
            System.out.println(str.substring(idx, idx + 3));
            idx += 3;
            n -= 3;
        }

    }

    public static void main(String[] args) {

    }

}