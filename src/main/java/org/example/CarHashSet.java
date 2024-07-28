package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CarHashSet <T> implements CarSet<T>{
    private Map<T, Object> map = new HashMap<>();
    private Object object = new Object();

    @Override
    public boolean add(T car) {
        if (map.containsKey(car)) {
            return false;
        }
        map.put(car, object);
        return true;
    }

    @Override
    public boolean remove(T car) {
        Object removed = map.remove(car);
        return removed != null;
    }

    @Override
    public boolean contains(T car) {
        return map.containsKey(car);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public Iterator<T> iterator() {
        return map.keySet().iterator();
    }
}
