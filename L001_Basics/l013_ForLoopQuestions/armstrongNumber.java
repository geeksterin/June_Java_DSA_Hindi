import java.util.*;

public class armstrongNumber {
    static int pi = 3;
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        int r = scn.nextInt();
        int ans = npr(n, r);
        System.out.println(ans);
    }
}