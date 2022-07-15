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

    }

    public static void reverseAL(ArrayList<Integer> arr) {

    }

    public static void bubbleSort(ArrayList<Integer> arr) {

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

    }
}