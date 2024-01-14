package com.collections;
import org.springframework.context.ApplicationContext;

import java.util.*;

public class SetTests {
        public static void main(String[] args) {

//            Map<String, String> myMap = new HashMap<>() {{
//                put("a", "b");
//                put("c", "d");
//                put("c", "r");
//                put(null, "null");
//                put(null, "nullupate");
//                put("nullx", null);
//                put("nully", null);
//            }};
            Map<String, String> myMap = new Hashtable<>() {{
                put("a", "b");
                put("c", "d");
                put("c", "r");
//                put(null, "null");
//                put(null, "nullupate");
//                put("nullx", null);
//                put("nully", null);
                //null key or value is not alloed
                //duplicate key , replace the previous value
            }};
            Set<String> mySet = new HashSet<>();
            mySet.add("pineaaple");
            mySet.add("Apple");
            mySet.add(null);
            mySet.add("Banana");
            mySet.add("Banana");
            iterateUsingForEach(myMap);
            //iterateSetUsingForEach(mySet);
        }

        public static void iterateUsingForEach(Map<String, String> map) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                System.out.println("Key=" + key + ", Value=" + value);
            }
        }

    public static void iterateSetUsingForEach(Set<String> sets) {
        for (String set : sets){
            System.out.println(set);
        }
    }
}
