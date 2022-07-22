public class l001 {

    // S: O(1), T: O(n*m)
    public static boolean identityMatrix(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        if (n != m)
            return false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j && matrix[i][j] != 1)
                    return false;
                else if (i != j && matrix[i][j] != 0)
                    return false;
            }
        }

        return true;
    }

    // S: O(1), T: O(n*m)
    public static boolean matrixSymmetric(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        if (n != m)
            return false;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                if (matrix[i][j] != matrix[j][i])
                    return false;
            }
        }

        return true;
    }

    public static void printDiagonal(int[][] arr, int r, int c) {
        int n = arr.length, m = arr[0].length;
        while (r < n && c < m) {
            System.out.print(arr[r][c] + " ");
            r++;
            c++;
        }
        System.out.println();
    }

    public static void printUpperDiagonal(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int j = 0; j < m; j++)
            printDiagonal(arr, 0, j);
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 0, 0 },
                { 0, 1, 0 },
                { 0, 0, 2 }
        };
        System.out.println(identityMatrix(arr));
    }
}