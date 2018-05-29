package com.example.coolweather.gson;

/**
 * @Author caoqiong
 * @CreateDate 2018/5/29
 * @Description
 */


public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
