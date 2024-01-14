package com.serialization;

import java.io.Externalizable;
import java.io.IOException;

import static com.serialization.SerializationUtility.deSerializeObjectFromString;
import static com.serialization.SerializationUtility.serializeObjectToString;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        AppleProduct macBook = new AppleProduct();

        macBook.setHeadphonePort("headphonePort2020");
        macBook.setThunderboltPort("thunderboltPort2020");
        macBook.setEarphone("earphone");

        NewAppleProduct newApple = new NewAppleProduct();
        newApple.setName("New Apple");

        macBook.setNewAppleProduct(newApple);

        String serializedString = serializeObjectToString(macBook);
        System.out.println("Serialized AppleProduct object to string:");
        System.out.println(serializedString);

        String serializedStringTest = "rO0ABXNyAB5jb20uc2VyaWFsaXphdGlvbi5BcHBsZVByb2R1Y3QAAAAAUDBXQQIAAkwADWhlYWRwaG9uZVBvcnR0ABJMamF2YS9sYW5nL1N0cmluZztMAA90aHVuZGVyYm9sdFBvcnRxAH4AAXhwdAARaGVhZHBob25lUG9ydDIwMjB0ABN0aHVuZGVyYm9sdFBvcnQyMDIw";
        System.out.println("Deserializing AppleProduct...");

        AppleProduct deserializedObj = (AppleProduct) deSerializeObjectFromString(serializedString);

        System.out.println("Headphone port of AppleProduct:" + deserializedObj.getHeadphonePort());
        System.out.println("Thunderbolt port of AppleProduct:" + deserializedObj.getThunderboltPort());
        System.out.println("Earphone of AppleProduct:" + deserializedObj.getEarphone());
        System.out.println("Earphone of AppleProduct:" + deserializedObj.getNewAppleProduct());
    }
}
