import java.util.*;

public class l002_gcdAndLcm {
    public static Scanner scn = new Scanner(System.in);

    public static int gcd(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while (b % a != 0) {
            int rem = b % a;
            b = a;
            a = rem;
        }

        return a;
    }

    public static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        return (a / gcd) * b;
    }

    public static void main(String[] args) {
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println(lcm(a, b));
    }

}