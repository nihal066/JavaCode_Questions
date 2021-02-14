package map;
import java.util.*;

public class practice {

    public static void main(String[] args){
        Map<String,String> phonebook=new HashMap<>();
        phonebook.put("ayse","1234");
        phonebook.put("ali","2345");
        phonebook.put("duru","23456");//each one is an entry
        phonebook.put("gul","23456");
        phonebook.put("ali",null);

        //Give me all the keys:
        Set<String> keys=phonebook.keySet();
        for (String s:keys) {
            System.out.println(s+":"+phonebook.get(s));
        }
        System.out.println("--------------------");
        //give me all the keys and values

        Set<Map.Entry<String,String>> values=phonebook.entrySet();
        for (Map.Entry<String,String>e:values){
            System.out.println(e.getKey()+":"+e.getValue());

        }



    }
}
