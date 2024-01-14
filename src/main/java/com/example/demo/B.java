package com.example.demo;

class B{
    B(){
        this(20);
        System.out.println("hello a");
    }
    B(int x){
        //this();
        System.out.println(x);
    }
}
class TestThis5{
    public static void main(String args[]){
        //B a=new B(10);
        B a=new B();
    }}
