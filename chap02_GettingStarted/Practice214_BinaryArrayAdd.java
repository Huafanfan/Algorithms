package chap02_GettingStarted;

import java.util.Arrays;

public class Practice214_BinaryArrayAdd {
    static int n = 6;
    static int[] a = new int[]{0,1,0,1,1,1};
    static int[] b = new int[]{0,0,1,1,1,0};
    static int[] c = new int[n+1];

    public static void binaryAdd(){
        int carry = 0;
        for (int i=n-1; i>=1; i--){
            int sum = a[i] + b[i] + carry;
            carry = sum / 2;
            c[i+1] = sum % 2;
        }
        if (carry != 0){
            c[1] = carry;
        }
        System.out.println(Arrays.toString(c));
    }
    public static void main(String[] args) {
        binaryAdd();
    }
}
