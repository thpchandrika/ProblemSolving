package com.exceptionhandliing;

import java.sql.SQLException;

public class ParentClass {
    public void display() throws SQLException {
        throw  new SQLException("SQL exception from parent class");
    }
}
