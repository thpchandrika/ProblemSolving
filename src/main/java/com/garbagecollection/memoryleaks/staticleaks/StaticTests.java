package com.garbagecollection.memoryleaks.staticleaks;
import java.util.ArrayList;
import java.util.List;

//heavy use of static fields cause memory leaks
public class StaticTests {
    public static List<Double> list = new ArrayList<>();

    public void populateList() {
        for (int i = 0; i < 10000000; i++) {
            list.add(Math.random());
        }
        System.out.println("Debug Point 2");
    }

    public static void main(String[] args) {
        System.out.println("Debug Point 1");
        new StaticTests().populateList();
        System.out.println("Debug Point 3");
    }
}

//    How to Prevent It?
//        Minimize the use of static variables.
//        When using singletons, rely upon an implementation that lazily loads the object,
//        instead of eagerly loading.
