package com.wmch.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by wmch on 2017/10/10.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}
