package com.atiqrs.apidemo;

import com.atiqrs.apidemo.Model.JsonResponse;
import com.atiqrs.apidemo.QueryModel.SignInResponse;
import com.atiqrs.apidemo.RegModel.RegistrationResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("api")
    Call<JsonResponse> getData();

    @FormUrlEncoded
    @POST("hms/auth/registration")
    Call<RegistrationResponse> postData(@Field("api_key") String api_key,
                                        @Field("firstname") String firstname,
                                        @Field("lastname") String lastname,
                                        @Field("email") String email,
                                        @Field("password") String password,
                                        @Field("mobile") String mobile
                                        );

    @GET("hms/auth/login")
    Call<SignInResponse> queryData(@Query("api_key") String api_key,
                   @Query("email") String email,
                   @Query("password") String password
                   );

}
