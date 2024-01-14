package com.polymorphism;

public class NoteBook implements INoteBook{
    @Override
    public void getNoteBook() {
        System.out.println("Getting notebook");
    }

    @Override
    public void setProduct() {
        System.out.println("setting products");
    }
}
