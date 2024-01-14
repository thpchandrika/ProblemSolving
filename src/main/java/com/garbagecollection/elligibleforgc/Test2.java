package com.garbagecollection.elligibleforgc;


import lombok.AllArgsConstructor;

/* Java program to demonstrate gc
 when one object referred to other object */
//2.Reassigning the reference variable
@AllArgsConstructor
public class Test2 {
    // to store object name
    String obj_name;

    // Driver method
    public static void main(String args[])
    {
        Test t1 = new Test("t1");
        Test t2 = new Test("t2");

        //t1 now referred to t2
        t1 = t2;

        // calling garbage collector
        System.gc();
        System.runFinalization();
    }

    @Override
    /* Overriding finalize method to check which object
    is garbage collected */
    protected void finalize() throws Throwable
    {
        // will print name of object
        System.out.println(this.obj_name + " successfully garbage collected");
    }

}
