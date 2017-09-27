package com.company;

import java.util.Arrays;

public class IntersectionSet {

    Object[] A;
    Object[] B;

    public IntersectionSet(Object[] A, Object[] B){
        this.A = A;
        this.B = B;
    }

    public boolean intersects(Object o) {
        return Arrays.asList(A).contains(o) && Arrays.asList(B).contains(o);

    }
}
