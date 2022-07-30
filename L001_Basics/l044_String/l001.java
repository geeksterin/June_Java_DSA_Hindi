public class l001 {

    public String allUpperCaseToLowerCase(String str) {
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

    public String capitalizeTitle(String title) {
        String[] arr = title.split(' ');

    }

}