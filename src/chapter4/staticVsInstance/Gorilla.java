package chapter4.staticVsInstance;

public class Gorilla {
    public static int count;
    public int total;
    public static double staticAverage = total / count;
    public double instanceAverage = total / count;
}
