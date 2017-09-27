package com.company;

import java.util.Set;

public interface MembershipSet<T> extends Set<T> {
    @Override
    boolean contains(Object o);


}
