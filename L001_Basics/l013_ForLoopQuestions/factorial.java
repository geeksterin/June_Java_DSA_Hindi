import java.util.*;

public class factorial {
    public static Scanner scn = new Scanner(System.in);

    public static int fact(int num) {
        int ans = 1;
        while (num > 0) {
            ans *= num--;
        }

        return ans;
    }

    public static void main(String[] args) {
        int n = scn.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }
}