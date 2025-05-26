package ies.algorithms;

import ies.metrics.SortMetrics;

public class QuickSortMedianOfThree {

    // QuickSort using median-of-three pivot selection
    public static void quickSort(int[] arr, int low, int high, SortMetrics metrics) {
        if (low < high) {
            metrics.recursiveCalls++;
            int pi = medianOfThreePartition(arr, low, high, metrics);

            // Recursive calls only if subarray exists
            if (pi > low) {
                quickSort(arr, low, pi - 1, metrics);
            }
            if (pi < high) {
                quickSort(arr, pi + 1, high, metrics);
            }
        }
    }

    // Partition choosing pivot as median of low, mid, high elements
    private static int medianOfThreePartition(int[] arr, int low, int high, SortMetrics metrics) {
        int mid = low + (high - low) / 2;

        // Order low, mid, high elements to find median
        if (arr[mid] < arr[low]) {
            swap(arr, low, mid, metrics);
        }
        if (arr[high] < arr[low]) {
            swap(arr, low, high, metrics);
        }
        if (arr[high] < arr[mid]) {
            swap(arr, mid, high, metrics);
        }

        // Swap median to the high position to use standard partition
        swap(arr, mid, high, metrics);
        return partition(arr, low, high, metrics);
    }

    // Standard Lomuto partition method
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

    // Swap two elements and count it
    private static void swap(int[] arr, int i, int j, SortMetrics metrics) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        metrics.swaps++;
    }
}