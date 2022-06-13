import java.util.Scanner;

public class l004_userEvenOdd {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            int num = scn.nextInt();
            if (num % 2 == 0) // even
                System.out.println("Even: " + num);
            else
                System.out.println("Odd: " + num);
        }

    }

}