package ax.ha.it;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyConverter {

    public static final BigDecimal USD_TO_EUR_RATE = new BigDecimal("0.92");

    public BigDecimal usdToEur(BigDecimal usd) {
        BigDecimal eur = usd.multiply(USD_TO_EUR_RATE);
        eur = eur.setScale(2, RoundingMode.HALF_UP);
        return eur;
    }
}

