import java.util.*;

public class NPR {
    public static Scanner scn = new Scanner(System.in);

    public static int fact(int num) {
        int ans = 1;
        while (num > 0) {
            ans *= num--;
        }

        return ans;
    }

    public static int npr(int n, int r) {
        int a = fact(n);
        int b = fact(n - r);

        return a / b;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int r = scn.nextInt();
        int ans = npr(n, r);
        System.out.println(ans);
    }
}