package ax.ha.it;

public class TimeConverter {

    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MINUTES_PER_HOUR = 60;

    public static double secondsToMinutes(long seconds) {
        validateNonNegative(seconds, "seconds");
        return (double) seconds / SECONDS_PER_MINUTE;
    }

    public static void validateNonNegative(long value, String name) {
        if (value < 0) {
            throw new IllegalArgumentException(name + " must be non-negative");
        }
    }

    public static double minutesToSeconds(long minutes) {
        validateNonNegative(minutes, "minutes");
        return (double) minutes * SECONDS_PER_MINUTE;
    }

    public static double minutesToHours(long minutes) {
        validateNonNegative(minutes, "minutes");
        return (double) minutes / MINUTES_PER_HOUR;
    }
}
