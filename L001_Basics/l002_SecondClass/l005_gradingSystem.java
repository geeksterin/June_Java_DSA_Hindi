import java.util.*;

public class l005_gradingSystem {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();

        if (n > 90) {
            System.out.println("excellent");
        } else if (n > 80 && n <= 90) {
            System.out.println("good");
        } else if (n > 70 && n <= 80) {
            System.out.println("fair");
        } else if (n > 60 && n <= 70) {
            System.out.println("meets expectations");
        } else {
            System.out.println("below par");
        }
    }

}