package com.yerti.sortingalgorithms;

public class QuickSortAlgorithm extends Algorithm {


    @Override
    public int[] runAlgorithm(int[] data) {
        int low = 0;
        int high = data.length - 1;

        sortData(data, low, high);

        //Longer than 1, partition into 2 sections



        return data;
    }

    private void sortData(int[] data, int low, int high) {
        if (low < high) {
            int partition = partition(data, low, high); //Longer than 1, partition into 2 sections

            sortData(data, low, partition - 1);
            sortData(data, partition + 1, high);
        }
    }

    private int partition(int[] data, int low, int high) {
        int pivot = data[high]; //Place the initial pivot at the right position, check everything else

        int i = (low - 1);

        for (int j = low; j < high ; j++) {
            if (data[j] < pivot) { //Anything less than pivot gets swapped
                i++;

                int temp = data[j];
                data[j] = data[i];
                data[i] = temp;
            }
        }

        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }
}
