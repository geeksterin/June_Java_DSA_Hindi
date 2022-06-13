import java.util.Scanner;

public class l001_printTable {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }

}