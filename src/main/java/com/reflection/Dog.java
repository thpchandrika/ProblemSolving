package com.reflection;

public class Dog extends Animal {

    // public constructor without parameter
    public Dog() {

    }

    // private constructor with a single parameter
    private Dog(int age) {

    }

    public String type;
    private String color;

    public  void display(){
        System.out.println("I am a dog");
    }

    private void makeSound() {
        System.out.println("Bark Bark");
    }
}
