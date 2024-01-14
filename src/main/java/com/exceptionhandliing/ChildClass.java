package com.exceptionhandliing;

import java.io.IOException;

public class ChildClass extends ParentClass{

    @Override
    public void display()  {
        throw  new RuntimeException("runtime exceptions"); //can throw runtime, may not throw but
        //cannot know other checked exception other than parent class
    }
}
