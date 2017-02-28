package com.Zynoz.Schule;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;

/**
 * Created by Titan on 27.02.2017.
 */
public class Diagramm {
    private int anzahl = 7;
    private int[] temp = new int[10];
    private List<Integer> tempList;

    public Diagramm() throws Exception {
        //temp = ArrayGenerator.oneArrayGenerator(anzahl, 0, 30, 1);
        tempList = new ArrayList<Integer>();

        tempList.add(0, 12);
        tempList.add(1, 8);
        tempList.add(2, 15);
        tempList.add(3, 13);
        tempList.add(4, 17);
        tempList.add(5, 19);
        tempList.add(6, 22);
        tempList.add(7, 24);
        tempList.add(8, 26);
        tempList.add(9, 28);

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


        anzahl = 10;

    }

    public void test() {
        System.out.println("Diagramm.test");
            for (int i = 0; i < anzahl; i++) {

                if (temp[i] < 0) {
                    System.err.println("Wert " + temp[i] + " ist negativ an Stelle " + i);
                    //System.exit(0);
                }
                System.out.print("Position:" + i + "[" + temp[i] + "]");
                for (int j = 0; j < temp[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        System.out.println("==========================================");
    }

    public void einfuegen(int pos, int wert) {
        System.out.println("Diagramm.einfügen");
        int i = anzahl - 1;
        if (pos >= 0 && pos < anzahl - 1 && wert <= 50 && wert >= -50) {
            if (anzahl < temp.length) {
                while (i >= pos) {
                    temp[i + 1] = temp[i];
                    i--;
                }
                temp[pos] = wert;
                anzahl++;

            } else {
                System.err.println("no space");
            }
        } else {
            System.out.println("Pos oder Wert nicht gültig");
        }
    }

    public void einfuegenTest(int pos, int wert) {
        System.out.println("Diagramm.einfuegenTest");
        if (wert >= -50 && wert <= 50) {    //prüft ob wert ok ist
            tempList.add(pos, wert);    //fügt wert an position in ListArray ein
            tempList.forEach(System.out::println);  //gibt array aus
        } else {
            System.err.println("Übergebener Wert ist ungültig   ");
        }
    }
}