public class Main {
    public static void main(String[] args) {
        String input = "something";
        String result = convertToUpperCase(input);
        System.out.println(result);
    }

    public static String convertToUpperCase(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            char firstChar = Character.toUpperCase(str.charAt(0));
            return firstChar + convertToUpperCase(str.substring(1));
        }
    }
}
