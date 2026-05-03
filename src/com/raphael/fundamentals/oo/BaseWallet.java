package com.raphael.fundamentals.oo;

abstract class BaseWallet extends Wallet {
    public BaseWallet(String address) { super(address); }
    public abstract boolean canLiquidate();
}

class ExchangeWallet extends BaseWallet {
    public ExchangeWallet(String address) { super(address); }
    @Override
    public boolean canLiquidate() { return true; } // Exchanges podem mover volumes massivos
}

class ColdWallet extends BaseWallet {
    public ColdWallet(String address) { super(address); }
    @Override
    public boolean canLiquidate() { return false; } // Foco em segurança, não liquidez imediata
}
