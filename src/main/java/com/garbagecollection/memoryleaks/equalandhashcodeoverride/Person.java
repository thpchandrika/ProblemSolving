package com.garbagecollection.memoryleaks.equalandhashcodeoverride;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Person)) {
            return false;
        }
        Person person = (Person) o;
        return person.name.equals(name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        return result;
    }

    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap<>();
        for(int i=0; i<100; i++) {
            map.put(new Person("jon"), 1);
        }

        for(int i=0; i<100; i++) {
            map.put(new Person("jon"), 1);
        }
        System.out.println(map.size());
        //if we don't override equal and hash it will create memory leak with a lot of objects
    }
}
