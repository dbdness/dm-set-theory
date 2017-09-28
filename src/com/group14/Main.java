package com.group14;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //Set handling

        String[] members = {"Danny", "Kim", "Alexander"};
        MemberShipSet memberShipSet = new MemberShipSet(members);

        System.out.println("Is member: " + memberShipSet.contains("Kim"));

        String[] coolCars = {"Audi", "Tesla", "Porsche"};
        String[] affordableCars = {"BMW", "Citroen", "Audi", "Volkswagen"};

        IntersectionSet intersectionSet = new IntersectionSet(coolCars, affordableCars);
        System.out.println("Intersects: " + intersectionSet.contains("Tesla"));


        UnionSet unionSet = new UnionSet(coolCars, affordableCars);
        System.out.println("Union: " + unionSet.contains("BMW"));

        DifferenceSet differenceSet = new DifferenceSet(coolCars, affordableCars);
        System.out.println("Differs: " + differenceSet.contains("Audi"));


        ComplementSet complementSet = new ComplementSet(members);
        System.out.println("Complement: " + complementSet.contains("Mathias"));


        //-----------------------------------------------------------------------
        //Subset handling
        String[] a = {"2", "3"};
        String[] b = {"1", "2", "3", "4"};

        System.out.println("Subset resultcode: " + determineSubset(a, b));
        System.out.println("Equals resultcode: " + determineEquals(a, b));
        System.out.println("Superset resultcode: " + determineSuperset(b,a));

    }

    private static int determineSubset(String[] a, String[] b) {
        for (String element : b) {
            if (Arrays.asList(a).contains(element)) return -1;
        }
        return -2;
    }

    private static int determineEquals(String[] a, String[] b) {
        if (Arrays.equals(a, b)) return 0;
        return -2;
    }

    private static int determineSuperset(String[] a, String[] b){
        if(Arrays.asList(a).containsAll(Arrays.asList(b)) && a.length > b.length) return 1;
        return -2;
    }




}
