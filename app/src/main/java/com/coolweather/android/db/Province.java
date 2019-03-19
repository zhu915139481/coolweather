package com.coolweather.android.db;

import org.litepal.crud.LitePalSupport;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Province extends LitePalSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

}