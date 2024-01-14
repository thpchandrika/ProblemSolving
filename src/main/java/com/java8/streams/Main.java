package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("chandrika");
        list.add("raman");
        list.add("shyam");
        list.add("chan");
        Main main = new Main();
        List<String> filterResult = main.find(list,"c");
        System.out.println(Arrays.asList(filterResult));

//        List<String> myList = new ArrayList<String>();

//        //Debugging using peek
//        List<String> list = Arrays.asList("apple", "banana", "cat");
//        list.stream()
//                .peek(System.out::println)
//                .forEach(System.out::println);

    }

    public List<String> find(List<String> list, String letter){
        return list.stream()
                .filter(name -> name.startsWith(letter))
                .map(name -> name.toUpperCase())
//                .peek(System.out::println)
                .limit(1)
                .collect(Collectors.toList());

    }


}
