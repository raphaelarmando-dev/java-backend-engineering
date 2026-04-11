package com.raphael.fundamentals.oo;

// Superclasse
class DispositivoSom {
    void tocar() {
        System.out.println("Saindo som genérico.");
    }
}

// Subclasse 1
class Radio extends DispositivoSom {
    @Override
    void tocar() {
        System.out.println("Tocando música FM.");
    }
}

// Subclasse 2
class Alarme extends DispositivoSom {
    @Override
    void tocar() {
        System.out.println("BEEP! BEEP! BEEP!");
    }
}

public class Polimorfismo {
    public static void main(String[] args) {
        DispositivoSom d1 = new Radio();
        DispositivoSom d2 = new Alarme();

        d1.tocar();
        d2.tocar();
    }
}
