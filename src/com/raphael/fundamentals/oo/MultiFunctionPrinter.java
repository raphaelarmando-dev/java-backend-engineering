package com.raphael.fundamentals.oo;

interface Printer { void print(); }
interface Scanner { void scan(); }
interface Fax { void sendFax(); }

class MultiFunctionPrinter implements Printer, Scanner {
    public void print() { System.out.println("Imprimindo..."); }
    public void scan() { System.out.println("Escaneando..."); }
}

class BasicPrinter implements Printer {
    public void print() { System.out.println("Impressora simples imprimindo..."); }
}
