package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> listStrings = new ArrayList<String>();
        listStrings.add("Priya");
        listStrings.add("Neha");
        listStrings.add("Shreya");
        listStrings.add("Nidhi");
        listStrings.add("Nithya");
        System.out.println(listStrings.get(1));
        System.out.println(listStrings.get(2));
        System.out.println(listStrings.get(3));
        listStrings.remove("Nidhi");
        listStrings.remove("Nithin");
        listStrings.contains("Neha");
        listStrings.size();



    }
}
