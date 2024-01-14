package com.nestedinterface;

interface Showable {
    void show();
    //Nested interfaces are static by default.
    // You don’t have to mark them static explicitly as it would be redundant.
    //Nested interfaces declared inside class can take any access modifier,
    // however nested interface declared inside interface is public implicitly.
    public static interface  Message{
        void msg();
    }
}

class Message implements Showable.Message{

    //Nested interfaces declared inside class can take any access modifier,
    // however nested interface declared inside interface is public implicitly.
    private static interface Messagable{ //default is static.here static keyword is redundant
        void sendMessage();
    }

    class Chandrika implements Messagable{
        @Override
        public void sendMessage(){
            System.out.println("Hello message sent out");
        }
    }

    @Override
    public void msg(){
        System.out.println("Message from nested inner interface");
    }

    public static void main(String[] args) {
        Message msg = new Message();
        msg.msg();
        Message.Chandrika newMsg = new Message().new Chandrika();//non static invokation
        newMsg.sendMessage();
    }
}
