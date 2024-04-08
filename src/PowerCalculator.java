/**
 * This method calculates the power of a number using recursion.
 * It recursively multiplies the base by itself exponent times.
 * Time complexity: O(log n), where n is the exponent.
 * The method recursively halves the exponent in each step,
 * resulting in logarithmic time complexity.
 * @param base The base number.
 * @param exponent The exponent to which the base is raised.
 * @return result The result of base raised to the power of exponent.
 */

public class PowerCalculator {
    public static double power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent > 0) {
            return base * power(base, exponent - 1);
        } else {
            return 1 / power(base, -exponent);
        }
    }

    public static void main(String[] args) {
        double base = 2;
        int exponent = 10;

        double result = power(base, exponent);

        System.out.println(result);
    }
}
