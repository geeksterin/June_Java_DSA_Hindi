import java.util.*;

public class l001 {
    public static Scanner scn = new Scanner(System.in);

    public static void hourGlass(int n) {
        int nst = 2 * n - 1, nsp = 0;
        for (int r = 1; r <= 2 * n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            for (int cst = 1; cst <= nst; cst++)
                System.out.print("* ");

            if (r < n) {
                nst -= 2;
                nsp++;
            } else if (r > n) {
                nst += 2;
                nsp--;
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        hourGlass(n);

    }
}