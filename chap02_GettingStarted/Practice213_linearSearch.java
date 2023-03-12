package chap02_GettingStarted;

public class Practice213_linearSearch {
    public static int[] a = new int[]{0,2,4,6,8};
    public static int[] b = new int[]{};
    public static Integer search(int[] A, int target){
        for (int i=1; i<A.length; i++){
            if (A[i] == target){
                return i;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(search(a, 2));
        System.out.println(search(a, 3));
        System.out.println(search(b, 2));
    }
}
