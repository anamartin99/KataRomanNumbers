import org.example.RomanNumeralGenerator;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class RomanNumeralGeneratorShould {
@Test
public void
    generate_a_roman_numeral_for_a_given_decimal_number() {
    assertThat(RomanNumeralGenerator.romanFor(1), is("I"));
    assertThat(RomanNumeralGenerator.romanFor(2), is("II"));
    assertThat(RomanNumeralGenerator.romanFor(3), is("III"));
    assertThat(RomanNumeralGenerator.romanFor(5), is("V"));
    assertThat(RomanNumeralGenerator.romanFor(7), is("VII"));
    assertThat(RomanNumeralGenerator.romanFor(10), is("X"));
    assertThat(RomanNumeralGenerator.romanFor(18), is("XVIII"));
    }
}
