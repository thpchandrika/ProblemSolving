package com.polymorphism;

public interface INoteBook extends IProduct{

     //int counter= 2;

     void getNoteBook();
     private void print(){
          System.out.println(counter);
     }
     default void defaultMethodExample() {
          print();
          System.out.println("Inside a default method of INotebook\n");
     }
}
