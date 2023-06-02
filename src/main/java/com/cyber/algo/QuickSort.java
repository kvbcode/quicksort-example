package com.cyber.algo;

import java.util.Random;

public class QuickSort {
    private final Random RANDOM = new Random();

    public void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    public void sort(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int splitIndex = partition(arr, startIndex, endIndex);
            sort(arr, startIndex, splitIndex);
            sort(arr, splitIndex + 1, endIndex);
        }
    }

    private int partition(int[] arr, int startIndex, int endIndex) {
        int pivot = arr[RANDOM.nextInt(startIndex, endIndex + 1)];

        while (startIndex < endIndex) {
            while (arr[startIndex] < pivot) startIndex++;
            while (arr[endIndex] > pivot) endIndex--;
            if (startIndex < endIndex) swap(arr, startIndex++, endIndex--);
        }
        return endIndex;
    }

    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
