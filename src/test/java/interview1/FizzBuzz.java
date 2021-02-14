package interview1;

public class FizzBuzz {
    public static void main(String[] args) {
        fizbuzz(45);
    }
    public static void fizbuzz(int number){
        for(int i=0;i<=number;i++){
            if(i%5==0 && i%3==0){
                System.out.println("fizbuzz");
            }else if(i%5==0){
                System.out.println("buzz");
            }else if(i%3==0){
                System.out.println("fizz");
            }else {
                System.out.println(i);
            }

            }
        }
}
