package ax.ha.it;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MoneyConverter {

    public static final BigDecimal USD_TO_EUR_RATE = new BigDecimal("0.92");
    public static final BigDecimal EUR_TO_USD_RATE = new BigDecimal("0.92");
    public static final BigDecimal EUR_TO_SEK_RATE = new BigDecimal("10.93");

    public BigDecimal usdToEur(BigDecimal usd) {
        BigDecimal eur = usd.multiply(USD_TO_EUR_RATE);
        eur = eur.setScale(2, RoundingMode.HALF_UP);
        return eur;
    }

    public BigDecimal eurToUsd(BigDecimal eur) {
        BigDecimal usd = eur.divide(EUR_TO_USD_RATE);
        usd = usd.setScale(2, RoundingMode.HALF_UP);
        return usd;
    }

    public BigDecimal eurToSek(BigDecimal eur) {
        BigDecimal sek = eur.multiply(EUR_TO_SEK_RATE);
        sek = sek.setScale(2, RoundingMode.HALF_UP);
        return sek;
    }
}

