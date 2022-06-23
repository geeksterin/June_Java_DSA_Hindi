public class l001_amstroongNumber {
    public static int digitCount(int num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }

        return count;
    }
    
    public static String armstrongNumber(int n) {
        int digitCount = digitCount(n);
        int res = 0, num = n;
        while (num != 0) {
            int rem = num % 10;
            num /= 10;
            res += Math.pow(rem, digitCount);
        }

        return res == n ? "Yes" : "No";
    }

}