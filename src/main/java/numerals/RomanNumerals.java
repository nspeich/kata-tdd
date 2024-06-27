public class RomanNumerals {
    
    public static String toRoman(int num) {
        int[] values = {10, 9, 5, 4, 1};
        String[] symbols = {"X", "IX", "V", "IV", "I"};

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                result.append(symbols[i]);
                num -= values[i];
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[] testNumbers = {1, 7, 10};
        for (int number : testNumbers) {
            System.out.println(number + " --> " + toRoman(number));
        }
    }
}
