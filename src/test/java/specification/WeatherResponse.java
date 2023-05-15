package specification;

import enums.Cities;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

import static org.hamcrest.Matchers.hasValue;
import static org.hamcrest.Matchers.is;

public class WeatherResponse {

    public static ResponseSpecification expectedCityName(Cities city) {
        return new ResponseSpecBuilder()
                .expectBody("name", is(city.getCityName()))
                .expectBody("sys", hasValue(city.getCountry()))
                .expectBody("id", is(city.getCityId()))
                .expectStatusCode(200)
                .build();
    }
}