package ies.metrics;

public class SortMetrics {
    public int comparisons = 0;
    public int swaps = 0;
    public int recursiveCalls = 0;

    // Reset metrics
    public void reset() {
        comparisons = 0;
        swaps = 0;
        recursiveCalls = 0;
    }

    // Print collected metrics
    public void printMetrics(String algorithmName) {
        System.out.println("|| " + algorithmName + " ||");
        System.out.println("Comparisons: " + comparisons);
        System.out.println("Swaps: " + swaps);
        System.out.println("Recursive Calls: " + recursiveCalls);
        System.out.println();
    }
}