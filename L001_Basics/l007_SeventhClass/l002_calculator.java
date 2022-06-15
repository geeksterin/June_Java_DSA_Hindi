import java.util.*;

public class l002_calculator {
    public static Scanner scn = new Scanner(System.in);

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static int rem(int a, int b) {
        return a % b;
    }

    public static int calculator(int a, char ch, int b) {
        if (ch == '+')
            return add(a, b);
        else if (ch == '-')
            return sub(a, b);
        else if (ch == '*')
            return mul(a, b);
        else if (ch == '/')
            return div(a, b);
        else if (ch == '^')
            return power(a, b);
        else if (ch == '%')
            return rem(a, b);
        else {
            System.out.println("Invalid Input");
            return Integer.MIN_VALUE;
        }
    }

    public static void main(String[] args) {
        // char: +,-,*,/,%,^
        int a = scn.nextInt();
        int b = scn.nextInt();
        char ch = scn.next().charAt(0);

        int ans = calculator(a, ch, b);
        System.out.println(ans);
    }

}