package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapOperations {
    public static void main(String[] args) {

        Map<String,Integer> scores = new HashMap<>();
        //add values to hashmap
        scores.put("Ganguly",183);
        scores.put("Tendulkar",200);
        scores.put("Sehwag",209);

        //retrieve/check values
        System.out.println(scores.get("Tendulkar"));
        System.out.println(scores.containsValue(200));
        System.out.println(scores.containsKey("Sehwag"));

        //iterate using keySet
        for(String player: scores.keySet()){
            System.out.println(player+" highest score : "+scores.get(player));
        }
        scores.put("Dravid",150);
        System.out.println(scores.entrySet());

        //remove
        scores.remove("Ganguly");

        //iterate using entrySet
        for(Map.Entry<String,Integer> entry: scores.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
        //print entirely
        System.out.println(scores.values());
        System.out.println(scores.keySet());

    }
}