import java.util.*;

public class l001_practiceQuestions {

    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        // 1
        if (6 < 2 * 5)
            System.out.print("Hello");
            System.out.print(" There");

        // 2
        if(a>b)
            if(a>c) 
               System.out.println("1111");
            else
               System.out.println("2222");

        // 3
        if (a < c)
            System.out.println("*");
        else if (a == b)
            System.out.println("&");
        else
            System.out.println("$");

        // 4
        if(a<b)
            System.out.println("####");
        else
            System.out.println("&&&&");
            System.out.println("****");

        // 5
        if(a<b)
            System.out.println("####");
        else{
            System.out.println("&&&&");
            System.out.println("****");
        }

        // 6
        int x = 100; int y = 200;
        if (x > 100 && y <=200)
            System.out.print(x+" "+y+" "+(x+y));
        else
            System.out.print(x+" "+y+" "+(2*x-y));

        // 7
        if (a < c)
            System.out.println("*");
        else if (a == c)
            System.out.println("&");
        else
            System.out.println("$");

        // 8
        if(++a > b++ || a-- > 0)
            c++;
        else
            c--;
            System.out.println(a+" "+b+" "+c);

        // 8.1
        if(++a > b++ || a-- < 0)
            c++;
        else if(++a < ++b && a-- > 0)
            b++;
        else
            c--;
            System.out.println(a+" "+b+" "+c);
        
        // 8.2
        if(++a > b++ || a-- < 0)
            c++;
        else if(++a < ++b && a-- < 0)
            b++;
        else if(++a < b++ && --a > 0)
            c++;
        else
            c--;
            System.out.println(a+" "+b+" "+c);

        // 8.3
        if(++a > b++ || a-- < 0)
                c++;
        else if(++a < ++b || a-- < 0 && ++a < ++b)
            b++;
        else if(++a < b++ && --a > 0)
            c++;
        else
            c--;
                System.out.println(a+" "+b+" "+c);

        // 8.4
        if(++a > b++ || a-- < 0)
                c++;
        else if(++a < ++b && a-- > 0 || ++a < ++b)
            b++;
        else if(++a < b++ && --a > 0)
            c++;
        else
            c--;
                System.out.println(a+" "+b+" "+c);


        // 9
        if(a<b){
            System.out.println("####");
            System.out.println("****");
        }
        else
            System.out.println("&&&&");

        //10
        if ('a' > 'b' || 66 > (int)('A'))
           System.out.println("#*#");
    }

}