package com.example.a16196.coolweather.db;

/**
 * Created by 16196 on 2017/10/19.
 */

public class Country extends DataSupport {
    private  int id;
    private  String countryName;
    private  String weatherId;
    private  int cityId;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
