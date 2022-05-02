package javaAssignment;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int hour, int minute, int second) {
        validate(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    private void validate(int hour, int minute, int second) {
        boolean hourIsInvalid = hour < 0 || hour >= 24;
        if (hourIsInvalid) throw new IllegalArgumentException("Invalid hour");
        boolean minuteIsValid = minute < 0 || minute >= 60;
        if (minuteIsValid) throw new IllegalArgumentException("Invalid minute");
        boolean secondIsInvalid = second < 0 || second >= 60;
        if (secondIsInvalid) throw new IllegalArgumentException("Invalid seconds");
    }
}
