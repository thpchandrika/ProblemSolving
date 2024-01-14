package com.staticdemo.test;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.Arrays;

public class CharArrayInput {

    public static void main(String[] args) throws IOException {
        String obj  = "abcdefgh";
        double a = 90.00;
        System.out.println(obj + a);
        Object[] names = new String[3];
        Object test = new Integer(0);
        System.out.println(test);
       // names[0] = new Integer(0);
//        boolean isActive;
//        System.out.println(isActive);
        int length = obj.length();
        char c[] = new char[length];
        obj.getChars(0, length, c, 0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c, 1, 4);
        System.out.println(input1.read());
        System.out.println(input2.read());
        int i;
        int j;
        int arr[] = new int[5];
        System.out.print(arr);
        try
        {
            while((i = input1.read()) == (j = input2.read()))
            {
                System.out.print((char)i);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public class ReturnIt
    {
        double methodA(byte x, double y) /* Line 3 */
        {
            return (long)x / y * 2;
        }
    }
}
