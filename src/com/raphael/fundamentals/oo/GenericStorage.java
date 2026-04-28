package com.raphael.fundamentals.oo;

import java.util.*;

public class GenericStorage<T> {
    private List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public List<T> getAll() {
        return Collections.unmodifiableList(items);
    }

    public T findFirst() {
        return items.isEmpty() ? null : items.get(0);
    }
}
