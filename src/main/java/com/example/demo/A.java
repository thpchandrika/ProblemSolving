package com.example.demo;

class A{
    A(){
        System.out.println("constructor A");
    }

    void m(){System.out.println("hello m");}
    void n(){
        System.out.println("hello n");
        this.m();
    }
}

class TestThis4 implements Cloneable{
    public static void main(String args[]) throws CloneNotSupportedException {
//        A a=new A();
//        a.n();

        TestThis4 test = new TestThis4();
        test.main2();
    }

    public  void main2() throws CloneNotSupportedException {
        A a = new A();
        //A anew = (A)((A)a).clone();
      //  anew.n();
    }

}
