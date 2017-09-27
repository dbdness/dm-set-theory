package com.company;

import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String[] members = {"Danny", "Kim", "Alexander"};
        MemberShipSet memberShipSet = new MemberShipSet(members);

        System.out.println("Is member: " + memberShipSet.isMember("Kim"));

        String[] coolCars = {"Audi", "Tesla", "Porsche"};
        String[] affordableCars = {"BMW", "Citroen", "Audi", "Volkswagen"};

        IntersectionSet intersectionSet = new IntersectionSet(coolCars, affordableCars);
        System.out.println("Intersects: " + intersectionSet.intersects("Tesla"));


        UnionSet unionSet = new UnionSet(coolCars, affordableCars);
        System.out.println("Union: " + unionSet.isUnion("BMW"));

        DifferenceSet differenceSet = new DifferenceSet(coolCars, affordableCars);
        System.out.println("Differences: " +  differenceSet.difference("Audi"));

        ComplementSet complementSet = new ComplementSet(members);
        System.out.println("Complement: " + complementSet.complement("Hejsa"));


    }
}
