package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * @Author caoqiong
 * @CreateDate 2018/5/29
 * @Description
 */


public class Province extends DataSupport {

    private int id;//记录省份Id
    private String provinceName;//记录省份名字
    private int provinceCode;//记录省份代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
