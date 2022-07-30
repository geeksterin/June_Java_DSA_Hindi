import java.util.ArrayList;

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

    // "my name is rajneesh", ' ' -> ["my", "name", "is" ,"rajneesh"]
    public static String[] split(String str, char regex_ch) {
        ArrayList<String> list = new ArrayList<>(); // for whithout arraylist count regex_ch, count + 1 -> string[]

        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch != regex_ch)
                sb.append(ch);

            if (ch == regex_ch || i == n - 1) {
                list.add(sb.toString());
                sb = new StringBuilder();
            }
        }

        String[] ans = new String[list.size()];
        int i = 0;
        for (String s : list)
            ans[i++] = s;

        return ans;
    }

    // 2129
    public String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        StringBuilder ans = new StringBuilder();

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            String str = arr[i];
            if (str.length() <= 2)
                ans.append(toLowerCase(str));
            else {
                char ch = str.charAt(0);
                if (ch >= 'a' && ch <= 'z')
                    ch = (char) (ch - 'a' + 'A');

                ans.append(ch + toLowerCase(str.substring(1)));
            }

            if (i != n - 1)
                ans.append(" ");
        }

        return ans.toString();
    }

    // Leetcode: 2124

    public static void main(String[] args) {
        String[] ans = split("my name is Rajneesh! hello friends! how are you", ' ');
        for (String s : ans)
            System.out.println(s);
    }

}
