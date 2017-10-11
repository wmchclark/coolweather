package com.wmch.coolweather.gson;

/**
 * Created by wmch on 2017/10/10.
 */

public class AQI {

    public AQICity city;

    public class AQICity {
        public String aqi;
        public String pm25;
    }
}
