// public class RomanNumerals {
    
//     public static String toRoman(int num) {
//         int[] values = {10, 9, 5, 4, 1};
//         String[] symbols = {"X", "IX", "V", "IV", "I"};

//         StringBuilder result = new StringBuilder();
//         for (int i = 0; i < values.length; i++) {
//             while (num >= values[i]) {
//                 result.append(symbols[i]);
//                 num -= values[i];
//             }
//         }
//         return result.toString();
//     }

//     public static void main(String[] args) {
//         int[] testNumbers = {1, 7, 10};
//         for (int number : testNumbers) {
//             System.out.println(number + " --> " + toRoman(number));
//         }
//     }
// }

package numerals;

public class RomanNumerals {
    public static String toRoman(int number) {
        if (number < 1 || number > 3000) {
            throw new IllegalArgumentException("Number out of range (1-3000)");
        }

        String[] thousands = {"", "M", "MM", "MMM"};
        String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[number / 1000] +
               hundreds[(number % 1000) / 100] +
               tens[(number % 100) / 10] +
               units[number % 10];
    }
}
