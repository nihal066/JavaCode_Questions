package interview1;

public class Triangle_Descending {
    public static void main(String[] args) {
      getTriangleDescending(10);
    }
    public static void getTriangleDescending(int num){
        for(int i=10;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
