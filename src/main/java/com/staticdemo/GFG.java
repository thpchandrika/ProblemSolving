package com.staticdemo;

class GFG {

    // Constructor of this class
    GFG() {
        System.out.println("constructor");
    }

    // Method of this class
    public static void print() {
        System.out.println("printing");
    }

    static{
        System.out.println("static block");
        print();
    }

    class Inner{
        static {
            System.out.println("Inner class static block");
        }

        public  static void main(String[] args){

        }
    }

    public static void main(String[] args) {

        // Calling of method inside main()
        GFG geeks = new GFG();
        geeks.print();

//
//        // Calling of constructor inside main()
//        new GFG();

        // Calling of static block
        // Nothing to do here as it is called
        // automatically as class is loaded in memory

    }
}
