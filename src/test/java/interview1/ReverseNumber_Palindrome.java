package interview1;

public class ReverseNumber_Palindrome {

    public static void main(String[]args){

        System.out.println(reverse(1234));
        System.out.println(isPalindrome(12231));


    }

    //write a method and reverse the number , than check if it is palindrome
    public static int reverse(int number){
        int reverse=0;
        while(number>0){
            int lastDigit=number%10;
            reverse=reverse*10+lastDigit;
            number=number/10;
        }
        return reverse;
    }

    public static boolean isPalindrome(int num){
        if(reverse(num)==num){

            return true;
        }
        return false;
    }


}
