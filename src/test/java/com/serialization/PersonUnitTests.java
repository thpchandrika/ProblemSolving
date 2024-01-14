package com.serialization;

import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.rules.TemporaryFolder;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

//@SpringBootTest
public class PersonUnitTests {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    private File outputFile;

    private File outputFile2;

    @Before
    public void setUp() throws Exception {
        outputFile = tempFolder.newFile("yourfile.txt");
        outputFile2 = tempFolder.newFile("yourfile2.txt");
    }

    @Test
    public void whenSerializingAndDeserializing_ThenObjectIsTheSame()
            throws IOException, ClassNotFoundException {
        Person person = new Person();
        person.setAge(20);
        person.setName("Joe");

        FileOutputStream fileOutputStream
                = new FileOutputStream("yourfile.txt");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream
                = new FileInputStream("yourfile.txt");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        Person p2 = (Person) objectInputStream.readObject();
        objectInputStream.close();

        assertTrue(p2.getAge() == person.getAge());
        assertTrue(p2.getName().equals(person.getName()));
    }
}
