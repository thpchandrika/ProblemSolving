package com.garbagecollection.references.strongreference;

public class Example {
    public static void main(String[] args)
    {
        //Strong Reference - by default
        Gfg g = new Gfg();

        //Now, object to which 'g' was pointing earlier is
        //eligible for garbage collection.
        g = null;
    }
}

class Gfg
{
}
