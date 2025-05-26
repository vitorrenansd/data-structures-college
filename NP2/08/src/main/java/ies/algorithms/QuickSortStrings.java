package ies.algorithms;

import ies.metrics.SortMetrics;

public class QuickSortStrings {

    // QuickSort for String arrays, using last element as pivot
    public static void quickSort(String[] arr, int low, int high, SortMetrics metrics) {
        if (low < high) {
            metrics.recursiveCalls++;
            int pi = partition(arr, low, high, metrics);
            quickSort(arr, low, pi - 1, metrics);
            quickSort(arr, pi + 1, high, metrics);
        }
    }

    // Partition method for String arrays
    private static int partition(String[] arr, int low, int high, SortMetrics metrics) {
        String pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            metrics.comparisons++;
            if (arr[j].compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j, metrics);
            }
        }

        swap(arr, i + 1, high, metrics);
        return i + 1;
    }

    // Swap method for String arrays
    private static void swap(String[] arr, int i, int j, SortMetrics metrics) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        metrics.swaps++;
    }
}