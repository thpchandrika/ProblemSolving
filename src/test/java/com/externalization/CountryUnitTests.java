package com.externalization;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.*;

import static junit.framework.TestCase.assertTrue;

public class CountryUnitTests {

    private final static String OUTPUT_FILE_NAME = "externalizable.txt";

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

    private File outputFile;

    @Before
    public void setUp() throws Exception {
        outputFile = tempFolder.newFile(OUTPUT_FILE_NAME);
    }

    @Test
    public void whenSerializing_thenUseExternalizable()
            throws IOException, ClassNotFoundException {

        Country c = new Country();
        c.setCode(374);
        c.setName("Armenia");
        c.setCapital("ArmenCapital");

        FileOutputStream fileOutputStream
                = new FileOutputStream(outputFile);
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        c.writeExternal(objectOutputStream);

        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream
                = new FileInputStream(outputFile);
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);

        Country c2 = new Country();
        c2.readExternal(objectInputStream);

        objectInputStream.close();
        fileInputStream.close();

        assertTrue(c2.getCapital().equals(c.getCapital()));
        assertTrue(c2.getCode() == c.getCode());
        assertTrue(c2.getName().equals(c.getName()));

    }
}
