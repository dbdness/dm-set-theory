package com.company;

import java.util.Arrays;

public class IntersectionSet {

    private Object[] A;
    private Object[] B;

    public IntersectionSet(Object[] A, Object[] B){
        this.A = A;
        this.B = B;
    }

    public boolean intersects(Object o) {
        return Arrays.asList(A).contains(o) && Arrays.asList(B).contains(o);

    }
}
