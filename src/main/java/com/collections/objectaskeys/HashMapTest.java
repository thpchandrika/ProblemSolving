package com.collections.objectaskeys;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<MyObject1, Integer> hashMap = new HashMap<>();

        MyObject1 key1 = new MyObject1("Key 1");
        MyObject1 key2 = new MyObject1("Key 2");

        hashMap.put(key1, 10);
        hashMap.put(key2, 20);

        // Retrieving values using the keys
        int value1 = hashMap.get(key1);
        int value2 = hashMap.get(key2);

        System.out.println("Value for key1: " + value1);
        System.out.println("Value for key2: " + value2);
    }
}

@Getter
@AllArgsConstructor
class MyObject1 {
    private String name;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MyObject1 other = (MyObject1) obj;
        return name.equals(other.getName());
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
