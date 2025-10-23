package ax.ha.it;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 1);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void shouldSubtractTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(1, 1);
        assertThat(result).isEqualTo(0);
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(2, 4);
        assertThat(result).isEqualTo(8);
    }

    @Test
    void shouldDivideTwoNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(4, 2);
        assertThat(result).isEqualTo(2);
    }


}
