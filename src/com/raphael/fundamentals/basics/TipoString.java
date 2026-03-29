package com.raphael.fundamentals.basics;

import java.util.Date;

public class TipoString {
    public static void main(String[] args) {

        // Notacao Ponto
        String s = "Hello World You";
        s = s.replace("You", "Me");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);
        System.out.println("Yeah".toUpperCase());

        // Import

        Date d = new Date(); // import java.util.Data;
        System.out.println(d);

        // Tipo String**

        System.out.println(s.startsWith("Hello"));
        System.out.println(s.length());
        System.out.println(s.equalsIgnoreCase("You"));

        var nome = "Raphael";
        var sobrenome = "Armando";
        System.out.println("Nome: " + nome + "\nSobrenome: "
            + sobrenome);
    }
}
