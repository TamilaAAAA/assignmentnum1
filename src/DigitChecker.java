/**
 * This method checks whether a given string consists only of digits.
 * It uses recursion to check each character of the string.
 * Time complexity: O(n), where n is the length of the string.
 * The method recursively checks each character of the string,
 * resulting in linear time complexity.
 * @param s The string to be checked.
 * @return true if the string consists only of digits, false otherwise.
 */

public class DigitChecker {
    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) {
            return false;
        }

        else if (s.length() == 1) {
            return Character.isDigit(s.charAt(0));
        }

        else {
            return Character.isDigit(s.charAt(0)) && isAllDigits(s.substring(1));
        }
    }

    public static void main(String[] args) {
        String input = "123456";
        String input1 = "123a12";

        if (isAllDigits(input)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        if (isAllDigits(input1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
