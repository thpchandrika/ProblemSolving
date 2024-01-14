package com.string;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutFormatTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d\n", N,i, N*i);
        }

        bufferedReader.close();
    }
}
