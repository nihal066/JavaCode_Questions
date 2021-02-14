package interview1;

import java.util.Arrays;

public class MergeArrayString {
    public static void main(String[] args) {
        String[] str1={"a","b","c"};
        String[] str2={"d","e","f"};
        System.out.println(Arrays.toString(merge(str1,str2)));
    }
    public static String[] merge(String[] str1,String[] str2){
        String[] str3=new String[str1.length+str2.length];

        for(int i=0;i<str3.length;i++){
            if(i<str1.length){
                str3[i]=str1[i];
            }else{
                str3[i]=str2[i-str1.length];
            }
        }return str3;

    }
}
