package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @Author caoqiong
 * @CreateDate 2018/5/29
 * @Description
 */


public class Country extends DataSupport {

    private int id;//记录县城id
    private String countryName;//记录县城名称
    private String weatherId;//记录该县城所对应的天气id
    private int cityId;//记录当前线程所属城市id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
