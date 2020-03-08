package curs14.homework;

public enum Type {
    HIGH,
    AVERAGE,
    LOW;

    public static Type calculateType(long density) {
        if (density >= 1000) {
            return HIGH;
        } else if (density < 200) {
            return LOW;
        }
        return AVERAGE;
    }
}

