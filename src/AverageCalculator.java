/**
 * This method calculates the average of the elements in an array of integers.
 * It iterates through the array to compute the sum of all elements.
 * Time complexity: O(n), where n is the length of the input array.
 * The method iterates through the array once to compute the sum,
 * resulting in linear time complexity.
 * @param arr The array of integers for which to calculate the average.
 * @return average The average of the elements in the array.
 */

public class AverageCalculator {
    public static double calculatorAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 2, 4, 1};
        double average = calculatorAverage(numbers);
        System.out.println("Average: " + average);
    }
}
