package com.Zynoz;

/**
 * Created by Titan on 27.02.2017.
 */
public class Diagramm {
    private int[] temp = new int[10];
    public Diagramm() throws Exception {
        temp = ArrayGenerator.oneArrayGenerator(10, 0, 30, 1);
        /*
        temp[0] = 12;
        temp[1] = 8;
        temp[2] = 15;
        temp[3] = 13;
        temp[4] = 17;
        temp[5] = 19;
        temp[6] = 22;
        temp[7] = 24;
        temp[8] = 26;
        temp[9] = 28;
        */
    }

    public void test() {
        System.out.println("Diagramm.test");
        for (int i = 0; i < temp.length; i++) {
            System.out.print("[" + temp[i] + "]");
            for (int j = 0; j < temp[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}