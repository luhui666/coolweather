package com.example.a16196.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 16196 on 2017/10/19.
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int provinceId;
    private int cityCode;

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
