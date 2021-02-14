package interview1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 1, 2, 3));
        System.out.println(removeDup(list));
    }


//remove the duplicates from list ,unique ones should stay, without using collection class

    public static ArrayList<Integer> removeDup(ArrayList<Integer> numbers) {

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(i).equals(numbers.get(j))) {
                    numbers.remove(j);
                }
            }
        }
        return numbers;


    }
}