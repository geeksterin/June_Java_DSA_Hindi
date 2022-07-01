import java.util.*;

public class l001_questions {

    public static Scanner scn = new Scanner(System.in);

    public static void input1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt(); // write
        }
    }

    public static void print1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // read
        }
        System.out.println();
    }

    // A and B are the arrays of digit.
    public static int[] sumOftwoArrays(int[] A, int[] B) {

    }

    public static void sumOftwoArraysProgram() {
        int n = scn.nextInt();
        int[] A = new int[n];
        input1D(A);

        int m = scn.nextInt();
        int[] B = new int[m];
        input1D(B);

        int[] ans = sumOftwoArrays(A, B);
        print1D(ans);
    }

    public static void main(String[] args) {
        sumOftwoArraysProgram();

    }

}