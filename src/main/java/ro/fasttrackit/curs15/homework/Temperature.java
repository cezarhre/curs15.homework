package ro.fasttrackit.curs15.homework;

public class Temperature {
    public static double fahrenheitToCelsius(double temp) {
        return (temp - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double temper) {
        return temper * 9 / 5 + 32;
    }
}
