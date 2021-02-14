package interview1;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sum(45));
    }
    public static int sum(int num){
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num=num/10;
        }return sum;
}}
