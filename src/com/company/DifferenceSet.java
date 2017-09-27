package com.company;

import java.util.Arrays;

public class DifferenceSet {
    private Object[] A;
    private Object[] B;

    public DifferenceSet(Object[] A, Object[] B){
        this.A = A;
        this.B = B;
    }

    public boolean difference(Object o) {
        if(Arrays.asList(A).contains(o) && !Arrays.asList(B).contains(o)) return true;
        else if(!Arrays.asList(A).contains(o) && Arrays.asList(B).contains(o)) return true;
        return false;

    }
}
