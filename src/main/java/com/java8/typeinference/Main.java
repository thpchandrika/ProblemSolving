package com.java8.typeinference;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Java earlier versions
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(100);
        numbers.add(101);
        System.out.println(numbers);
        // Java 7 version
        numbers = new ArrayList<>();
        numbers.add(102);
        numbers.add(103);
        System.out.println(numbers);

        //n Java 8, type inference is improved so that we can call generic methods
        // without specifying the type.
        addMore(new ArrayList<>(), 12, 12);
    }

    static void addMore(List<Integer> list, int a, int b) {
        list.add(a);
        list.add(b);
        System.out.println(list);
    }
}
