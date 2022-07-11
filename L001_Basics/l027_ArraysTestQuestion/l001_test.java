import java.util.*;

public class l001_test {
    private static Scanner scn = new Scanner(System.in);

    public static void LKG_Method_01(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int zp = 0, nzp = n - 1;// zp : zero pointer, nzp : non zero pointer
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                ans[nzp++] = arr[i];
            } else {
                ans[zp--] = 0;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = ans[i];
        }
    }

    public static void UKG_Method_02(int[] arr) {
        int n = arr.length, itr = 0, p = -1;
        while (itr < n) {
            if (arr[itr] != 0) {
                arr[++p] = arr[itr];
            }
            itr++;
        }

        while (p < n - 1) {
            arr[++p] = 0;
        }
    }

    public static void UKG_Method_03(int[] arr) {
        int n = arr.length, itr = 0, p = -1, countZeros = 0;
        while (itr < n) {
            if (arr[itr] != 0) {
                arr[++p] = arr[itr];
            } else {
                countZeros++;
            }
            itr++;
        }

        while (countZeros-- > 0) {
            arr[++p] = 0;
        }
    }

    public static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");

        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = { 10, 3, 4, 0, 0, 0, 0, 4, 5, 6, 0, 7, 0, 1, 0, 3, 0, 5, 67, 0 };
        UKG_Method_03(arr);
        print(arr);
    }
}