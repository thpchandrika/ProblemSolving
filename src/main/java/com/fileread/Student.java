package com.fileread;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
  private int Id;
  private String Name;
  private LocalDate DateOfBirth;
}
