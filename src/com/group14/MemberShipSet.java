package com.group14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * A Membership is very simple in nature. Basically, if the Set contains an element, that element is a member of the set.
 *
 */
public class MemberShipSet<T> implements Set<T> {

    private ArrayList base = new ArrayList();

    public MemberShipSet(T... elements){
        Collections.addAll(base, elements);
    }

    /**
     * Very simple check to see if the specified element is a part of the set.
     * @param element to be tested for membership.
     * @return true, if the element is a member of the set. False, if it isn't.
     */
    @Override
    public boolean contains(T element) {
        return base.contains(element);
    }
}
