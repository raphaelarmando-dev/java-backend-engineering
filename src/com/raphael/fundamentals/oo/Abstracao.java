package com.raphael.fundamentals.oo;

abstract class Pagamento {
    public abstract void confirmar(double valor);
}

public class Abstracao extends Pagamento {
    @Override
    public void confirmar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " confirmado via Pix.");
    }
}