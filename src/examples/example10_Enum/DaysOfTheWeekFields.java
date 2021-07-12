package examples.example10_Enum;

public enum DaysOfTheWeekFields {
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THURSDAY(false),
    FRIDAY(false),
    SATURDAY(true),
    SUNDAY(true);

    private final boolean isWeekend;

    DaysOfTheWeekFields(final boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public static boolean isWeekend() {
        return isWeekend;
    }

}

