package com.java8.interfaces;

public  class C implements A, B{

    @Override
    public void display() {
        System.out.println("display of C");
    }

    //abstract public void display();

    @Override
    public void myDefault() {
       A.super.myDefault();
       B.super.myDefault();
    }

    public static void myStatic(){
        A.myStatic();
        B.myStatic();
    }

    public static void main(String[] args) {
           C c = new C();
           c.display();
           c.myDefault();
           myStatic();
    }
}
