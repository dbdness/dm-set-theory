package com.group14;

import java.util.Arrays;

/**
 * Intersection happens when an element is part of both sets.
 *
 */
public class IntersectionSet<T> implements Set<T> {

    private T[] A;
    private T[] B;

    public IntersectionSet(T[] A, T[] B){
        this.A = A;
        this.B = B;
    }

    /**
     * The specified element must be in both sets, in order for the sets to intersect.
     * @param element to be tested for intersection.
     * @return true, if the item is contained in both sets. False, if it isn't.
     */
    @Override
    public boolean contains(T element) {
        return Arrays.asList(A).contains(element) && Arrays.asList(B).contains(element);

    }
}
