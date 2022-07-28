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

    }

    public static void main(String[] args) {

    }

}