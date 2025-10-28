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

    @Test
    void shouldConvert92EURToUSD() {
        MoneyConverter converter = new MoneyConverter();
        BigDecimal eur = new BigDecimal("92.00");
        BigDecimal result = converter.eurToUsd(eur);
        assertThat(result).isEqualByComparingTo("100.00");
    }

    @Test
    void shouldConvert100EURToSEK() {
        MoneyConverter converter = new MoneyConverter();
        BigDecimal eur = new BigDecimal("100.00");
        BigDecimal result = converter.eurToSek(eur);
        assertThat(result).isEqualByComparingTo("1093.00");
    }

    @Test
    void shouldConvert100SEKToEUR() {
        MoneyConverter converter = new MoneyConverter();
        BigDecimal sek = new BigDecimal("100.00");
        BigDecimal result = converter.sekToEur(sek);
        assertThat(result).isEqualByComparingTo("9.00");
    }
}
