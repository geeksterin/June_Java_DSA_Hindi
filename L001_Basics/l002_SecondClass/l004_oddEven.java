import java.util.*;

public class l004_oddEven {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();
        if (n % 2 == 0) {
            System.out.println("number " + n + " is even");
        } else {
            System.out.println("number " + n + " is odd");
        }
    }
}