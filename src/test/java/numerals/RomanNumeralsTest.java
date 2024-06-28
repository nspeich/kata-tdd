package numerals;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

public class RomanNumeralsTest {

    @Test
    public void testSingleDigit() {
        assertThat(RomanNumerals.toRoman(1)).isEqualTo("I");
    }

    @Test
    public void testComplexNumber_2() {
        assertThat(RomanNumerals.toRoman(2)).isEqualTo("II");
    }

    @Test
    public void testComplexNumber_7() {
        assertThat(RomanNumerals.toRoman(7)).isEqualTo("VII");
    }

    @Test
    public void testTens() {
        assertThat(RomanNumerals.toRoman(10)).isEqualTo("X");
    }

    @Test
    public void testThousands() {
        assertThat(RomanNumerals.toRoman(1000)).isEqualTo("M");
        assertThat(RomanNumerals.toRoman(2000)).isEqualTo("MM");
        assertThat(RomanNumerals.toRoman(3000)).isEqualTo("MMM");
    }
}

