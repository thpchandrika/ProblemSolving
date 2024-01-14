package com.polymorphism;

public class ShapeDAO {

    public boolean delete(Object object) {
        if (!(object instanceof Deletable)) {
            return false;
        }
        return true;
    }

}
