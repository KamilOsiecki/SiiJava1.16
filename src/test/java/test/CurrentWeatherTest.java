package test;

import base.BaseTestAPI;
import enums.Cities;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import specification.WeatherRequest;
import specification.WeatherResponse;

import static io.restassured.RestAssured.given;

public class CurrentWeatherTest extends BaseTestAPI {

    @ParameterizedTest
    @EnumSource(value = Cities.class)
    @DisplayName("CurrentWeatherInCity")
    @Tag("Regression")
    public void getWeatherInfoByCity(Cities cities) {

        given().
                spec(WeatherRequest.getWeatherInfoByCityName(cities)).
        when().
                get().
        then().
                spec(WeatherResponse.expectedCityName(cities));
    }
}