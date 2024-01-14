package com.string;

public class InternTest {
    public static void main(String[] args)
    {
//        // S1 refers to Object in the Heap Area
//        String s1 = new String("GFG"); // Line-1
//
//        // S2 refers to Object in SCP(String Constant Pool) Area
//        String s2 = s1.intern(); // Line-2
//
//        // Comparing memory locations
//        // s1 is in Heap
//        // s2 is in SCP
//        System.out.println(s1 == s2);
//
//        // Comparing only values
//        System.out.println(s1.equals(s2));
//
//        // S3 refers to Object in the SCP Area
//        String s3 = "GFG"; // Line-3
//
//        System.out.println(s2 == s3);
       // test();
        manualIntern();
    }

    private static void test(){
        String first = "Baeldung";
        String second = "Baeldung";
        System.out.println(first == second); // True

        String third = new String("Baeldung");
        String fourth = new String("Baeldung");
        System.out.println(third == fourth); // False

        String fifth = "Baeldung";
        String sixth = new String("Baeldung");
        System.out.println(fifth == sixth); // False
    }

    public static void manualIntern(){
        //String constantString = "interned Baeldung";
        String newString = new String("interned Baeldung"); //creates object in heap and pool
        String testStr = "interned Baeldung";
        String intern = newString.intern();
        System.out.println(testStr == intern);
//        System.out.println(constantString == newString);
//        //assertThat(constantString).isNotSameAs(newString);
//
//        String internedString = newString.intern();
//        String newNewString = "interned Baeldung";
//        System.out.println(internedString == newNewString);
    }


}
