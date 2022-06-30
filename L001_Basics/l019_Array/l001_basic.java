import java.util.*;

public class l001_basic {
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

    // return index if data found, if not then return -1;
    public static int findElement(int[] arr, int data) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == data) {
                return i;
            }
        }

        return -1;
    }

    public static int maxEle(int[] arr) {
        int maxEle = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // maxEle = Math.max(maxEle, arr[i]);
            maxEle = arr[i] > maxEle ? arr[i] : maxEle;
        }
        return maxEle;
    }

    public static int minEle(int[] arr) {
        int minEle = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            // minEle = Math.min(minEle, arr[i]);
            minEle = arr[i] < minEle ? arr[i] : minEle;
        }
        return minEle;
    }

    public static boolean palindrome(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            if (arr[i] != arr[j])
                return false;

            i++;
            j--;
        }

        return true;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            swap(arr, i++, j--);
        }
    }

    public static int[] inverse(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[arr[i]] = i;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n]; // int[] arr = {10,20,-40,50,70,90,-89,-56};
        input1D(arr);
        int[] ans = inverse(arr);
        print1D(ans);
    }
}