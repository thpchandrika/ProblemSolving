package com.garbagecollection.references.softreference;

import java.lang.ref.SoftReference;

public class Example {
    public static void main(String[] args) {
        // Strong Reference
        Gfg g = new Gfg();
        g.x();

        // Creating Soft Reference to Gfg-type object to which 'g'
        // is also pointing.
        SoftReference<Gfg> softRef = new SoftReference<Gfg>(g);

        // Now, Gfg-type object to which 'g' was pointing
        // earlier is available for garbage collection.
        g = null;

        // You can retrieve back the object which
        // has been weakly referenced.
        // It successfully calls the method.
        g = softRef.get();
        g.x();
    }
}

class Gfg
{
    //code..
    public void x()
    {
        System.out.println("GeeksforGeeks");
    }
}
