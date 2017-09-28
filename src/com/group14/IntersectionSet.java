package com.group14;

import java.util.Arrays;

public class IntersectionSet<T> implements Set<T> {

    private T[] A;
    private T[] B;

    public IntersectionSet(T[] A, T[] B){
        this.A = A;
        this.B = B;
    }

    @Override
    public boolean contains(T element) {
        return Arrays.asList(A).contains(element) && Arrays.asList(B).contains(element);

    }
}
