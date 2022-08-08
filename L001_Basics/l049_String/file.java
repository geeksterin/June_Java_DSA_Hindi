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
        int itr = 0, i = 1, equalStream = 0;
        while (i < n) {
            int count = 1;
            while (i < n && sb.charAt(itr) == str.charAt(i)) {
                i++;
                count++;
            }

            if (i < n) {
                sb.append(str.charAt(i));
                i++;
                itr++;
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
}