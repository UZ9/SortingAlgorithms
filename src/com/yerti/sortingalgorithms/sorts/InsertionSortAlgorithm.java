package com.yerti.sortingalgorithms.sorts;

/**
 * Performs the QuickSort algorithm on a set of data
 * Performance: O(n^2)
 */
public class InsertionSortAlgorithm implements SortAlgorithm {
    @Override
    public int[] runAlgorithm(int[] data) {
        for (int i = 1; i < data.length; i++) {
            int j = i - 1;
            int temp = data[i];
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }

            data[j + 1] = temp;

        }


        return data;
    }
}
