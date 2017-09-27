package com.company;

import java.util.Arrays;

public class ComplementSet {
    private Object[] A;

    public ComplementSet(Object[] A){
        this.A = A;
    }

    public boolean complement(Object o) {
        return !Arrays.asList(A).contains(o);
    }
}
