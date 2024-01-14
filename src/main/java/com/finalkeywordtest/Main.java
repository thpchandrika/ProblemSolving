package com.finalkeywordtest;

public class Main {

       public static void main(String[] args){
        //String is immutable
        String a = "foo";
        a.concat("bar");
        System.out.println(a); //prints foo, does not modify a and place value in a.

        String b = "foo";
        b = b.concat("bar");
        System.out.println(b); //prints foobar, modify b and creates new String b with concatenation.

        //Since String does not modify the same objects, it is immutable in Java.
        //All wrapper class in Java are immutable


    }
}
