package com.yerti.sortingalgorithms.searches;

public class BinarySearch implements SearchAlgorithm {
    @Override
    public int searchForValue(int value, int[] data) {
        binarySearch(0, data.length - 1, value, data);

        return 0;
    }

    private int binarySearch(int min, int max, int value, int[] data) {
        int middle = (max - min) / 2;

        if (data[middle] > value) {
            binarySearch(middle, max, value, data);
        } else if (data[middle] < value) {
            binarySearch(min, middle, value, data);
        } else {
            return middle;
        }

        return -1;
    }
}
