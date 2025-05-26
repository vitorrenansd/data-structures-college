package ies.algorithms;

import ies.metrics.SortMetrics;

public class QuickSortHybrid {

    private static final int INSERTION_SORT_THRESHOLD = 20;

    // Hybrid QuickSort using insertion sort for small subarrays
    public static void quickSort(int[] arr, int low, int high, SortMetrics metrics) {
        while (low < high) {
            // Use insertion sort for small subarrays to improve efficiency
            if (high - low + 1 < INSERTION_SORT_THRESHOLD) {
                insertionSort(arr, low, high, metrics);
                break;
            } else {
                metrics.recursiveCalls++;
                int pi = partition(arr, low, high, metrics);

                // Tail call optimization:
                // Recur on smaller partition first to limit stack depth
                if (pi - low < high - pi) {
                    quickSort(arr, low, pi - 1, metrics);
                    low = pi + 1;
                } else {
                    quickSort(arr, pi + 1, high, metrics);
                    high = pi - 1;
                }
            }
        }
    }

    // Insertion sort for small subarrays
    private static void insertionSort(int[] arr, int low, int high, SortMetrics metrics) {
        for (int i = low + 1; i <= high; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= low) {
                metrics.comparisons++;
                if (arr[j] > key) {
                    arr[j + 1] = arr[j];
                    metrics.swaps++;
                    j--;
                } else {
                    break;
                }
            }
            arr[j + 1] = key;
            metrics.swaps++; // Count this assignment as a swap for consistency
        }
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

    // Swap two elements and count the swap
    private static void swap(int[] arr, int i, int j, SortMetrics metrics) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        metrics.swaps++;
    }
}