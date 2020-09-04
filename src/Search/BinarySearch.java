package Search;

import java.util.Arrays;

public class BinarySearch {

    // Binary search only works in sorted arrays, the data must be sorted prior to searching it.

    public static void main(String[] args) {
        int[] intArray = {20, 35, -35, 55, 80, -56, 1, 7, 18};

        Arrays.sort(intArray);

//        System.out.println("Index: " + iterativeBinarySearch(intArray, -35));
//        System.out.println("Index: " + iterativeBinarySearch(intArray, -80));
//        System.out.println("Index: " + iterativeBinarySearch(intArray, -56));
//        System.out.println("Index: " + iterativeBinarySearch(intArray, 18));

        System.out.println("Index: " + recursiveBinarySearch(intArray, -35));
        System.out.println("Index: " + recursiveBinarySearch(intArray, -80));
        System.out.println("Index: " + recursiveBinarySearch(intArray, -56));
        System.out.println("Index: " + recursiveBinarySearch(intArray, 18));

    }

    // returns the index of the value, -1 otherwise
    public static int iterativeBinarySearch(int[] input, int value) {
        int start = 0;
        int end = input.length;

        // start at the middle
        while (start < end) {
            int midpoint = (start + end) / 2;
            // if mid is value, great! O(1)
            if (input[midpoint] == value) {
                return midpoint;
            }
            // If smaller than mid, go to right
            else if (input[midpoint] < value) {
                start = midpoint + 1;
            }
            // Go to left
            else {
                end = midpoint;
            }
        }
        // not found
        return -1;
    }

    public static int recursiveBinarySearch(int[] input, int value) {
        return recursiveBinarySearch(input, 0, input.length, value);
    }

    public static int recursiveBinarySearch(int[] input, int start, int end, int value) {
        if (start >= end) {
            return -1;
        }

        int midpoint = (start + end) / 2;
        System.out.println("Midpoint is: " + midpoint);

        if (input[midpoint] == value) {
            return midpoint;
        }
        // If smaller than mid, go to right
        else if (input[midpoint] < value) {
            return recursiveBinarySearch(input, midpoint + 1, end, value);
        }
        // Go to left
        else {
            return recursiveBinarySearch(input, start, midpoint, value);
        }
    }

}
