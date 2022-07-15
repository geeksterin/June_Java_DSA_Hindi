import java.lang.reflect.Array;
import java.util.*;

public class l001Question {
    public static Scanner scn = new Scanner(System.in);

    // O(N+M)
    public static ArrayList<Integer> intersectionOfTwoSortedArrays(int[] A, int[] B) {
        int n = A.length, m = B.length;
        ArrayList<Integer> arr = new ArrayList<>();
        if (n == 0 || m == 0)
            return arr;

        int i = 0, j = 0;
        while (i < n && j < m) {
            if (A[i] == B[j]) {
                arr.add(A[i]);
                i++;
                j++;
            } else if (A[i] < B[j]) {
                i++;
            } else {
                j++;
            }
        }

        return arr;
    }

    public static void swap(ArrayList<Integer> arr, int i, int j) {
        // int temp = arr.get(i);
        // arr.set(i, arr.get(j));
        // arr.set(j, temp);

        int vi = arr.get(i);
        int vj = arr.get(j);

        arr.set(i, vj);
        arr.set(j, vi);
    }

    public static void reverseAL(ArrayList<Integer> arr) {
        int n = arr.size(), i = 0, j = n - 1;
        while (i < j) {
            swap(arr, i++, j--);
        }
    }

    public static void bubbleSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - i; j++) {
                if (arr.get(j - 1) > arr.get(j)) { // arr[j - 1] > arr[j]
                    swap(arr, j - 1, j);
                }
            }
        }
    }

    // S: O(1), T: O(n), worstCase Complexity-> bure se bura kya hoskta hai.
    // kuch bhi esa kardo jisse shifting naho.
    // sol-> as you find element swap with last element and delete last element
    public static void removeAllEle(ArrayList<Integer> arr, int data) {

    }

    public static void testOfAL() {
        ArrayList<Integer> al = new ArrayList<>();
        int n = scn.nextInt();
        // System.out.println(al + " -> " + al.size());
        while (n-- > 0) {
            int val = scn.nextInt();
            al.add(val);
            // System.out.println(al + " -> " + al.size());
        }

        // System.out.println(al + " -> " + al.size());
        // al.set(2, 150);
        // System.out.println(al + " -> " + al.size());

        System.out.println(al + " -> " + al.size());
        al.remove(al.size() - 1);
        System.out.println(al + " -> " + al.size());

        System.out.println(al.get(1));
        Collections.sort(al);
        System.out.println(al);

    }

    public static void main(String[] args) {
        testOfAL();
        ArrayList<Integer> arr = new ArrayList<>();
        int[] arr1 = { 10, 2, 3, 4, 565, 5675 };
        for (int ele : arr1)
            arr.add(ele);
            
        bubbleSort(arr);

    }
}