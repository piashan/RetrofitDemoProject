package com.example.extreme_piash.retrofitdemoproject.interfaceapi;

import com.example.extreme_piash.retrofitdemoproject.Model.Count;
import com.example.extreme_piash.retrofitdemoproject.Model.IndexCount;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Extreme_Piash on 1/4/2017.
 */

public interface NetworkCallInterface {

    @POST("AppApi/Categories/ProductCountWithRange")
    Call<Count> networkCallForCount(@Body IndexCount body);
}
