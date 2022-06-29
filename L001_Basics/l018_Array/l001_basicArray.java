import java.util.*;

public class l001_basicArray {
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

    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int[] arr = new int[n]; // int[] arr = {10,20,-40,50,70,90,-89,-56};
        input1D(arr);
        print1D(arr);
    }
}