package com.collections.objectaskeys;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<MyObject, Integer> treeMap = new TreeMap<>(new MyComparator());

        MyObject key1 = new MyObject("Cat");
        MyObject key2 = new MyObject("Pineapple");
        MyObject key3 = new MyObject("Apple");

        treeMap.put(key1, 10);
        treeMap.put(key2, 20);
        treeMap.put(key3, 90);

      for (MyObject key : treeMap.keySet()){
          System.out.println(key.getName());
      }
    }
}

//@Getter
//@AllArgsConstructor
//class MyObject implements Comparable<MyObject> {
//    private String name;
//
//    @Override
//    public int compareTo(MyObject other) {
//        return this.name.compareTo(other.getName());
//    }
//}

@Getter
@AllArgsConstructor
class MyObject {
    private String name;
}

class MyComparator implements Comparator<MyObject>{

    @Override
    public int compare(MyObject o1, MyObject o2) {
        if (o1.getName().length() > o2.getName().length())
            return 1;
        else if (o1.getName().length() < o2.getName().length())
            return -1;
        else
            return 0;
    }
}

