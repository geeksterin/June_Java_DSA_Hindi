public class l001 {
    public static void waveTraverse(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int c = 0; c < m; c++) {
            if (c % 2 == 0) {
                for (int r = 0; r < n; r++) {
                    System.out.print(arr[r][c] + " ");
                }
            } else {
                for (int r = n - 1; r >= 0; r--) {
                    System.out.print(arr[r][c] + " ");
                }
            }

        }
    }

    public static void waveTraverse_02(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int r = 0; r < n; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < m; c++)
                    System.out.print(arr[r][c] + " ");
            } else {
                for (int c = m - 1; c >= 0; c--)
                    System.out.print(arr[r][c] + " ");
            }
        }
    }

    public static void main(String[] args) {

    }
}