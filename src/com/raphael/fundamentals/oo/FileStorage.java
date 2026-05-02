package com.raphael.fundamentals.oo;

public interface FileStorage {
    void store(byte[] content, String fileName);
}

class LocalStorage implements FileStorage {
    @Override
    public void store(byte[] content, String fileName) {
        System.out.println("Salvando arquivo " + fileName + " no diretório /tmp/uploads");
    }
}
