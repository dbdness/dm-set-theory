package com.company;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String[] members = {"Danny", "Kim", "Alexander"};
        MemberShipSet memberShipSet = new MemberShipSet(members);

        System.out.println(memberShipSet.isMember("Kim"));

    }
}
