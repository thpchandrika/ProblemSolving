package com.nestedclass.methodorlocalinnerclass;

import com.nestedclass.Person;

import java.util.Arrays;
import java.util.Comparator;

public class PersonData {

    public static void main(String[] args) {
        PersonData pd = new PersonData();
        Person[] persons = prepareData();
        pd.sort(persons);
        System.out.println(Arrays.toString(persons));
    }

    private void sort(Person[] persons){

        final int a=2;

        //NameComparator is local inner class in this context
        class NameComparator implements Comparator<Person>{

            @Override
            public int compare(Person p1, Person p2){
                return p1.getName().compareTo(p2.getName());
            }
        }
        Arrays.sort(persons, new NameComparator());
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
