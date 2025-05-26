package ies.model;

import java.util.Random;

public class DataGenerator {

    // Generate array with random integers
    public static int[] generateRandomArray(int size) {
        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(size * 10);
        }
        return arr;
    }

    // Generate descending ordered array
    public static int[] generateDescendingArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i;
        }
        return arr;
    }

    // Create a copy of an array
    public static int[] copyArray(int[] source) {
        int[] copy = new int[source.length];
        System.arraycopy(source, 0, copy, 0, source.length);
        return copy;
    }

    // Generate array of sample filenames or words
    public static String[] generateSampleStrings() {
        return new String[] {
            "file10.txt", "file2.txt", "file1.txt", "document.pdf",
            "image.png", "notes.docx", "file20.txt", "archive.zip",
            "file3.txt", "summary.txt"
        };
    }
}