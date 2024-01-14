package com.java8.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SimpleIterator {
    public static void main(String[] args)
    {

        // create a linkedlist
        List<String> list = new LinkedList<>();

        // Add elements
        list.add("Welcome");
        list.add("to");
        list.add("our");
        list.add("website");

        // print the list to the console
        System.out.println("The list is given as : " + list);

        // call iterator on the list
        Iterator<String> itr = list.iterator();

        // itr.hasNext() returns true if there
        // is still an element next to the current
        // element pointed by iterator
        while (itr.hasNext()) {
            // Returns the next element.
            System.out.println(itr.next());
        }

        // Removes the last element.
        itr.remove();

        // print the list after removing an
        // element
        System.out.println(
                "After the remove() method is called : "
                        + list);
    }
}
