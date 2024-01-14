package com.serialization;

import java.io.*;
import java.util.Base64;

public class SerializationUtility {

    public static String serializeObjectToString(Serializable o) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(o);
        objectOutputStream.close();
        return Base64.getEncoder().encodeToString(byteArrayOutputStream.toByteArray());
    }

    public static Object deSerializeObjectFromString(String s)
            throws IOException, ClassNotFoundException {

        byte[] data = Base64.getDecoder().decode(s);
        ObjectInputStream objectInputStream = new ObjectInputStream(
                new ByteArrayInputStream(data));
        Object object = objectInputStream.readObject();
        objectInputStream.close();
        return object;
    }
}
