public class q002_panagram {
    public static String sortString(String str) {
        int[] freq = new int[128];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                sb.append((char) i);
            }
        }

        return sb.toString();
    }

    // O(n)
    public static boolean isequals(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;

        int n = str1.length();
        for (int i = 0; i < n; i++)
            if (str1.charAt(i) != str2.charAt(i))
                return false;

        return true;
    }

    // check if string is pangram (Contains all the alphabets at least once)
    public static boolean pangram(String str1, String str2) {
        String s1 = sortString(str1);
        String s2 = sortString(str2);

        return isequals(s1, s2);
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    // - count the maximum and minimum distance(absolute difference of
    // indices) between two vowels in a string.

    // small alphabets are only present in string
    public static void absoluteDiff(String str) {
        int maximum = -1;
        int minimum = 10000000;

       
        }

        // code

        System.out.println("maximum diff: " + maximum);
        System.out.println("minimum diff: " + minimum);
    }

}