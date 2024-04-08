/**
 * This method finds the minimum number from an array of integers.
 * It iterates through the array using a for loop.
 * Time complexity: O(n), where n is the length of the input array.
 * The for loop iterates through the array to find the minimum number,
 * resulting in linear time complexity.
 * @param arr The array of integers from which to find the minimum.
 * @return min The smallest integer from the array.
 */

public class MinimumFinder {
    public static int findMinimum(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 1, 32, 3, 45};
        int minimum = findMinimum(numbers);
        System.out.println("Minimum number: " + minimum);
    }
}

