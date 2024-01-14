package com.collections.daterangefilter;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.time.LocalDate;
import java.util.*;

public class StudentManager {

    private TreeSet<Student> students;

    public StudentManager() {
        students = new TreeSet<>(Comparator.comparing(Student::getDateOfBirth));
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudentsByDateRange(LocalDate startDate, LocalDate endDate) {
        Student startStudent = new Student("", startDate);
        Student endStudent = new Student("", endDate.plusDays(1)); // Add one day to include the end date

        SortedSet<Student> studentSubset = students.subSet(startStudent, endStudent);

        return new ArrayList<>(studentSubset);
    }

    public static void main(String[] args) throws InterruptedException {
        StudentManager manager = new StudentManager();

        // Add some sample students
        manager.addStudent(new Student("John", LocalDate.of(1990, 5, 10)));
        manager.addStudent(new Student("Jane", LocalDate.of(1995, 3, 15)));
        manager.addStudent(new Student("Mike", LocalDate.of(1992, 7, 20)));
        manager.addStudent(new Student("Emily", LocalDate.of(1998, 9, 5)));

        // Fetch students in a date range
        LocalDate startDate = LocalDate.of(1990, 1, 1);
        LocalDate endDate = LocalDate.of(1995, 12, 31);
        List<Student> studentsInRange = manager.getStudentsByDateRange(startDate, endDate);

        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        String processName = runtimeMXBean.getName();
        long processId = Long.parseLong(processName.split("@")[0]);
        System.out.println("Process ID: " + processId);

        Thread.sleep(200000000);

        // Print the students in the range
        for (Student student : studentsInRange) {
            System.out.println(student.getName() + " - " + student.getDateOfBirth());
        }
    }
}
