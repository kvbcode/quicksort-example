package com.cyber.algo;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] ints = {59, 84, 98, 55, 56, 36, 86, 65, 76, 37, 83, 21, 9, 40, 81, 36, 74, 43, 38};
        quickSort.sort(ints);
        System.out.println(Arrays.toString(ints));

    }

}
