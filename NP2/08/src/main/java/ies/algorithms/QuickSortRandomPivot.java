package ies.algorithms;

import ies.metrics.SortMetrics;
import java.util.Random;

public class QuickSortRandomPivot {

    private static Random rand = new Random();

    // QuickSort using a random pivot element
    public static void quickSort(int[] arr, int low, int high, SortMetrics metrics) {
        if (low < high) {
            metrics.recursiveCalls++;
            int pi = randomizedPartition(arr, low, high, metrics);

            // Recursive calls only if subarray exists
            if (pi > low) {
                quickSort(arr, low, pi - 1, metrics);
            }
            if (pi < high) {
                quickSort(arr, pi + 1, high, metrics);
            }
        }
    }

    // Partition with a random pivot
    private static int randomizedPartition(int[] arr, int low, int high, SortMetrics metrics) {
        int pivotIndex = low + rand.nextInt(high - low + 1);
        swap(arr, pivotIndex, high, metrics); // Move pivot to end for partition
        return partition(arr, low, high, metrics);
    }

    // Standard partition method (Lomuto scheme)
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