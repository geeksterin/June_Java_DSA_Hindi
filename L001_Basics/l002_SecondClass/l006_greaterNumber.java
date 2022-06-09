import java.util.*;

public class l006_greaterNumber {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (a > b && a > c)
            System.out.println("greater number is: " + a);
        else if (b > a && b > c)
            System.out.println("greater number is: " + b);
        else
            System.out.println("greater number is: " + c);
    }

}