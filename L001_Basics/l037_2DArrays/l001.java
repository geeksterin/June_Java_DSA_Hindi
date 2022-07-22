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

        


        return true;
    }

    public static void main(String[] args){
        int[][] arr = {{1,0,0},
                       {0,1,0},
                       {0,0,2}
                    };
        System.out.println(identityMatrix(arr));
    }
}