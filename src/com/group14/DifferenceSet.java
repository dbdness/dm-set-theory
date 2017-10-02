package com.group14;

import java.util.Arrays;

/**
 * In Difference, the element must be contained in one set, but not the other.
 *
 */
public class DifferenceSet<T> implements Set<T> {
    private T[] A;
    private T[] B;

    public DifferenceSet(T[] A, T[] B){
        this.A = A;
        this.B = B;
    }


    /**
     * The specified element can only be in one of the sets, not both.
     * @param element to be tested for Difference.
     * @return true, if the element is contained in only one of the sets. False, if it's contained in both, or in none of the sets.
     */
    @Override
    public boolean contains(T element) {
        if(Arrays.asList(A).contains(element) && !Arrays.asList(B).contains(element)) return true;
        else if(!Arrays.asList(A).contains(element) && Arrays.asList(B).contains(element)) return true;
        return false;
    }
}
