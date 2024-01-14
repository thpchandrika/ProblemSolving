package com.overloadingoverriding;

public class Main {
    public static void main(String[] args){
       Main main = new Main();
       main.main();
    }

    public void main(){
        System.out.println("overloaded main");
    }

//    public String print(String name, int age){
//        System.out.println(name+ age);
//    }
//
//    public void print(String name, int age){
//        System.out.println(name + age);
//    }
}
