package org.example;

public interface CarQueue<T> extends CarCollections<T> {
    boolean add(T car);

    T peek();

    T poll();
}