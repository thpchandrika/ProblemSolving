package com.garbagecollection.elligibleforgc;

/* Java program to demonstrate gc
 when object reference changed to NULL */
public class Test3 {
    // to store object name
    String obj_name;

    public Test3(String obj_name)
    {
        this.obj_name = obj_name;
    }

    // Driver method
    public static void main(String args[])
    {
        Test t1 = new Test("t1");

        /* t1 being used for some purpose in program */

        /* When there is no more use of t1, make the object
           referred by t1 eligible for garbage collection */
        t1 = null;

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
