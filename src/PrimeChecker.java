/**
 * This method checks whether a given number is prime.
 * It iteratively checks divisibility of the number up to its square root.
 * Time complexity: O(sqrt(n)), where n is the given number.
 * The method iterates up to the square root of the number to check divisibility,
 * resulting in square root time complexity.
 * @param n The number to be checked for primality.
 * @return true if the number is prime, false otherwise.
 */

public class PrimeChecker {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int number = 7;
        int number1 = 10;

        if (isPrime(number)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }

        if (isPrime(number1)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}
