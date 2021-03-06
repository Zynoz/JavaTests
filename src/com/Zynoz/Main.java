package com.Zynoz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {

    }

    public static void printList(List arrayList) {
        System.out.println("Main.printList");
        arrayList.forEach(System.out::println);
    }

    public static List convertToList(int[] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            list.add(array[i]);
        }
        System.out.println(
                list.stream()
                    .filter(e -> e > 5)
                    .mapToInt(e -> e * 5)
                    .sum());
        return list;
    }
}