package com.atiqrs.apidemo;

import com.atiqrs.apidemo.Model.JsonResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api")
    Call<JsonResponse> getData();
}
