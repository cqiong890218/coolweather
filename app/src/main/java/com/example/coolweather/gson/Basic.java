package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * @Author caoqiong
 * @CreateDate 2018/5/29
 * @Description
 */


public class Basic {

    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weaterId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
