package ax.ha.it;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class TimeConverterTest {

    @Test
    void shouldConvert60SecondsToMinute() {
        assertThat(TimeConverter.secondsToMinutes(60)).isEqualTo(1.0);
    }

    @Test
    void shouldThrowExceptionForNegativeSeconds() {
        assertThatThrownBy(() -> TimeConverter.secondsToMinutes(-10))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("seconds must be non-negative");
    }

    @Test
    void shouldConvert1MinuteToSeconds() {
        assertThat(TimeConverter.minutesToSeconds(1)).isEqualTo(60.0);
    }

    @Test
    void shouldConvert60MinutesToHours() {
        assertThat(TimeConverter.minutesToHours(60)).isEqualTo(1.0);
    }

    @Test
    void shouldConvert1HourToMinutes() {
        assertThat(TimeConverter.hoursToMinutes(1)).isEqualTo(60.0);
    }

    @Test
    void shouldConvertHoursToDays() {
        assertThat(TimeConverter.hoursToDays(24)).isEqualTo(1.0);
    }

    @Test
    void shouldConvertDaysToHours() {
        assertThat(TimeConverter.daysToHours(1)).isEqualTo(24.0);
    }

    @Test
    void shouldConvertSecondsToHours() {
        assertThat(TimeConverter.secondsToHours(3600)).isEqualTo(1.0);
    }

    @Test
    void shouldConvertMinutesToDays() {
        assertThat(TimeConverter.minutesToDays(1440)).isEqualTo(1.0);
    }

    @Test
    void shouldConvertDaysToMinutes() {
        assertThat(TimeConverter.daysToMinutes(2)).isEqualTo(2880);
    }

}
