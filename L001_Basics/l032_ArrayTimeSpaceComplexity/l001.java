import java.util.*;

public class l001 {
    public static void swap(ArrayList<Integer> arr, int i, int j) {
        int vi = arr.get(i);
        int vj = arr.get(j);

        arr.set(i, vj);
        arr.set(j, vi);
    }

    // S: O(1), T: O(n), worstCase Complexity-> bure se bura kya hoskta hai.
    // kuch bhi esa kardo jisse shifting naho.
    // sol-> as you find element swap with last element and delete last element
    public static void removeAllEle(ArrayList<Integer> arr, int data) {
        int n = arr.size(), i = n - 1;
        while (i >= 0) {
            if (arr.get(i) == data) {
                swap(arr, i, arr.size() - 1);
                arr.remove(arr.size() - 1);
            }
            i--;
        }
    }

    public static int segregateOverData(ArrayList<Integer> arr, int data) {
        int n = arr.size(), pt = -1, itr = 0, count = 0;
        while (itr < n) {
            if (arr.get(itr) != data)
                swap(arr, ++pt, itr);
            else
                count++;

            itr++;
        }
        return count;
    }

    public static void removeAllEle_02(ArrayList<Integer> arr, int data) {
        int count = segregateOverData(arr, data);
        while (count-- > 0) {
            arr.remove(arr.size() - 1);
        }
    }

    // 1732
    public int largestAltitude(int[] gain) {
        int sum = 0;
        int ans = 0;
        for(int ele : gain){
            sum += ele;
            ans = Math.max(ans,sum);
        }
        return ans;
    }

    public static void main(String[] args) {

    }

}