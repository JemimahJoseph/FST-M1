package Activities;

import java.util.HashMap;

public class Activity11    {
    public static void main(String[] args){
     HashMap<String, Integer> colours = new HashMap<String, Integer>();
        colours.put("Red", 1);
        colours.put("White", 2);
        colours.put("Green", 3);
        colours.put("Blue", 4);
        colours.put("Grey", 5);
        colours.remove("Grey",5);
        colours.containsValue("Green");
        System.out.println("Getting size:" +colours.size());

    }
}

