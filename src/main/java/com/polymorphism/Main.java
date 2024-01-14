package com.polymorphism;

import java.io.Serializable;
import java.rmi.Remote;

public class Main {

    public static void main(String[] args){

//        //dynamic polymorphism is not achieved through data members
//        //But data members can be inherited
//        Honda hondaBike = new Honda();
//        Bike bike = new Honda();
//        System.out.println(hondaBike.speedLimit);
//        System.out.println(bike.speedLimit);

//        B b = new B();
//        b.print();
//        b.print("string");

        INoteBook noteBook = new NoteBook();
        noteBook.getNoteBook();
        noteBook.setProduct();
        noteBook.defaultMethodExample();
        System.out.println(INoteBook.counter);
        System.out.println(IProduct.counter);
        //data members in interface are by default static and final
        //data members in interface can be inherited as well
        //System.out.println(INoteBook.counter++);
        //noteBook.getProduct();

        //marker interface test
//        ShapeDAO shapeDAO = new ShapeDAO();
//        System.out.println( shapeDAO.delete(new Entity()));
//        System.out.println( shapeDAO.delete(new Honda()));
    }
}


