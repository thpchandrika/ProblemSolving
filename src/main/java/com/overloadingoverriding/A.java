package com.overloadingoverriding;

public class A {

    A get() {
        System.out.println("SuperClass");
        return this;
    }

//    Integer get() {
//        System.out.println("SuperClass");
//        return 4;
//    }
}
