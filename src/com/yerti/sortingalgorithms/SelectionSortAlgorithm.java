package com.yerti.sortingalgorithms;

/**
 * Performs the SelectionSort algorithm on a set of data
 * Performance: O(n^2)
 */
public class SelectionSortAlgorithm extends Algorithm {
    @Override
    public int[] runAlgorithm(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int smallest = findSmallestIndex(i, data);
            int temp = data[smallest];
            data[smallest] = data[i];
            data[i] = temp;



        }


        return data;
    }

    private int findSmallestIndex(int startingIndex, int[] data) {
        int smallest = Integer.MAX_VALUE;
        int index = 0;

        for (int i = startingIndex; i < data.length; i++) {
            if (data[i] < smallest) {
                smallest = data[i];
                index = i;
            }
        }

        return index;
    }

}
