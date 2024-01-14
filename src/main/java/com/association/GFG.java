package com.association;
import java.util.HashSet;
import java.util.Set;
import static com.finalkeywordtest.A.*; //static import imports static members and methods.

class GFG {

    public static void main(String[] args)
    {
        Bank bank = new Bank("ICICI");
        Employee emp = new Employee("Ridhi");

        Set<Employee> employees = new HashSet<>();
        employees.add(emp);

        bank.setEmployees(employees);

        System.out.println(emp.getName()
                + " belongs to bank "
                + bank.getName());

//        //static import tests
//        printName(); //static methods of com.finalkeywordtest pacakge
//       // printAge(); //cannot import non static
//        System.out.println(a); //can access static members
//        //System.out.println(b); //cannot access non static members
    }
}