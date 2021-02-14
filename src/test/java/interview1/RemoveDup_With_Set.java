package interview1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDup_With_Set {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Katya");
        list.add("Nastya");
        list.add("Katya");
        list.add("Katerina");
        list.add("Nastya");
        list.add("Dilmurod");
        System.out.println("before: "+list);
        System.out.println("after: "+remove(list));

    }
    public static Set<String> remove(ArrayList<String> list){

        Set<String> set = new LinkedHashSet<>(list);

        return set;

    }
}
