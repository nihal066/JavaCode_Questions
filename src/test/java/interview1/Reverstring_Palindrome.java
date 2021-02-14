package interview1;

public class Reverstring_Palindrome {
    public static void main(String args[]) {
        System.out.println(reverse("ADA"));
        System.out.println(isPalindrome("Ada"));


    }
     public static String reverse(String str){
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }return reverse;
     }

     public static boolean isPalindrome(String str){
        if(reverse(str).equals(str)){
            return true;
        }
        else{
            return false;
        }
     }

}
