/**
 * This method reverses an array without using additional data structures.
 * It uses recursion to swap elements from both ends of the array.
 * Time complexity: O(n), where n is the length of the array.
 * The method swaps elements recursively, resulting in linear time complexity.
 * @param arr The array of integers to be reversed.
 * @param start The starting index for reversing.
 * @param end The ending index for reversing.
 */

public class ReverseArray {
    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 4, 6, 2};
        reverse(array, 0, array.length - 1);

        System.out.print("Reversed Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
