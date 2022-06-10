import java.util.*;

public class l007_printTable {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int val = scn.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(val + " X " + i + " = " + (val * i));
        }
    }

}