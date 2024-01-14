package com.garbagecollection.elligibleforgc;

/* Java program to demonstrate gc
 of anonymous objects */
public class Test4 {

    // to store object name
    String obj_name;

    public Test4(String obj_name)
    {
        this.obj_name = obj_name;
    }

    // Driver method
    public static void main(String args[])
    {
        //anonymous object without reference id
        new Test("t1");

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
