package enums;

public enum Cities {

    LONDON("London", "GB", 2643743),
    OXFORD("Oxford", "GB", 2640729),
    GDANSK("Gdańsk", "PL", 3099434);

    private final String cityName;
    private final String country;
    private final int cityId;

    Cities(String cityName, String country, int cityId) {
        this.cityName = cityName;
        this.country = country;
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountry() {
        return country;
    }

    public int getCityId() {
        return cityId;
    }
}