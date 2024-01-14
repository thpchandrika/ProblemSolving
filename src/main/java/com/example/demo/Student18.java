package com.example.demo;

class Student18 implements Cloneable{
    int rollno;
    String name;

    Student18(int roll,String name){
        this.rollno=roll;
        this.name=name;
    }

    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String args[]){
        try{
            Student18 s1=new Student18(101,"amit");

            Student18 s2=(Student18)s1.clone();

            System.out.println(s1.rollno+" "+s1.name);
            System.out.println(s2.rollno+" "+s2.name);

        }catch(CloneNotSupportedException c){}

    }
}  
