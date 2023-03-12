package chap02_GettingStarted;

import java.util.Arrays;

public class Practice212_InsertSortDesc {

    public static int[] a = new int[]{0,6,5,3,7,9,8};

    public static int[] b = new int[]{0,6,5,3,7,9,8};
    public static void insertSort(int[] A){
        for (int j=2; j<A.length; j++){
            int key = A[j];
            int i = j-1;
            while (i > 0 && A[i] > key){
                A[i+1] = A[i];
                i--;
            }
            A[i+1] = key;
        }
    }

    public static void insertSortDesc(int[] A){
        for (int j=2; j<A.length; j++){
            int key = A[j];
            int i = j-1;
            while (i > 0 && A[i] < key){
                A[i+1] = A[i];
                i--;
            }
            A[i+1] = key;
        }
    }

    public static void main(String[] args) {
        insertSort(a);
        System.out.println(Arrays.toString(a));

        insertSortDesc(b);
        System.out.println(Arrays.toString(b));
    }
}
