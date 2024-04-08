/**
 * This method calculates the binomial coefficient C(n, k) using recursion.
 * It recursively computes C(n-1, k-1) and C(n-1, k) based on the given formula.
 * Time complexity: O(2^n), where n is the given input.
 * The method recursively calls itself twice for each combination,
 * resulting in exponential time complexity.
 * @param n The total number of items.
 * @param k The number of items to choose.
 * @return coefficient The binomial coefficient C(n, k).
 */

public class BinomialCoefficient {
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }

    public static void main(String[] args) {
        int n = 2;
        int k = 1;
        int n1 = 7;
        int k1 = 3;

        int result = binomialCoefficient(n, k);
        int result1 = binomialCoefficient(n1, k1);

        System.out.println(result);
        System.out.println(result1);
    }
}
