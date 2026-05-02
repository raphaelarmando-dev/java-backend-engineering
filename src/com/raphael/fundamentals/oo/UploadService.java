package com.raphael.fundamentals.oo;

public class UploadService {
    private final FileStorage storage;

    public UploadService(FileStorage storage) {
        this.storage = storage;
    }

    public void processUpload(byte[] data, String name) {
        storage.store(data, name);
    }
}
