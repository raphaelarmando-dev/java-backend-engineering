package com.raphael.fundamentals.oo;

sealed interface Notification permits Email, SMS {}

record Email(String address, String subject) implements Notification {}
record SMS(String phoneNumber, String text) implements Notification {}

public class SmartNotifier {
    public String notify(Notification n) {
        return switch (n) {
            case Email e -> "Enviando e-mail para: " + e.address();
            case SMS s   -> "Enviando SMS para: " + s.phoneNumber();
        };
    }
}
