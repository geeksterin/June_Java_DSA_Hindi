import java.util.*;

public class l003_DigitBasedQuestion {

    public static Scanner scn = new Scanner(System.in);

    public static int noOfDigits(int num) {
        int len = 0;
        while (num != 0) {
            num /= 10;
            len++;
        }

        return len;
    }

    // if you able to locate digit return its index otherwise return -1
    public static int findDigit(int num, int digit) {
        int idx = noOfDigits(num) - 1;

        while (num != 0) {
            int d = num % 10;
            if (d == digit)
                return idx;

            num /= 10;
            idx--;
        }

        return -1;
    }

    public static void main(String[] args) {
        int num = scn.nextInt();
        System.out.println(noOfDigits(num));
    }

}