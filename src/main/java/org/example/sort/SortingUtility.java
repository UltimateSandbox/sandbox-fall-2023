package org.example.sort;

public class SortingUtility {

    public static <T extends Comparable<T>> void selectionSort(T[] data) {

        int min;

        for (int index = 0; index < data.length - 1; index++) {

            // Assume first value is min
            min = index;

            for(int scan = index +1; scan < data.length; scan++) {

                // Find the minimum value
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }
            }

            swap(data, min, index);
        }
    }

    private static <T extends Comparable<T>> void swap(T[] data, int min, int index) {

        T temp = data[min];
        data[min] = data[index];
        data[index] = temp;

    }

    public static <T extends Comparable<T>> void insertionSort(T[] data) {

        for (int index = 1; index < data.length; index++) {

            T key = data[index];
            int position = index;

            // shift larger values to the right
            while (position > 0 && data[position -1].compareTo(key) > 0) {
                data[position] = data[position -1];
                position--;
            }
            data[position] = key;
        }
    }
}
