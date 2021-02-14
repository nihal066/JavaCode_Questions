package map;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MapTask {

    public static void main(String[] args) throws IOException {
//		Write a program using Map interface that counts the occurrences of words in a text
//		and displays the words and their occurrences in alphabetical order of the words.


        BufferedReader br = new BufferedReader(new FileReader("Sherlock Holmes.txt"));

        String text = "";
        String read = "";

        while((read = br.readLine()) != null) {  // read a whole line and store into a String

            text += read + " ";
        }

        System.out.println(text);

        String[] split = text.split("[ \n\t.,;:?]");

        System.out.println(Arrays.toString(split));

        //
        Map<String, Integer> words  = new TreeMap<>();


        for (String string : split) {

            string = string.toLowerCase();

            if(string.length()>0) {

                if(!words.containsKey(string)) {
                    words.put(string, 1);
                }else {
                    int count = words.get(string);
                    count++;
                    words.put(string, count);
                }
            }





        }

        System.out.println(words);

        Set<Entry<String, Integer>> entrySet = words.entrySet();  //to print each entry on a separete line

        for (Entry<String, Integer> entry : entrySet) {
            System.out.println(entry);
        }




    }

    // To=2, Sherlock=5, Holmes=7,

}


