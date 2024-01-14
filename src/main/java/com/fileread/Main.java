package com.fileread;

import ch.qos.logback.core.spi.ScanException;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final String COMMA_DELIMITER = ",";
    private static List<Student> stdList = new ArrayList<>();
    private static final String FILE_NAME="C:\\Users\\Chandrika Thapa\\Desktop\\StudentDb.csv";

    public static void main(String[] args) throws IOException {
//        try (BufferedReader br = new BufferedReader(new FileReader(FILE_NAME))) {
//            br.readLine();
//            String line;
//            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
//            while ((line = br.readLine()) != null) {
//                String[] srr = line.split(COMMA_DELIMITER);
//                Student student = new Student();
//                student.setId(Integer.parseInt(srr[0]));
//                student.setName(srr[1]);
//                student.setDateOfBirth(LocalDate.parse(srr[2], formatter));
//                stdList.add(student);
//            }
//        }
//        for(Student std : stdList){
//            System.out.println(std.getId() + " " + std.getName() + " " + std.getDateOfBirth());
//        }

//        Scanner scanner = new Scanner(new File(FILE_NAME));
//        scanner.nextLine();
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
//        while (scanner.hasNextLine()) {
//            String[] srr = scanner.nextLine().split(COMMA_DELIMITER);
//            Student student = new Student();
//            student.setId(Integer.parseInt(srr[0]));
//            student.setName(srr[1]);
//            student.setDateOfBirth(LocalDate.parse(srr[2],formatter));
//            stdList.add(student);
//        }
//
//        for(Student std : stdList){
//            System.out.println(std.getId() + " " + std.getName() + " " + std.getDateOfBirth());
//        }
    }
}
