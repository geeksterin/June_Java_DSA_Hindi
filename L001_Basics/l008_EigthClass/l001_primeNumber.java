import java.util.*;

public class l001_primeNumber {

    public static Scanner scn = new Scanner(System.in);

    public static boolean isPrimeNumber(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void printPrimeNumbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (isPrimeNumber(i))
                System.out.print(i + ", ");
        }

    }

    public static void main(String[] args) {
        int a = scn.nextInt();
        int b = scn.nextInt();

        printPrimeNumbers(a, b);
    }

}