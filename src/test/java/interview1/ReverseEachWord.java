package interview1;

public class ReverseEachWord {
    public static void main(String[] args) {
        String str="Java is fun ";
        System.out.println(reverseEach(str));
    }

    public static String reverseEach(String str){
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++){
            String temp="";
            for(int j=arr[i].length()-1;j>=0;j--){
                temp=temp+arr[i].charAt(j);
            }
            arr[i]=temp;
        }

        //I will convert String[] arr to String again because output is String!

        String result="";
        for(int i=0;i<arr.length;i++){
            //in order to avoid the empty space at the end of the sentence , I put a condition

            if(i==arr.length-1){
                result+=arr[i];
            }else{
                result+=arr[i]+" ";}

        }return result;

    }






}
