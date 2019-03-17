package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

import lombok.Data;

@Data
public class County extends LitePalSupport {

    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

}
