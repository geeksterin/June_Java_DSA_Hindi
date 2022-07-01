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
    public static String sumOftwoArrays(int[] A, int[] B) {
        int n = A.length, m = B.length;
        int len = Math.max(n, m) + 1;

        int[] ans = new int[len];
        int i = n - 1, j = m - 1, k = len - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = (i >= 0 ? A[i] : 0) + (j >= 0 ? B[j] : 0) + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ans[k--] = digit;
            i--;
            j--;
        }

        String res = "";
        boolean isFirstNonZeroIncountered = false;
        for (int p = 0; p < len; p++) {
            if (ans[p] == 0 && isFirstNonZeroIncountered == false)
                continue;

            isFirstNonZeroIncountered = true;
            res += ans[p];
        }

        return res;
    }

    String calc_Sum(int A[], int n, int B[], int m) {
        int len = Math.max(n, m) + 1;

        int[] ans = new int[len];
        int i = n - 1, j = m - 1, k = len - 1, carry = 0;

        while (k >= 0) {
            int sum = (i >= 0 ? A[i--] : 0) + (j >= 0 ? B[j--] : 0) + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ans[k--] = digit;
        }

        StringBuilder res = new StringBuilder();
        boolean flag = false;
        for (int p = 0; p < len; p++) {
            if (ans[p] == 0 && flag == false)
                continue;

            flag = true;
            res.append(ans[p]);
        }

        return res.toString();
    }

    public static void sumOftwoArraysProgram() {
        int n = scn.nextInt();
        int[] A = new int[n];
        input1D(A);

        int m = scn.nextInt();
        int[] B = new int[m];
        input1D(B);

        String ans = sumOftwoArrays(A, B);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        sumOftwoArraysProgram();

    }

}