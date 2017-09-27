package com.company;

import java.util.Arrays;

public class UnionSet {
    private Object[] A;
    private Object[] B;

    public UnionSet(Object[] A, Object[] B){
        this.A = A;
        this.B = B;
    }

    public boolean isUnion(Object o) {
        return Arrays.asList(A).contains(o) || Arrays.asList(B).contains(o);

    }
}
