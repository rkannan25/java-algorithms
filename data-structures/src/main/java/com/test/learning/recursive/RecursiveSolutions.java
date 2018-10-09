package com.test.learning.recursive;

public class RecursiveSolutions {
    /**
     * Given an array, check whether the array is in sorted order with recursion.
     */
    public static boolean isSortedOrder(int[] data, int index, int length) {
        if (length == 1) return true;

        return data[index] <= data[index + 1] && isSortedOrder(data, index + 1, length - 1);
    }
}
