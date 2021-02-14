package interview1;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getFibonacci(5)));


    }
    public static int[] getFibonacci(int number){
        int[] nums=new int[number];
        for(int i=0;i<nums.length;i++){
            if(i==0 || i==1){
                nums[i]=1;
                continue;
            }
            nums[i]=nums[i-1]+nums[i-2]; }
        return nums;
    }



}
