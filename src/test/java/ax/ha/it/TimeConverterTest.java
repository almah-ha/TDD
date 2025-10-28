package ax.ha.it;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TimeConverterTest {

    private TimeConverter converter;

    @BeforeEach
    void setUp() {
        converter = new TimeConverter();
    }

    @Test
    void shouldConvert60SecondsToMinute() {
        assertThat(converter.secondsToMinutes(60)).isEqualTo(1.0);
    }

    @Test
    void shouldThrowExceptionForNegativeSeconds() {
        assertThatThrownBy(() -> converter.secondsToMinutes(-10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("seconds must be non-negative");
    }

    @Test
    void shouldConvert1MinuteToSeconds() {
        assertThat(converter.minutesToSeconds(1)).isEqualTo(60.0);
    }


}
