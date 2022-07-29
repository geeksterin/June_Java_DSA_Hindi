public class file {

    public static int countLowerCase(String str) {
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z')
                count++;
        }

        return count;
    }

    public static int countUpperCase(String str) {
        int n = str.length(), count = 0;
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                count++;
        }

        return count;
    }

    // aBCdghi -> ABCDGHI
    public static String allLowerCaseToUpperCase(String str) {

    }

    // aBCdghi -> abcdghi
    public static String allUpperCaseToLowerCase(String str) {

    }

}