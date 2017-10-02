package com.group14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * A complement in a set, is everything that is not in a set.
 * @param <T>
 */
public class ComplementSet<T> implements Set<T> {
    private ArrayList base = new ArrayList();

    public ComplementSet(T... elements) {
        Collections.addAll(base, elements);
    }


    /**
     * The specified element cannot be contained in the collection, in order for it to be a complement.
     * @param element to be tested for complement.
     * @return true, if the element is not contained in the set. False, if it is.
     */
    @Override
    public boolean contains(T element) {
        return !base.contains(element);
    }
}
