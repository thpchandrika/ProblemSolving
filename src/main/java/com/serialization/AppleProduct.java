package com.serialization;

import lombok.Data;

import java.io.Serializable;

@Data
public class AppleProduct implements Serializable {
    private static final long serialVersionUID = 13453487967865L;

    private String headphonePort;
    private String thunderboltPort;
    private transient String  earphone; //keyword transient does not serialize
    private transient NewAppleProduct newAppleProduct;
}
