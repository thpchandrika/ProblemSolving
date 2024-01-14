package com.externalization;
import lombok.Data;
import java.io.Serializable;

@Data
public class Community implements Serializable {
    private int id;

    @Override
    public String toString() {
        return "Community{" +
                "id=" + id +
                '}';
    }
}
