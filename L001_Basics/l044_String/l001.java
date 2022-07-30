public class l001 {

    public String toLowerCase(String str) {
        StringBuilder ans = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ans.append((char) (ch - 'A' + 'a'));
            } else {
                ans.append(ch);
            }
        }

        return ans.toString(); // O(n)
    }

    public static String[] split(String str, String regex) {
        return new String[0];
    }

    // 2129
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            if (str.length() <= 1)
                ans.append(toLowerCase(str) + " ");
            else {

            }
        }

        return ans.toString();
    }

}
