package interview1;

public class RandomString {
    public static void main(String[] args) {
        System.out.println(generateRandom(3));
        System.out.println(rndm());
    }

//create a string ,consist of 5 chars

public static String generateRandom(int a){
        String s="";
        for(int i=0;i<a;i++){
            char ch=(char)(int)(97+Math.random()*26);
            s=s+ch;
        }
        return s;


}
//generate a credit card number,consist of 16 digits and starts with 5

    public static String rndm(){
        String str="";
        for(int i=0;i<15;i++){
            str+=(int)(1+Math.random()*9);
        }
        str="5"+str;
        return str;

    }
}