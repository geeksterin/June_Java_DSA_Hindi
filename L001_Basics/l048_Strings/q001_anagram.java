public class q001_anagram {
    public static String makeString(char ch, int freq) {
        StringBuilder sb = new StringBuilder();
        while (freq-- > 0) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static String sortString(String str) {
        int[] freq = new int[128];
        for (int i = 0; i < str.length(); i++)
            freq[str.charAt(i)]++;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                sb.append(makeString((char) i, freq[i]));
            }
        }
        return sb.toString();
    }

    // 1. each charachter should exist in both string.
    // 2. frequency of each character should be same in both string
    // 3. order of characters dosen't matter.
    public static boolean isAnagram(String str1, String str2) {
        String s1 = sortString(str1);
        String s2 = sortString(str2);

        return s1.equals(s2);  
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

}