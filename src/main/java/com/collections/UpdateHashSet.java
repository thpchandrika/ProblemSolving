package com.collections;

import java.util.HashSet;

class Student {

    public int  id;
    public String name;

    public Student(String name, int id){
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode(){
        return this.id;
    }

    @Override
    public String toString(){
        return "Student:" + this.name + "@" + Integer.toHexString(hashCode());
    }
    @Override
    public boolean equals(Object o){
        if (o instanceof  Student){
            Student s = (Student) o;
            return s.id == this.id ? true: false;
        }
        return false;
    }
}

public class UpdateHashSet{
    public static void main(String[] args) {
        HashSet<Student> studentList = new HashSet<>();
        Student s1 = new Student("Nimit", 1);
        Student s2 = new Student("Rahul", 3);
        Student s3 = new Student("Nimit", 2);
        Student s4 = new Student("Chan", 2);
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        System.out.println(studentList.size());
        System.out.println(studentList);
        s1.id = 3;
        System.out.println(studentList.size());
        System.out.println(studentList);
    }
}
