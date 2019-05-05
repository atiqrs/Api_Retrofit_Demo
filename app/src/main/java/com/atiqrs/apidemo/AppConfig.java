package com.atiqrs.apidemo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppConfig {
    public static String BASE_URL = "*****API LINK*****";

    public static Retrofit getRetrofit(){
        return new Retrofit.Builder()
                .baseUrl(AppConfig.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
