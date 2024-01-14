package com.java8.interfaces;

@FunctionalInterface
public interface B {
    void display();
    default void myDefault(){
        System.out.println("default of B");
    }

    static void myStatic(){
        System.out.println("Static of B");
    }
}
