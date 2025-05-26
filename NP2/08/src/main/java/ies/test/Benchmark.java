package ies.test;

import ies.algorithms.*;
import ies.metrics.SortMetrics;
import ies.model.DataGenerator;

public class Benchmark {

    // Run benchmark on multiple data sets
    public static void run() {
        SortMetrics metrics = new SortMetrics();

        int[] randomData = DataGenerator.generateRandomArray(10000);
        int[] descendingData = DataGenerator.generateDescendingArray(10000);
        int[] sortedData = DataGenerator.copyArray(descendingData);
        java.util.Arrays.sort(sortedData);

        System.out.println("Testing QuickSort Variants on int arrays...\n");

        // Test all integer datasets on each QuickSort version
        testAllIntVersions("Random", randomData, metrics);
        testAllIntVersions("Descending", descendingData, metrics);
        testAllIntVersions("Sorted", sortedData, metrics);

        // Now test QuickSort on real String data
        System.out.println("Testing QuickSort on real String data...\n");
        String[] stringData = DataGenerator.generateSampleStrings();
        testQuickSortStrings("Sample Strings", stringData, metrics);
    }

    // Test all QuickSort variations on a single int data set
    private static void testAllIntVersions(String label, int[] originalData, SortMetrics metrics) {
        System.out.println("Data set: " + label);
        System.out.println("-------------------------");

        testOneIntSet("QuickSort Classic", QuickSortClassic::quickSort, originalData, metrics);
        testOneIntSet("QuickSort Random Pivot", QuickSortRandomPivot::quickSort, originalData, metrics);
        testOneIntSet("QuickSort Median of Three", QuickSortMedianOfThree::quickSort, originalData, metrics);
        testOneIntSet("QuickSort Hybrid (Insertion Sort)", QuickSortHybrid::quickSort, originalData, metrics);

        System.out.println();
    }

    // Functional interface for int QuickSort methods
    @FunctionalInterface
    interface QuickSortFunctionInt {
        void sort(int[] arr, int low, int high, SortMetrics metrics);
    }

    // Benchmark a single int quicksort variation on a dataset copy
    private static void testOneIntSet(String name, QuickSortFunctionInt sorter, int[] originalData, SortMetrics metrics) {
        metrics.reset();
        int[] dataCopy = DataGenerator.copyArray(originalData);
        long start = System.currentTimeMillis();
        sorter.sort(dataCopy, 0, dataCopy.length - 1, metrics);
        long end = System.currentTimeMillis();

        System.out.println(name);
        System.out.println("Time: " + (end - start) + " ms");
        metrics.printMetrics(name);
    }

    // Functional interface for String QuickSort methods
    @FunctionalInterface
    interface QuickSortFunctionString {
        void sort(String[] arr, int low, int high, SortMetrics metrics);
    }

    // Benchmark QuickSort for strings
    private static void testQuickSortStrings(String label, String[] originalData, SortMetrics metrics) {
        System.out.println("Data set: " + label);
        System.out.println("-------------------------");

        metrics.reset();
        String[] dataCopy = java.util.Arrays.copyOf(originalData, originalData.length);
        long start = System.currentTimeMillis();
        QuickSortStrings.quickSort(dataCopy, 0, dataCopy.length - 1, metrics);
        long end = System.currentTimeMillis();

        System.out.println("QuickSort Strings");
        System.out.println("Time: " + (end - start) + " ms");
        metrics.printMetrics("QuickSort Strings");

        System.out.println("Sorted strings:");
        for (String s : dataCopy) {
            System.out.println(s);
        }
        System.out.println();
    }
}