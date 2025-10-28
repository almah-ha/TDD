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
                .hasMessageContaining("Seconds must be between 0 and 59");
    }


}
