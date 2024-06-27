package src.test.java.numerals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RomanNumeralsTest {

    @Test
    public void testSingleDigit() {
        assertThat(RomanNumerals.toRoman(1)).isEqualTo("I");
    }

    @Test
    public void testComplexNumber() {
        assertThat(RomanNumerals.toRoman(7)).isEqualTo("VII");
    }

    @Test
    public void testTens() {
        assertThat(RomanNumerals.toRoman(10)).isEqualTo("X");
    }
}
