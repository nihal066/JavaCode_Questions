package interview1;

public class FaktorialRecursion {
    public static void main(String[] args) {
        System.out.println(faktorial(5));
    }
    public static int faktorial(int num){
        if(num==0){
            return 1;
        }else{
            return num*faktorial(num-1);
        }
    }
}
