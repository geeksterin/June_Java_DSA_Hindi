import java.util.*;

public class l001_sorting {

    public static Scanner scn = new Scanner(System.in);

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = scn.nextInt();
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // bubble sort mein bigger element will be on last
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    public static void bubbleSort_opti(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isArraySorted = true;
            for (int j = 1; j < n - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j - 1, j);
                    isArraySorted = false;
                }
            }

            if (isArraySorted)
                break;
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    swap(arr, i, j);

            }
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n];
        input(arr);

        System.out.print("Before Sorting: ");
        print(arr);

        bubbleSort(arr);

        System.out.print("After Sorting: ");
        print(arr);
    }
}