package com.group14;

import java.util.Arrays;

/**
 * Union is defined by an element is a part of one of the sets.
 *
 */
public class UnionSet<T> implements Set<T> {
    private T[] A;
    private T[] B;

    public UnionSet(T[] A, T[] B){
        this.A = A;
        this.B = B;
    }

    /**
     * The specified element only has to be in one of the set in order for it to be Union.
     * @param element to be tested for union.
     * @return true, if the element is contained in one of the sets. False, if it isn't contained in any set.
     */
    @Override
    public boolean contains(T element) {
        return Arrays.asList(A).contains(element) || Arrays.asList(B).contains(element);

    }
}
