import java.util.*;

public class l001_Pattern {
    public static Scanner scn = new Scanner(System.in);

    public static void pattern_01(int n) {
        int nsp = n - 1, nst = 1; // nst : no of star, nsp : no of space

        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++) { // current space count
                System.out.print("  ");
            }

            for (int cst = 1; cst <= nst; cst++) { // current star count
                System.out.print("* ");
            }

            nsp--;
            nst++;
            System.out.println();
        }
    }

    public static void pattern_02(int n) {
        int nst = n, nsp = 0;

        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("* ");

            nst--;
            nsp++;
            System.out.println();
        }
    }

    public static void pattern_03(int n) {
        int nst = 1, nsp = 0;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("* ");

            nst++;
            System.out.println();
        }
    }

    public static void pattern_04(int n) {
        int nst = n;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst; cst++)
                System.out.print("* ");

            nst--;
            System.out.println();
        }
    }

    public static void pattern_05(int n) {
        int nst1 = 1, nsp1 = n - 1;
        int nst2 = 1, nsp2 = n - 1;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst1; cst++)
                System.out.print("* ");

            for (int csp = 1; csp <= nsp1; csp++)
                System.out.print("  ");

            for (int csp = 1; csp <= nsp2; csp++)
                System.out.print("  ");

            for (int cst = 1; cst <= nst2; cst++)
                System.out.print("* ");

            nst1++;
            nsp1--;
            nst2++;
            nsp2--;
            System.out.println();
        }
    }

    public static void pattern_05_01(int n) {
        int nst = 1, nsp = 2 * n - 2;
        for (int r = 1; r <= n; r++) {
            for (int cst = 1; cst <= nst1; cst++)
                System.out.print("* ");

            for (int csp = 1; csp <= nsp2; csp++)
                System.out.print("  ");

            for (int cst = 1; cst <= nst2; cst++)
                System.out.print("* ");

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        pattern_05(n);

    }
}