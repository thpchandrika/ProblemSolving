package com.string;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

////        //creates only single string
////        String s1 = "a";
////        String s2 = "a";
////        String s3 = new String("a");
////        System.out.println("s1: "+s1.hashCode());
////        System.out.println("s2: "+s2.hashCode());
////        System.out.println("s3: "+s3.hashCode());
////
////        //this creates two object,one in heap and other in string constant pool
////        String s = new String("HelloWorld");
//        System.out.println("13" + 5 + 3 + 9);
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            System.out.println(s1+ " " + x);
        }
        System.out.println("================================");

    }
}
