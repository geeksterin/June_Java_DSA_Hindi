import java.util.*;

public class l001_pattern {
    public static Scanner scn = new Scanner(System.in);

    // 1. Always look at the first row try to figure out its pattern in terms of
    // (space) and (star).
    // 2. count star and space W.R.T. n only for row 1.
    // 3. write loop to print star and space
    // 4. figure out relation in between row 1 and row2 for nst and nsp for doing
    // this use table.
    // 5. enclose above loop into another loop for printing multiple rows.

    public static void pattern_Triangle(int n) {
        int nst = 1, nsp = n - 1;
        for (int r = 1; r <= n; r++) {
            int count = 1;
            // star
            for (int csp = 1; csp <= nsp; csp++) { // csp : count of space
                System.out.print("  ");
            }

            // star
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + " ");
            }

            nst++;
            nsp--;
            System.out.println();
        }
    }

    public static void pattern_numberedTriangle(int n) {
        int nst = 1, nsp = n - 1;
        for (int r = 1; r <= n; r++) {
            int count = 1;
            // star
            for (int csp = 1; csp <= nsp; csp++) { // csp : count of space
                System.out.print("  ");
            }

            // star
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count++ + " ");
            }

            nst++;
            nsp--;
            System.out.println();
        }
    }

    public static void pattern_pyramid(int n) {
        int nst = 1, nsp = n - 1;
        for (int r = 1; r <= n; r++) {
            // space
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("  ");
            }

            // star
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("* ");
            }

            nst += 2;
            nsp--;
            System.out.println();
        }
    }

    public static void pattern_inversePyramid(int n) {
        int nst = 2 * n - 1, nsp = 0;
        for (int r = 1; r <= n; r++) {
            // space
            for (int csp = 1; csp <= nsp; csp++) {
                System.out.print("  ");
            }

            // star
            for (int cst = 1; cst <= nst; cst++) {
                System.out.print("* ");
            }

            nst -= 2;
            nsp++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        pattern_inversePyramid(n);
    }

}