import java.util.*;

public class l002_timeZone {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int time = scn.nextInt();
        // System.out.println("my Character is: " + ch);
        if (time < 12)
            System.out.println("good morning");
        else if (time <= 16)
            System.out.println("good afternoon");
        else if (time <= 20)
            System.out.println("good evening");
        else
            System.out.println("good night");
    }
}