package com.yerti.sortingalgorithms;

/**
 * Performs the BubbleSort algorithm on a set of data
 * Performance: O(n^2)
 */
public class BubbleSortAlgorithm extends Algorithm {
    @Override
    public int[] runAlgorithm(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j + 1];
                    data[j + 1] = data[j];
                    data[j] = temp;


                }
            }
        }

        return data;


    }

}
