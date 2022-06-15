import java.util.*;

public class l001_functions {

    public static Scanner scn = new Scanner(System.in); // global

    // isEven : kya ye number even hai
    public static boolean isEven(int n) {
        if (n % 2 == 0)
            return true;

        return false;
    }

    public static boolean isOdd(int n) {
        if (n % 2 != 0)
            return true;
        return false;
    }

    public static void printStatement(String statement) {
        System.out.println(statement);
    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static int addUserNumber() {
        int a = scn.nextInt(), b = scn.nextInt();
        return a + b;
    }

    public static int addNumber(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // boolean ans = isOdd(39);
        // System.out.println(ans);

        // printStatement("Hi my name is Rajneesh Kumar");
        // printHelloWorld();

        int ans = addUserNumber();
        System.out.println(ans);

        int  a = scn.nextInt(), b = scn.nextInt();
        System.out.println(addNumber(a, b));

    }

}