package org.launchcode;

public class Temperature {

    private double fahrenheit;

    private static final double ABSOLUTE_ZERO_FAHRENHEIT = -459.67;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        if (aFahrenheit < ABSOLUTE_ZERO_FAHRENHEIT) {
            throw new IllegalArgumentException("Value is below absolute zero");
        }

        fahrenheit = aFahrenheit;
    }

    /* rest of the class... */

}
