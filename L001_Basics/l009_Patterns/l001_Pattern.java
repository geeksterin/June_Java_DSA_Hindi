import java.util.*;

public class l001_Pattern {
    public static Scanner scn = new Scanner(System.in);

    public static void pattern_01(int n) {
        int nsp = n - 1, nst = 1; // nst : no of star, nsp : no of space

        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) { // current space count
                System.out.print("  ");
            }

            for (int cst = 1; cst <= nst; cst++) {  // current star count
                System.out.print("* ");
            }

            nsp--;
            nst++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        pattern_01(n);

    }
}