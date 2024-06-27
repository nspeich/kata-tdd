package numerals;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    // @Test
    // public void testSingleDigit() {
    //     assertThat(RomanNumerals.toRoman(1)).isEqualTo("I");
    // }

    // @Test
    // public void testTens() {
    //     assertThat(RomanNumerals.toRoman(10)).isEqualTo("X");
    // }

    // @Test
    // public void testComplexNumber() {
    //     assertThat(RomanNumerals.toRoman(7)).isEqualTo("VII");
    // }
    @Test
    public void testComplexNumber() {
        assertThat(RomanNumerals.toRoman(2)).isEqualTo("II");
    }
}
