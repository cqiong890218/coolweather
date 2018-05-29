package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @Author caoqiong
 * @CreateDate 2018/5/29
 * @Description
 */


public class City extends DataSupport {

    private int id;//记录城市id
    private String cityName;//记录城市名字
    private int cityCode;//记录城市代码
    private int provinceId;//记录当前城市所属省份的id

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
