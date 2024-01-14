package com.designpattern.factorypattern;

public class EmailNotification implements Notification{

    @Override
    public void notifyUser() {
        System.out.println("Sending email notifications");
    }

}
