import java.util.*;

public class l002_StringBasics {

    public static Scanner scn = new Scanner(System.in);

    public static void test1(String str) {
        char ch = str.charAt(2);
        int len = str.length();
        str += "bye";
        String s = str.substring(3, 7 + 1);
        String s2 = str.substring(3);
        System.out.println(s2);
    }

    // https://codingbat.com/prob/p151940
    public String withoutX(String str) {
        if (str.length() == 0)
            return str;
        else if (str.length() == 1 && str.charAt(0) == 'x')
            return "";

        int lastIndex = str.length() - 1;
        int beginIndex = str.charAt(0) == 'x' ? 1 : 0;
        int endIndex = str.charAt(lastIndex) == 'x' ? lastIndex - 1 : lastIndex;

        return str.substring(beginIndex, endIndex + 1);
    }

    public int countHi(String str) {
        int i = 0, n = str.length(), count = 0;
        while (i < n) {
            if (str.charAt(i) == 'h') {
                if (i + 1 < n && str.charAt(i + 1) == 'i') {
                    count++;
                    i++;
                }
            }
            i++;
        }

        return count;
    }

    public static void printAllSubstring(String str) {

    }

    public static void main(String[] args) {
        // String s1 = scn.nextLine(); // "abc def" it take input with space
        // String s2 = scn.next(); // it take input till first space.
        String s = "hello_world";
        test1(s);

    }
}