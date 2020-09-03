package chapter4.staticVsInstance;

public class Gorilla {
    public static int count;
    public int total;
    public static double staticAverage = total / count;
    public double instanceAverage = total / count;
    int numSecondsPerMinute = 60;
    int numMinutesPerHour = 60;
    static {
        staticAverage = numSecondsPerMinute * numMinutesPerHour;
    }
}
