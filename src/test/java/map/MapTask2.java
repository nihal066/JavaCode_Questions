package map;
import java.util.HashMap;
import java.util.Map;

public class MapTask2 {


        public static void main(String[] args) {
            //Write a method that will count number of each char in a String and returns the map



            System.out.println(countChar("occurrences")); //-> {a=1, b=2, c=1, d=4}
        }



        public static Map<Character, Integer> countChar(String str){

            Map<Character, Integer> map = new HashMap<>();


            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);

                if(!map.containsKey(each)) {
                    map.put(each, 1);
                }else {
                    Integer count = map.get(each);
                    count++;
                    map.put(each, count);
                }



            }





            return map;
        }


    }


