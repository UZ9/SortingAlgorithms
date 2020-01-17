package com.yerti.sortingalgorithms;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class SortingAlgorithms {

    private final Algorithm algorithm = new QuickSortAlgorithm();
    private final int DATA_SIZE = 100000;
    private final int DATA_MIN = 0;
    private final int DATA_MAX = 100;

    public static void main(String[] args) {
        SortingAlgorithms instance = new SortingAlgorithms();

        instance.runAlgorithms();


    }

    private void runAlgorithms() {
        int[] data = generateData();

        System.out.println("Data before: " + Arrays.toString(data));

        double currentTime = System.currentTimeMillis();

        data = algorithm.runAlgorithm(data);

        double executionTime = (System.currentTimeMillis() - currentTime);

        System.out.println("Data after: " + Arrays.toString(data));

        System.out.println("Execution Time: " + executionTime + "ms");

    }

    private int[] generateData() {
        int[] data = new int[DATA_SIZE];

        for (int i = 0; i < DATA_SIZE; i++) {
            data[i] = ThreadLocalRandom.current().nextInt(DATA_MIN, DATA_MAX);
        }

        return data;
    }

}
