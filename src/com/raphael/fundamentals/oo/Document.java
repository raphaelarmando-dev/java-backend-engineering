package com.raphael.fundamentals.oo;

public class Document {
    private final String value;

    public Document(String value) {
        if (value == null || value.length() != 11) {
            throw new IllegalArgumentException("CPF deve ter 11 dígitos!");
        }
        this.value = value;
    }

    public String getValue() { return value; }
}
