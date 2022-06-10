import java.util.*;

public class l003_learnIfElseInDeep {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();

        // if (n >= 0 && n <= 10)
        // System.out.println("number in between 1 to 10");
        // if (n > 10 && n <= 20)
        // System.out.println("number in between 11 to 20");
        // if (n > 20 && n <= 30)
        // System.out.println("number in between 21 to 30");
        // if (n > 30)
        // System.out.println("number is greater then 30");

        // these line of code perform better then previous one.
        if (n >= 0 && n <= 10)
            System.out.println("number in between 1 to 10");
        else if (n > 10 && n <= 20)
            System.out.println("number in between 11 to 20");
        else if (n > 20 && n <= 30)
            System.out.println("number in between 21 to 30");
        else
            System.out.println("number is greater then 30");

    }
}