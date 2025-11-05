package ax.ha.it;

public class TimeConverter {

    private static final int SECONDS_PER_MINUTE = 60;
    private static final int MINUTES_PER_HOUR = 60;
    private static final int HOURS_PER_DAY = 24;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int MINUTES_PER_DAY = 1440;

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

    public static double hoursToMinutes(long hours) {
        validateNonNegative(hours, "hours");
        return (double) hours * MINUTES_PER_HOUR;
    }

    public static double hoursToDays(long hours) {
        validateNonNegative(hours, "hours");
        return (double) hours / HOURS_PER_DAY;
    }

    public static double daysToHours(long days) {
        validateNonNegative(days, "days");
        return (double) days * HOURS_PER_DAY;
    }

    public static double secondsToHours(long seconds) {
        validateNonNegative(seconds, "seconds");
        return (double) seconds / SECONDS_PER_HOUR;
    }

    public static double minutesToDays(long minutes) {
        validateNonNegative(minutes, "minutes");
        return (double) minutes / MINUTES_PER_DAY;
    }


}
