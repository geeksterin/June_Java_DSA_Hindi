import java.util.*;

public class solution {
    public static Scanner scn = new Scanner(System.in);

    public static int[][] input2d() {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        return arr;
    }

    public static int[] input1D() {
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }

        return arr;
    }

    public static void reverseMatrixPrint(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void reverseMatrixPrint() {
        int[][] mat = input2d();
        reverseMatrixPrint(mat);
    }

    // Lucky Pairs.=================================================

    public static int luckyPair(int[] arr) {
        int n = arr.length, count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
        }
        return count;
    }

    public static void luckyPair() {
        int[] arr = input1D();
        int ans = luckyPair(arr);
        System.out.println(ans);
    }

    // Fisrt And Last Occu
    public static void firstLast(int[] arr, int data) {
        int n = arr.length, fo = -1, lo = -1; // fo: first occurrence, lo : last occurrence
        for (int i = 0; i < n; i++) {
            if (arr[i] == data) {
                if (fo == -1)
                    fo = i;

                lo = i;
            }

            if (arr[i] > data) // only if array is sorted
                break;
        }

        System.out.println(fo);
        System.out.println(lo);
    }

    // O(Log(N))
    public static int firstOccurrence(int[] arr, int data) {
        int n = arr.length, si = 0, ei = n - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data) {
                if (mid - 1 >= 0 && arr[mid - 1] == data) {
                    ei = mid - 1;
                } else
                    return mid;
            } else if (arr[mid] > data)
                ei = mid - 1;
            else
                si = mid + 1;
        }

        // int si = 0, ei = n;
        // while (si < ei) {
        // if (arr[mid] < data)
        // si = mid + 1;
        // else
        // ei = mid
        // }
        // return ei;

        return -1;
    }

    // O(Log(N))
    public static int lastOccurrence(int[] arr, int data) {
        int n = arr.length, si = 0, ei = n - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data) {
                if (mid + 1 < n && arr[mid + 1] == data) {
                    si = mid + 1;
                } else
                    return mid;
            } else if (arr[mid] > data)
                ei = mid - 1;
            else
                si = mid + 1;
        }

        // int si = 0, ei = n;
        // while (si < ei) {
        // if (arr[mid] <= data)
        // si = mid;
        // else
        // ei = mid + 1;
        // }
        // return si;

        return -1;
    }

    public static void firstLast_best(int[] arr, int data) {
        System.out.println(firstOccurrence(arr, data));
        System.out.println(lastOccurrence(arr, data));
    }

    public static void firstLast() {
        int[] arr = input1D();
        int data = scn.nextInt();
        firstLast_best(arr, data);
    }

    public static void main(String[] args) {

    }
}