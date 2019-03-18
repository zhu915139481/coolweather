package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {

    public static void sendOkHttpRequest(String url, okhttp3.Callback callback) {
        Request request = new Request.Builder().url(url).build();
        new OkHttpClient().newCall(request).enqueue(callback);
    }


}
