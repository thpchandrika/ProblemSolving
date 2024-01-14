package com.datastructure.hashsetandhashmap;

import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("John");
        hs.add("Smith");
        hs.add("Peter");
        System.out.println("Before adding duplicate values " + hs);
        hs.add("John");
        hs.add("Smith");
        System.out.println("After adding duplicate values " + hs);
        hs.add(null);
        hs.add(null);
        System.out.println("After adding null value " + hs);

        //single null value is allowed
        //not a key value pair, only object
        //does not allow duplicate value
        //add() method to add new elements

    }
}
