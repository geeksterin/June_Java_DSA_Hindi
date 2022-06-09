import java.util.*;

public class l003_AreaOfRectangle {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        // System.out.println("please input length of rectangle: ");
        int length = scn.nextInt();
        // System.out.println("please input breath of rectangle: ");
        int breath = scn.nextInt();

        int area = length * breath;
        int perimeter = 2 * (length + breath);

        System.out.println("area of rectangle is: " + area);
        System.out.println("perimeter of rectangle is " + perimeter);

        boolean isSquare = false;
        if (length == breath)
            isSquare = true;

        System.out.println("is it a square: " + isSquare);
    }
}