package de.floriangross.demo.romannumbers.control;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.assertThat;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class RomanNumbersConverterTest {

    private RomanNumbersConverter romanNumbersConverter;

    @BeforeEach
    void setUp() {
        romanNumbersConverter = new RomanNumbersConverter();
    }

    @Test
    void should_throw_NAN_when_number_is_0() {
        assertThat(romanNumbersConverter.convert(0)).isEqualTo("NAN");
    }

    @Test
    void should_throw_NAN_when_number_is_larger_than_3999() {
        assertThat(romanNumbersConverter.convert(4000)).isEqualTo("NAN");
    }

    @Test
    void shoud_return_I_when_number_is_1() {
        assertThat(romanNumbersConverter.convert(1)).isEqualTo("I");
    }

    @Test
    void should_return_XIV_when_number_is_14(){
        assertThat(romanNumbersConverter.convert(14)).isEqualTo("XIV");
    }

    @Test
    void should_return_II_when_nuber_is_2() {
        assertThat(romanNumbersConverter.convert(2)).isEqualTo("II");
    }
}
