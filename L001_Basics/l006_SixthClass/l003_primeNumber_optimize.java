import java.util.*;

public class l003_primeNumber_optimize {
    public static Scanner scn = new Scanner(System.in);

    // operation equal to N, one operation take 1 second, total time = squareRoot(N)
    // seconds
    public static void main(String[] args) {
        int n = scn.nextInt();
        boolean flag = true; // i'm assuing i'm a prime number.
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is a not prime number");
        }
    }
}