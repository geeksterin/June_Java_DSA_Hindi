import java.util.Scanner;

public class l006_printOnlyOdd {
    public static Scanner scn = new Scanner(System.in);

    // print only odd numbers in between 1 To N
    public static void main(String[] args) {
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0)
                System.out.println("Odd: " + i);
        }

    }

}