package com.pro.dev.demo;

import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    private final String name = "Gerald";
    private final int[] list = {1, 2, 3, 4, 5};
    private final Integer[] crazyList1 = {16,32,2,8,4,3,5};
    private final Integer[] crazyList2 = {16,32,2,8,4,3,5};



    @Override
    public String toString() {
        return name;
    }



    public void print() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        for (int number : list) {
            System.out.println(number);
        }
    }




    public void sortAndRemoveOdds() {
        if (crazyList1 != null) {
            for (int i = 0; i < crazyList1.length - 1; i++) {
                for (int j = 0; j < crazyList1.length - i - 1; j++) {
                    if (crazyList1[j] > crazyList1[j + 1]) {
                        Integer temp = crazyList1[j];
                        crazyList1[j] = crazyList1[j + 1];
                        crazyList1[j + 1] = temp;
                    }
                }
            }

            int[] newCrazyList1 = new int[5];
            int j = 0;
            for (int i = 0; i < crazyList1.length; i++) {
                if (crazyList1[i] % 2 == 0) {
                    newCrazyList1[j] = crazyList1[i];
                    j++;
                }
            }
            System.out.println("Imperative:");
            System.out.println(Arrays.toString(crazyList1));
            System.out.println(Arrays.toString(newCrazyList1));
            System.out.println();
        }

        if (crazyList2 != null) {
            Arrays.sort(crazyList2);
            List<Integer> newCrazyList2 = Arrays.asList(crazyList2);
            List<Integer> outputList = newCrazyList2.stream()
                    .filter(number -> number % 2 == 0)
                    .collect(Collectors.toList());

            System.out.println("Declarative:");
            System.out.println(Arrays.toString(crazyList2));
            System.out.println(outputList);
        }
    }
}
