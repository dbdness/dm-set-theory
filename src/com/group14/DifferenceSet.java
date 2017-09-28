package com.group14;

import java.util.Arrays;

public class DifferenceSet<T> implements Set<T> {
    private T[] A;
    private T[] B;

    public DifferenceSet(T[] A, T[] B){
        this.A = A;
        this.B = B;
    }


    @Override
    public boolean contains(T element) {
        if(Arrays.asList(A).contains(element) && !Arrays.asList(B).contains(element)) return true;
        else if(!Arrays.asList(A).contains(element) && Arrays.asList(B).contains(element)) return true;
        return false;
    }
}
