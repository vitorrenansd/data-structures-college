package ies.algorithms;

import ies.metrics.SortMetrics;

public class QuickSortClassic {

    // Classic QuickSort using the last element as the pivot
    public static void quickSort(int[] arr, int low, int high, SortMetrics metrics) {
        if (low < high) {
            metrics.recursiveCalls++;
            int pi = partition(arr, low, high, metrics);

            // Avoid infinite recursion by checking pivot boundaries
            if (pi > low) {
                quickSort(arr, low, pi - 1, metrics);
            }
            if (pi < high) {
                quickSort(arr, pi + 1, high, metrics);
            }
        }
    }

    // Partition the array and return the pivot index
    private static int partition(int[] arr, int low, int high, SortMetrics metrics) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            metrics.comparisons++;
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j, metrics);
            }
        }

        swap(arr, i + 1, high, metrics);
        return i + 1;
    }

    // Swap two elements in the array and count the swap
    private static void swap(int[] arr, int i, int j, SortMetrics metrics) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        metrics.swaps++;
    }
}
