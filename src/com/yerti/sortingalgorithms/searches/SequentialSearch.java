package com.yerti.sortingalgorithms.searches;

public class SequentialSearch implements SearchAlgorithm {
    @Override
    public int searchForValue(int value, int[] data) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value) return i;
        }

        return -1;
    }
}
