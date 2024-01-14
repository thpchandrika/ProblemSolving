package com.polymorphism;

public interface IProduct {

    int counter=1;
    private void getProduct(){
        System.out.println("printing getproduct from private methods");
    }

    default void defaultMethodExample() {
        System.out.println("Inside a default method of IProduct\n");
        getProduct();
    }

    void setProduct();

}
