package com.raphael.fundamentals.oo;

public class Wallet {
    private final String address;
    private boolean active;

    public Wallet(String address) {
        if (address == null || !address.startsWith("0x")) {
            throw new IllegalArgumentException("Endereço de carteira inválido!");
        }
        this.address = address;
        this.active = true;
    }

    public void deactivate() { this.active = false; }

    public String getAddress() { return address; }
    public boolean isActive() { return active; }
}
