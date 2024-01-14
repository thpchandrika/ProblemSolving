package com.datastructure.hashsetandhashmap;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(12, "John");
        hm.put(2, "Smith");
        hm.put(7, "Peter");
        hm.put(null, "Bakeley");
        System.out.println("HashMap object output : " + hm);
        hm.put(12, "Smith");
        hm.put(null,"Shanta");
        System.out.println("After inserting duplicate key : " + hm);
        hm.put(5,null);
        hm.put(6, null);
        System.out.println("After inserting multiple null values " + hm);

        //is a key value pair
        //multiple null value can be inserted
        //single null key, if duplicate key is inserted it's value is updated with new one
        //put mehtod to add new items(key,value)
    }
}
