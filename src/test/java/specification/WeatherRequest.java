package specification;

import enums.Cities;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class WeatherRequest {

    public static RequestSpecification getWeatherInfoByCityName(Cities city) {
        return new RequestSpecBuilder()
                .setBaseUri(System.getProperty("baseUri"))
                .setBasePath(System.getProperty("pathToWeather"))
                .addParam("appId", System.getProperty("appId"))
                .addParam("q", city.getCityName())
                .setContentType(ContentType.JSON)
                .build();
    }
}