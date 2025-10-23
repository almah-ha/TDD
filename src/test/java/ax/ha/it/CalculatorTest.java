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
    void shouldSubtractTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(1, 1);
        assertThat(result).isEqualTo(0);
    }


}
