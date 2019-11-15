package roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanNumeralTest {

    private RomanNumeral romanNumeral;

    @BeforeEach
    private void setUp() {
        romanNumeral = new RomanNumeral();
    }

    // I - 1
    @Test
    public void whenPassOneNumber_returnHisValue() {
        int actual = romanNumeral.convertRoman("I");
        Assertions.assertEquals(1, actual);
    }

    // II - 2
    @Test
    public void whenPassMoreThanOneNumber_returnHisValue() {
        int actual = romanNumeral.convertRoman("II");
        Assertions.assertEquals(2, actual);
    }

    // V - 5
    @Test
    public void whenPassOneNumber_withDifferentValue_returnHisValue() {
        int actual = romanNumeral.convertRoman("V");
        Assertions.assertEquals(5, actual);
    }

    // XVI = 16
    @Test
    public void whenPassMoreThanOneNumber_withDifferentValue_returnHisValue() {
        int actual = romanNumeral.convertRoman("XVI");
        Assertions.assertEquals(16, actual);
    }

    // VII - 7
    @Test
    public void whenPassMoreThanOneNumber_withRepeatableCharacter_returnHisValue() {
        int actual = romanNumeral.convertRoman("VII");
        Assertions.assertEquals(7, actual);
    }

    // IV - 4
    @Test
    public void whenPassMoreThanOneNumber_withAnterior_returnHisValue() {
        int actual = romanNumeral.convertRoman("IV");
        Assertions.assertEquals(4, actual);
    }

    // XIV - 14
    @Test
    public void whenPassMoreThanOneNumer_withAnotherAnterior_returnHisValue() {
        int actual = romanNumeral.convertRoman("XIV");
        Assertions.assertEquals(14, actual);
    }
}
