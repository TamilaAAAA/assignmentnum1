/**
 * This method finds the nth element in the Fibonacci sequence using recursion.
 * It recursively computes the Fibonacci number based on the given index.
 * Time complexity: O(2^n), where n is the given index.
 * The method recursively calls itself twice for each Fibonacci number,
 * resulting in exponential time complexity.
 * @param n The index of the Fibonacci number to find.
 * @return fibonacci The nth Fibonacci number.
 */

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int input = 5;
        int input1 = 17;

        int output = fibonacci(input);
        int output1 = fibonacci(input1);

        System.out.println(output);
        System.out.println(output1);
    }
}
