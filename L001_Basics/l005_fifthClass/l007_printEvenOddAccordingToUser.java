import java.util.Scanner;

public class l007_printEvenOddAccordingToUser {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        boolean isEven = scn.nextBoolean();  // true : even, false : odd

        for (int i = 1; i <= n; i++) {
            if (isEven) {
                if (i % 2 == 0)
                    System.out.println("Even: " + i);
            } else {
                if (i % 2 != 0)
                    System.out.println("Odd: " + i);
            }
        }

    }

}