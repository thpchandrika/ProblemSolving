package com.staticdemo;


public class Main {

    static int count;
    int counter;

    Main(){
        count = 1;
        counter++;
    }

    public static void main(String[] args) {

       Main main = new Main();
       //main.test1();
        main.test();
       //A.test();
    }

    static public void test1(){
        System.out.println("static method of outer class");
    }

    public void test(){
        System.out.println(counter);
        System.out.println(count);
        System.out.println("testing methods");
    }

//    public  static class   A{
//
//        public void test(){
//            Main.test1();
//            Main main = new Main();
//            main.test();
//            System.out.println("this is inner static class");
//        }
//
//        Main main = new Main();
//
//    }

}
