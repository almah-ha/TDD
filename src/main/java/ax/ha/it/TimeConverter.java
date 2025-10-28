package ax.ha.it;

public class TimeConverter {

    private static final int SECONDS_PER_MINUTE = 60;

    public static double secondsToMinutes(long seconds) {
        validateNonNegativeSeconds(seconds, "seconds");
        return (double) seconds / SECONDS_PER_MINUTE;
    }

    public static void validateNonNegativeSeconds(long value, String name) {
        if (value < 0) {
            throw new IllegalArgumentException(name + " must be non-negative");
        }
    }

}
