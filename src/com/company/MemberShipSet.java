package com.company;

import java.util.Arrays;
import java.util.Set;

public class MemberShipSet {

    Object[] A;

    public MemberShipSet(Object[] A){
        this.A = A;
    }

    public boolean isMember(Object o) {
        return Arrays.asList(A).contains(o);
    }
}
