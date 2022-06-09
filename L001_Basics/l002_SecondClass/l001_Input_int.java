import java.util.*;

public class l001_Input_int {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter two numbers space sperated: ");
        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println("sum will be: " + (a + b));
    }

}