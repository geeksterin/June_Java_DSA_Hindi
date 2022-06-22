import java.util.*;

public class l001 {
    public static int power(int a, int b) {
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;
        }

        return ans;
    }

    public static int fact(int n) {
        int ans = 1;
        while (n > 0) {
            ans *= n--;
        }

        return ans;

    }

    public static int ncr(int n, int r) {
        int a = fact(n);
        int b = fact(n - r);
        int c = fact(r);


    }

    public static int npr(int n,int r){
        

    }

    public static void main(String[] args) {

    }
}