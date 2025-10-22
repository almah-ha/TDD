import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldAddTwoPositiveNumbers() {
        Calculator calculator = new Calculator();
        int result = add.calculator(1, 1);
        assertThat(result).isEqualto(2);
    }

}
