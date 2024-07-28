package org.example;

public interface CarCollections<T> extends Iterable<T> {
    boolean add(T car);

    boolean remove(T car);

    int size();

    void clear();

    boolean contains(T car);
}
