package com.association;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.*;

@Data
@AllArgsConstructor
class Bank {
    private String name;
    private Set<Employee> employees;

    Bank(String name){
        this.name= name;
    }
}


