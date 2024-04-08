/**
 * This method calculates the factorial of a given number.
 * It uses recursion to compute the factorial.
 * Time complexity: O(n), where n is the given number.
 * The method recursively calls itself n times to compute the factorial,
 * resulting in linear time complexity.
 * @param n The number for which to calculate the factorial.
 * @return factorial The factorial of the given number.
 */

public class FactorialCalculator {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int factorialOfNumber = factorial(number);
        System.out.println(factorialOfNumber);
    }
}