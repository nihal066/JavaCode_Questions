package interview1;

public class FindAvgString {
    public static void main(String[] args) {
        String str="123456";
        System.out.println(avg(str));
    }

    public static double avg(String str){
        String[] arr=str.split("");
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=Double.parseDouble(arr[i]);
        } double avg=sum/arr.length;
        return avg; }}
