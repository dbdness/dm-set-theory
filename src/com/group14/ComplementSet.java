package com.group14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class ComplementSet<T> implements Set<T> {
    private ArrayList base = new ArrayList();

    public ComplementSet(T... elements) {
        Collections.addAll(base, elements);
    }


    @Override
    public boolean contains(T element) {
        return !base.contains(element);
    }
}
