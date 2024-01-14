package com.overloadingoverriding;

public class B extends A{

    @Override
    B get() {
        System.out.println("SubClass");
        return this;
    }

//    @Override
//    Integer get() {
//        System.out.println("SubClass");
//        return 5;
//    }

    public static void main(String[] args) {
        A tester = new B();
        tester.get();
    }
}
