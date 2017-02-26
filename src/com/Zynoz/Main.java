package com.Zynoz;

public class Main {

    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        isNull(0);
    }

    public static boolean isNull(int number) {
        if (number == 0) {
            System.out.println("true");
            Lambda.main();
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}