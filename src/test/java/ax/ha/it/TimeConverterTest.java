package ax.ha.it;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TimeConverterTest {

    @Test
    void shouldConvert60SecondsToMinute() {
        TimeConverter converter = new TimeConverter();
        assertThat(converter.secondsToMinutes(60)).isEqualTo(1.0);

    }
}
