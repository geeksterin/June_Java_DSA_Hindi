public class file {

    // String contains only and only numbers from 0 to 9
    public static boolean isBalanced(String str) {
        int n = str.length();
        int mid = (0 + n - 1) / 2;
        int i = n % 2 == 0 ? mid : mid - 1;
        int j = mid + 1;

        int sum1 = 0, sum2 = 0;
        while (i >= 0) {
            char ch1 = str.charAt(i--);
            char ch2 = str.charAt(j++);

            // convert char into digit
            int d1 = ch1 - '0';
            int d2 = ch2 - '0';

            // add up as a digit
            sum1 += d1;
            sum2 += d2;
        }

        if (n % 2 != 0) {
            sum1 += str.charAt(mid) - '0';
            sum2 += str.charAt(mid) - '0';
        }

        return sum1 == sum2;
    }

    // string contains any charchter that exist in physical universe
    public static boolean isPlaindrome(String str) {

    }

    // String contains only and only numbers from 0 to 9, and len <= 9
    public static int parseStringIntoInteger(String str) {

    }

    public static void main(String[] args) {
        isBalanced("12344321");
        System.out.println(parseStringIntoInteger("34345") * 2 - 56);
    }

}