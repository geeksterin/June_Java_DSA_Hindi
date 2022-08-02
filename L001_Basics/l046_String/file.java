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

    // T: O(N)
    public static String stringSorting_02(String str) {
        int[] freqArray = new int[128 + 1];

    }

    public static void main(String[] args) {

    }

}