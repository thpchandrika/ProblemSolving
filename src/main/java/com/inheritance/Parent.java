package com.inheritance;

class Parent {

    Parent(){
        System.out.println("Deafuls const of parent");
    }
    Parent(String x) {
        System.out.println("Non default const of parent");
    }
}

class Child extends Parent {

    int x= 0;

    Child(String str){
        //super("String");
        super(); // it is called by default even if we don't specify
        System.out.println("Non default const of child");
    }

    Child() {
//        super("String");
//        this.x = 45;
        System.out.println("Deafults const of child");
    }
}
