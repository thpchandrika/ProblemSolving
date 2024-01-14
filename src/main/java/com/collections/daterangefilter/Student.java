package com.collections.daterangefilter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Student {
    private String name;
    private LocalDate dateOfBirth;
}
