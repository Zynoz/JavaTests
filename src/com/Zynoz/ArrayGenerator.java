package com.Zynoz;

import java.util.Random;

/**
 * Created by Zynoz on 21.02.2017.
 */

public class ArrayGenerator {


    //length: Länge des Arrays
    //min: Kleinste Zahl
    //max: Größte Zahl
    //multiplier: Multiplikator
    //aufrufen mit 'int[] arrayName = ArrayGenerator.arrayGenerator(länge, minimum, maximum, multiplikator);'
    //Methoden in denen auf das Array zugegriffen wird: public methodenName() throws Exception {}

    public static int[] oneArrayGenerator(int length, int min, int max, int multiplier) throws Exception {
        if (min > max) {
            throw new Exception("Min (" + min + ") cannot be bigger than max (" + max + ")!");
        } else if (length == 0) {
            throw new Exception("Length (" + length + ") cannot be zero!");
        } else if (multiplier == 0) {
            throw new Exception("Multiplier cannot be zero!");
        }
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i <= length - 1; i++) {
            int rand = random.nextInt((max - min) + 1) + min;
            rand *= multiplier;
            array[i] = rand;
        }
        return array;
    }

    public static int[][] twoArrayGenerator(int length, int width, int min, int max, int multiplier) throws Exception {
        if (length == 0) {
            throw new Exception("Length (" + length + ") cannot be 0");
        } else if (width == 0) {
            throw new Exception("Width (" + width + ") cannot be 0");
        } else if (min > max) {
            throw new Exception("Min (" + min + ") cannot be bigger than max (" + max + ")!");
        } else if (multiplier == 0) {
            throw new Exception("Multiplier cannot be zero!");
        }

        int[][] array = new int[length][width];
        Random random = new Random();
        for (int i = 0; i <= length - 1; i++) {
            for (int j = 0; j <= width - 1; j++) {
                int rand = random.nextInt((max - min) + 1 ) + min;
                rand *= multiplier;
                array[i][j] = rand;
            }
        }

        return array;
    }

    public static int[][][] threeArrayGenerator(int length, int width, int depth, int min, int max, int multiplier) throws Exception {
        if (length == 0) {
            throw new Exception("Length (" + length + ") cannot be 0");
        } else if (width == 0) {
            throw new Exception("Width (" + width + ") cannot be 0");
        } else if (depth == 0) {
            throw new Exception("Depth (" + depth+ ") cannot be 0");
        } else if (min > max) {
            throw new Exception("Min (" + min + ") cannot be bigger than max (" + max + ")!");
        } else if (multiplier == 0) {
            throw new Exception("Multiplier cannot be zero!");
        }

        int[][][] array = new int[length][width][depth];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                for (int k = 0; k < depth; k++) {
                    int rand = random.nextInt((max - min) + 1) + min;
                    rand *= multiplier;
                    array[i][j][k] = rand;
                }
            }
        }
        return array;
    }
}