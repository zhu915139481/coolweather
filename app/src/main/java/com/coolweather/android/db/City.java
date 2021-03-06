package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class City extends LitePalSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

}
