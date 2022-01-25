package ro.fasttrackit.curs15.homework;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TemperatureTest {
    @Test
    @DisplayName("WHEN boiled water temperature THEN celsius is 100 and fahrenheit is 212")
    void testBoiledWater(){
        //SETUP
        //RUN
        double temp = Temperature.fahrenheitToCelsius(212);
        double temper = Temperature.celsiusToFahrenheit(100);
        //ASSERT
        assertThat(temp).isEqualTo(100);
        assertThat(temper).isEqualTo(212);
    }

    @Test
    @DisplayName("WHEN frozen water temperature THEN celsius is 0 and fahrenheit is 32")
    void testFrozenWater(){
        //SETUP
        //RUN
        double temp = Temperature.fahrenheitToCelsius(32);
        double temper = Temperature.celsiusToFahrenheit(0);
        //ASSERT
        assertThat(temp).isEqualTo(0);
        assertThat(temper).isEqualTo(32);
    }

    @Test
    @DisplayName("WHEN body temperature THEN celsius is 37 and fahrenheit is 98.6")
    void testBodyTemperature(){
        //SETUP
        //RUN
        double temp = Temperature.fahrenheitToCelsius(98.6);
        double temper = Temperature.celsiusToFahrenheit(37);
        //ASSERTS
        assertThat(temp).isEqualTo(37);
        assertThat(temper).isEqualTo(98.6);
    }
}

