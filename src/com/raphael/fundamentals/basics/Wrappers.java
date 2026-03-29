package com.raphael.fundamentals.basics;
@SuppressWarnings("all")
public class Wrappers {
    public static void main(String[] args) {

        // Objeto vs Primitivo
         String a = new String("texto");
         a.toUpperCase();
         System.out.println(a);
        // Wrappers
         int z = 123; // wrappers sao a versao objeto dos tipos primitivos
         System.out.println(a);

        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt("10000"); // int
        Long l = 100000L;

        Float f = 123.45F;
        System.out.println(f);

        Double d = 1234.5678;
        System.out.println(d);

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i * 3);
        System.out.println(l / 3);

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

    }
}
