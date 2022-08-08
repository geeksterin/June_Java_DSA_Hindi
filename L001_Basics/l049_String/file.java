public class file {
    // str will a sorted String, ex: "aaabbbccdddeeghijjj" -> "abcdeghij"
    // work for all type of string
    public static String removeAllDuplicates(String str) {
        int[] freq = new int[128];
        StringBuilder sb = new StringBuilder();

        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                sb.append((char) i);
            }
        }

        return sb.toString();
    }

    // only for sorted strings
    public static String removeAllDuplicates_02(String str) {
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        sb.append(str.charAt(0));
        int i = 1, equalStream = 0;
        while (i < n) {
            int count = 1;
            while (i < n && sb.charAt(sb.length() - 1) == str.charAt(i)) {
                i++;
                count++;
            }

            if (i < n) {
                sb.append(str.charAt(i));
                i++;
            }

            if (count > 1) {
                equalStream++;
            }
        }

        return sb.toString();
    }

    // str will a sorted String, ex: "aaabbbccdddeeghijjj" -> "ghi"
    // work for all type of strings
    public static String removeAllDuplicates_03(String str) {
        int[] freq = new int[128];
        StringBuilder sb = new StringBuilder();

        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < 128; i++) {
            if (freq[i] == 1) {
                sb.append((char) i);
            }
        }

        return sb.toString();
    }

    public static String compress(String str) {
        int[] freq = new int[128];
        StringBuilder sb = new StringBuilder();

        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                sb.append((char) i);
                if (freq[i] > 1)
                    sb.append(freq[i]);
            }
        }

        return sb.toString();
    }

    public static String compress_02(String str) {
        StringBuilder sb = new StringBuilder();
        int n = str.length();
        sb.append(str.charAt(0));
        int i = 1;
        while (i < n) {
            int count = 1;
            while (i < n && sb.charAt(sb.length() - 1) == str.charAt(i)) {
                i++;
                count++;
            }

            if (count > 1) {
                sb.append(count);
            }

            if (i < n) {
                sb.append(str.charAt(i));
                i++;
            }
        }

        return sb.toString();
    }

    public static int firstNonRepeatingCharacter(String str) {
        int[] freq = new int[128];
        StringBuilder sb = new StringBuilder();

        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for (int i = 0; i < n; i++) {
            if (freq[i] == 1) {
                return i;
            }
        }

        return -1;
    }

    // new set of
    // questions===============================================================

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isContainVowel(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (isVowel(str.charAt(i)))
                return true;
        }

        return false;
    }

    public static int countAllNonVowelSubstrings(String str) {
        int count = 0, n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                String substr = str.substring(i, j + 1);
                if (isContainVowel(substr) == false) {
                    count++;
                }
            }
        }

        return count;
    }
}