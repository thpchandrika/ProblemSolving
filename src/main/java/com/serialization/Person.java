package com.serialization;

import lombok.Data;

import java.io.Serializable;

@Data
public class Person implements Serializable {
    //private static final long serialVersionUID = 2L;
    static String country = "ITALY";
    private int age;
    private String name;
    transient int height; //ignore in serialization
}
