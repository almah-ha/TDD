package ax.ha.it;

import org.junit.jupiter.api.Test;

public class TimeConverterTest {

    @Test
    void shouldConvert60SecondsToMinute() {
        TimeConverter converter = new TimeConverter();
        assertThat(converter.secondsToMinutes(60)).isEqualTo(1.0);
    }
}
