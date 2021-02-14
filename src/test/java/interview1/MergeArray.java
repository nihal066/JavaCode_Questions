package interview1;

import java.util.Arrays;

public class MergeArray {

    public static void main(String[] args) {
        int[] num1={1,2,3,4};
        int[] num2={5,6,7};
        System.out.println(Arrays.toString(mergeArray(num1,num2)));


    }

    public static int[] mergeArray(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        for (int i = 0; i < c.length; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else {
                c[i] = b[i - a.length];
            }
        }return c;

    }
}
