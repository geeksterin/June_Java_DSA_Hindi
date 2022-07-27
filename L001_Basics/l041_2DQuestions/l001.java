public class l001 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length, r = 0, c = m - 1;

        while (r < n && c >= 0) {
            if (matrix[r][c] == target)
                return true;
            else if (matrix[r][c] > target)
                c--;
            else
                r++;
        }

        return false;

    }

    public static boolean binarySearch(int[] arr, int data) {
        int n = arr.length, si = 0, ei = n - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data)
                return true;
            else if (arr[mid] < data)
                si = mid + 1;
            else
                ei = mid - 1;
        }
        return false;
    }

    public static boolean searchMatrix_02(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        for (int r = 0; r < n; r++) {
            if (matrix[r][0] <= target && target <= matrix[r][m - 1]) {
                if (binarySearch(matrix[r], target))
                    return true;
            }
        }
        return false;
    }
}