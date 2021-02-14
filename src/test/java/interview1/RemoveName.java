package interview1;

import java.util.ArrayList;

public class RemoveName {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("nihal");
        list.add("elana");
        list.add("Donald");
        list.add("Burcu");
        list.add("Donald");
        System.out.println(removeNames(list));

    }


//remove the name of"Donald" from list

public static ArrayList<String> removeNames(ArrayList<String>names){

        for(int i=0;i<names.size();i++){
            if(names.get(i).equals("Donald")){
                names.remove("Donald");
                i--;
            }
        }return names;
    }
}
