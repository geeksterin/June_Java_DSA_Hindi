import java.util.*;

public class l002_input_String {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        // String str = scn.nextLine(); // nextLine will take entire string
        // System.out.println("Input String is: " + str);

        // String str1 = scn.next(); // next will take only string till first space
        // encounter.
        // System.out.println("Input String is: " + str1);

        System.out.println("Input First Name: ");
        String firstName = scn.next();

        System.out.println("Input Middle Name: ");
        String middleName = scn.next();

        System.out.println("Input Last Name: ");
        String lastName = scn.next();

        System.out.println("your name is: " + firstName + " " + middleName + " " + lastName);
    }

}