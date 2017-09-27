package com.company;

import java.util.Arrays;
import java.util.Set;

public class MemberShipSet<T> implements IMembershipSet<T> {

    T[] A;

    public MemberShipSet(T[] A){
        this.A = A;
    }

    @Override
    public boolean contains(Object o) {
        return Arrays.asList(A).contains(o);
    }
}
