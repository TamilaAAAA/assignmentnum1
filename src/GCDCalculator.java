/**
 * This method finds the greatest common divisor (GCD) of two numbers using recursion.
 * It applies the Euclidean Algorithm recursively to find the GCD.
 * Time complexity: O(log(min(a, b))), where a and b are the input numbers.
 * The method recursively divides the numbers until one of them becomes 0,
 * resulting in logarithmic time complexity.
 * @param a The first integer.
 * @param b The second integer.
 * @return gcd The greatest common divisor of a and b.
 */

public class GCDCalculator {
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        int a = 32;
        int b = 48;
        int a1 = 10;
        int b1 = 7;

        int gcd = gcd(a, b);
        int gcd1 = gcd(a1, b1);

        System.out.println(gcd);
        System.out.println(gcd1);
    }
}
