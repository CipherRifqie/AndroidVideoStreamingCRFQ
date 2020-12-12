package com.example.streamingandrouas.rest;

import com.example.streamingandrouas.data.model.CallResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("video/auth")
    Call<CallResponse> postAuth(
            @Field("android_id") String android_id);

    @GET("video")
    Call<CallResponse> getVideo(@Query("title") String title);
}

