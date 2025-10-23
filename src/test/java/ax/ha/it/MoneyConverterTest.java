package ax.ha.it;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;

public class MoneyConverterTest {

    @Test
    void shouldConvert100USDToEUR() {
        MoneyConverter converter = new MoneyConverter();
        BigDecimal usd = new BigDecimal("100.00");
        BigDecimal result = converter.usdToEur(usd);
        assertThat(result).isEqualByComparingTo("92.00");
    }
}
