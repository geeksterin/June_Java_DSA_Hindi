import java.util.Scanner;

public class l002_maxInput {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();

        int maxNum = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int num = scn.nextInt();
            maxNum = Math.max(maxNum, num);
            // if(num > maxNum) maxNum = num;
        }
        System.out.println("MaxNumber is : " + maxNum);
    }

}