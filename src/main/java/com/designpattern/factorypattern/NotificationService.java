package com.designpattern.factorypattern;

public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification smsNotification =  factory.createNotification("SMS");
        Notification emailNotification =  factory.createNotification("EMAIL");
        Notification pushNotification =  factory.createNotification("PUSH");
        smsNotification.notifyUser();
        emailNotification.notifyUser();
        pushNotification.notifyUser();
    }
}
