package com.Zynoz;

/**
 * Created by Titan on 27.02.2017.
 */
public class Diagramm {
    private int anzahl;
    private Integer[] temp = new Integer[10];
    public Diagramm() throws Exception {
        //temp = ArrayGenerator.oneArrayGenerator(10, 0, 30, 1);
        temp[0] = 0;
        temp[1] = 1;
        temp[2] = 2;
        temp[3] = 3;
        temp[4] = 4;
        temp[5] = 5;
        temp[6] = 6;

        anzahl = 7;
    }

    public void test() {
        System.out.println("Diagramm.test");
            for (int i = 0; i < anzahl; i++) {

                if (temp[i] < 0) {
                    System.err.println("Wert " + temp[i] + " ist negativ an Stelle " + i);
                    System.exit(0);
                }
                System.out.print("Position:" + i + "[" + temp[i] + "]");
                for (int j = 0; j < temp[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        System.out.println("==========================================");
    }

    public void einfügen(int pos, int wert) {
        int i = anzahl - 1;
        if (pos >= 0 && pos < anzahl - 1 && wert <= 45 && wert >= -30) {
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
}