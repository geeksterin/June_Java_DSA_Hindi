import java.util.*;

public class file {

    public static int countLowerCase(String str) {
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                count++;
        }

        return count;
    }

    public static int countUpperCase(String str) {
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                count++;
        }

        return count;
    }

    // aBCdghi -> ABCDGHI
    public static String allLowerCaseToUpperCase(String str) {
        StringBuilder ans = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ans.append((char) (ch - 'a' + 'A'));
            } else {
                ans.append(ch);
            }
        }

        return ans.toString(); // O(n)
    }

    // aBCdghi -> abcdghi
    public static String allUpperCaseToLowerCase(String str) {
        StringBuilder ans = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ans.append((char) (ch - 'A' + 'a'));
            } else {
                ans.append(ch);
            }
        }

        return ans.toString(); // O(n)
    }

    // aBCdghi -> AbcDGHI
    public static String toggleCase(String str) {
        StringBuilder ans = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ans.append((char) (ch - 'A' + 'a'));
            } else if (ch >= 'a' && ch <= 'z') {
                ans.append((char) (ch - 'a' + 'A'));
            }
        }

        return ans.toString();
    }

    // 520
    public boolean isCapital(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }

    public boolean detectCapitalUse(String str) {
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (isCapital(ch))
                count++;
        }

        if (count == n || count == 0)
            return true;
        else if (count == 1 && isCapital(str.charAt(0)))
            return true;

        return false;
    }

    // 2129

}