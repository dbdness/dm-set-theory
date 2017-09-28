package com.group14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MemberShipSet<T> implements Set<T> {

    private ArrayList base = new ArrayList();

    public MemberShipSet(T... elements){
        Collections.addAll(base, elements);
    }

    @Override
    public boolean contains(T element) {
        return base.contains(element);
    }
}
