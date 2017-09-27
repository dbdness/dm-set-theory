package com.company;

import java.util.Arrays;

public class IntersectionSet<T> implements IIntersectionSet<T> {

    T[] A;
    T[] B;

    public IntersectionSet(T[] A, T[] B){
        this.A = A;
        this.B = B;
    }

    @Override
    public boolean intersects(Object o) {
        return Arrays.asList(A).contains(o) && Arrays.asList(B).contains(o);

    }
}
