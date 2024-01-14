package com.collections.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>(new MyComparator());
        treeMap.put("Apple",2);
        treeMap.put("Cat",3);
        treeMap.put("Pineapple",1);
        //System.out.println("Value of A=" + treeMap.get("A"));

        for (String key : treeMap.keySet()){
            System.out.println("Key = " + key + " " + "Value= " + treeMap.get(key));
        }

    }
}

class MyComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()) return 1;
        else if (o1.length() < o2.length()) return -1;
        else return 0;
    }
}
