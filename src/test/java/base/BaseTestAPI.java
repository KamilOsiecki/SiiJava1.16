package base;

import configuration.AppProperties;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.jupiter.api.BeforeEach;

public class BaseTestAPI {

    private static String CITY = System.getProperty("paramNameCityName");

    @BeforeEach
    public void setup() {
        AppProperties properties = configuration.AppProperties.getInstance();
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
    }
}