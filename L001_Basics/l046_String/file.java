import java.util.*;

public class file {

    public static Scanner scn = new Scanner(System.in);

    // T: O(NLog(N))
    public static String stringSorting_01(String str) {
        // convert into array T: O(N)
        char[] arr = str.toCharArray();

        // Sort array asuming as a interger array. T: O(NLog(N))
        Arrays.sort(arr);

        // Convert char array into StringBuilder. T: O(N)
        StringBuilder sb = new StringBuilder();
        for (char ch : arr)
            sb.append(ch);

        // Convert stringbuilder into string. T: O(N)
        return sb.toString();
    }

    // (a, 4) -> "aaaa"
    public static String makeString(char ch, int freq) {
        StringBuilder sb = new StringBuilder();
        while (freq-- > 0) {
            sb.append(ch);
        }

        return sb.toString();
    }

    // T: O(N)
    public static String stringSorting_02(String str) {
        int[] freqArray = new int[128];
        StringBuilder sb = new StringBuilder();

        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freqArray[ch] = freqArray[ch] + 1;
        }

        for (int i = 0; i < 128; i++) {
            if (freqArray[i] > 0) {
                sb.append(makeString((char) i, freqArray[i]));
            }
        }

        return sb.toString();
    }

    // "12344321" -> sum(1,2,3,4) == sum(4,3,2,1)
    // check if the string is balanced. Given a string as numeric
    // characters (“1234”) , check if the sum of integers on the left of the middle
    // index is equal to the sum of the integers on the right of the middle index.
    public static boolean isBalance(String str) {

    }

    public static void main(String[] args) {
        // String statement = scn.nextLine(); // for input statement -> "my name is
        // rajneesh"
        // String word = scn.next(); // for input word -> "abcdf"
    }

}