import java.util.Scanner;

public class l003_minInput {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();

        int minNum = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            int num = scn.nextInt();
            minNum = Math.min(minNum, num);
        }

        System.out.println("Minimum Number is : " + minNum);
    }

}