import java.util.*;

public class l002_fibonacci {

    public static Scanner scn = new Scanner(System.in);

    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        for (int i = 0; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        printFibonacci(n);
    }

}