import java.util.*;

public class l001_StringBasic {
    public static Scanner scn = new Scanner(System.in);

    // O(N + M), where M is no of character in another string
    public static void test1() {
        String str = "";
        for (int i = 0; i <= 1000000; i++) {
            str += i;
        }

        System.out.println(str);
    }

    // O(M)
    public static void test2() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= 1000000; i++) {
            str.append(i);
        }

        System.out.println(str);
    }

    public static void test3() {
        String str = "abcdefghi";
        String str1 = str.substring(3, 6 + 1);
        System.out.println(str1.charAt(4));
    }

    public static void allSubstrings(String str){
        for(int i = 0;i < str.length();i++){
            for(int j = i; j < str.length();j++){
                // System.out.print("(" + i + ", " + (j + 1) + ") ");
                System.out.println(str.substring(i, j + 1));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        allSubstrings("abcd");
    }
}