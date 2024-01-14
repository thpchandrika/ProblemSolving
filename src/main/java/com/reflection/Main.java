package com.reflection;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException {
//       Dog d1 = new Dog();
//       Class dogReflectionClass = d1.getClass();
//       //Class dogReflectionClass = Dog.class;
//       Method[] methods = dogReflectionClass.getDeclaredMethods();
//       for (Method method : methods){
//           System.out.println(method.getName());
//           System.out.println(Modifier.toString(method.getModifiers()));
//           System.out.println(method.getReturnType());
//           method.invoke(method,null);
//       }

//        //field reflections
//        try {
//            Dog d1 = new Dog();
//            Class obj = d1.getClass();
//
//            Field field1 = obj.getField("type");
//            field1.set(d1, "labrador");
//
//            // get the value of the field type
//            String typeValue = (String) field1.get(d1);
//            System.out.println("Value: " + typeValue);
//
//            // get the access modifier of the field type
//            int mod = field1.getModifiers();
//
//            // convert the modifier to String form
//            String modifier1 = Modifier.toString(mod);
//            System.out.println("Modifier: " + modifier1);
//            System.out.println(" ");
//
//            // access the private field color
//            Field field2 = obj.getDeclaredField("color");
//            field2.setAccessible(true);
//            field2.set(d1,"brown");
//
//            // get the value of field color
//            String colorValue = (String) field1.get(d1);
//            System.out.println("Value: " + colorValue);
//
//            // get the access modifier of color
//            int mod2 = field2.getModifiers();
//            // convert the access modifier to string
//            String modifier2 = Modifier.toString(mod2);
//            System.out.println("Modifier: " + modifier2);
//        }
//
//        catch (Exception e) {
//            e.printStackTrace();
//        }

        try {
            // create an object of Dog
            Dog d1 = new Dog();

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // get all constructors of Dog
            //Constructor[] constructors = obj.getConstructors(); //gets only public constructors
            Constructor[] constructors = obj.getDeclaredConstructors(); //gets all constructors

            for (Constructor c : constructors) {

                // get the name of constructors
                System.out.println("Constructor Name: " + c.getName());

                // get the access modifier of constructors
                // convert it into string form
                int modifier = c.getModifiers();
                String mod = Modifier.toString(modifier);
                System.out.println("Modifier: " + mod);

                // get the number of parameters in constructors
                System.out.println("Parameters: " + c.getParameterCount());
                System.out.println("");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }



    }
}
