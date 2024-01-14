package com.nestedclass.memberinnerclass;

import com.nestedclass.Person;

import java.util.Arrays;
import java.util.Comparator;

public class PersonData {
    private class NameComparator implements Comparator<Person>{
        @Override
        public int compare(Person p1, Person p2){
            return p1.getName().compareTo(p2.getName());
        }
    }

    public static void main(String[] args) {
        PersonData pd = new PersonData();
        Person[] persons = prepareData();
        Arrays.sort(persons, pd.getNameComparator());
        System.out.println(Arrays.toString(persons));
    }

    private NameComparator getNameComparator() {
        return new NameComparator();
    }

    private static Person[] prepareData() {
       Person[] persons = {
               new Person("chandrika", 28),
               new Person("ram",25),
               new Person("hary",21),
               new Person("aron", 40)
       };
       return persons;
    }

}
