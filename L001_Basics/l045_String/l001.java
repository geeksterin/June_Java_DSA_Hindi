public class l001 {
    public static void swapStrings(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void swapCharacter(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseStringsArray(String[] arr) {
        int n = arr.length, i = 0, j = n - 1;
        while (i < j) {
            swapStrings(arr, i++, j--);
        }
    }

    public static String reverseStatement(String str) {
        String[] arr = str.split(" ");
        reverseStringsArray(arr);

        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
            if (i != n - 1)
                sb.append(" ");
        }

        return sb.toString();
    }

    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length, i = 0, j = n - 1;
        while (i < j) {
            swapCharacter(arr, i++, j--);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : arr) {
            sb.append(ch);
        }

        return sb.toString();
    }

    public static String reverseStatement_02(String str) {
        String[] arr = str.split(" ");
        reverseStringsArray(arr);

        int n = arr.length;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String nStr = reverseString(arr[i]);

            sb.append(nStr);
            if (i != n - 1)
                sb.append(" ");
        }

        return sb.toString();
    }

    public static void freqArray(String str) {
        int[] fArr = new int[128 + 1];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            fArr[ch] = fArr[ch] + 1; // ch -> int (ASCII)
        }

        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char) i + " -> " + fArr[i]);
        }
    }

}