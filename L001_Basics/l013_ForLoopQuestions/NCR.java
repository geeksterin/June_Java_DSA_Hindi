import java.util.*;

public class NCR {
    public static Scanner scn = new Scanner(System.in);

    public static int fact(int num) {
        int ans = 1;
        while (num > 0) {
            ans *= num--;
        }

        return ans;
    }

    public static int ncr(int n, int r) {
        int a = fact(n);
        int b = fact(n - r);
        int c = fact(r);

        return a / (b * c);
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int r = scn.nextInt();
        int ans = ncr(n, r);
        System.out.println(ans);
    }
}