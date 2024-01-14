package com.java8.interfaces;

@FunctionalInterface
public interface A {
    void display();
    default void myDefault(){
        System.out.println("default of A");
    }

    static void myStatic(){
        System.out.println("Static of A");
    }
}
