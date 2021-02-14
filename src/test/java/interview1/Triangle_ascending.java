package interview1;

public class Triangle_ascending {
    public static void main(String[] args) {
        getTriangleAscending(10);
    }

    public static void getTriangleAscending(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }System.out.println();
        }
    }
}
