import java.util.*;

public class l004_numberComeInTableOf {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scn.nextInt();

        if (n % 2 == 0)
            System.out.println(n + " is multiple of: " + 2);
        if (n % 3 == 0)
            System.out.println(n + " is multiple of: " + 3);
        if (n % 5 == 0)
            System.out.println(n + " is multiple of: " + 5);
        if (n % 7 == 0)
            System.out.println(n + " is multiple of: " + 7);
        if (n % 11 == 0)
            System.out.println(n + " is multiple of: " + 11);


        // nested if
        // if(n >= 10){
        //     if(n <= 20){

        //     }else if(n <= 30){

        //     }
        // }

    }

}