package com.example.extreme_piash.retrofitdemoproject.Network;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Extreme_Piash on 1/4/2017.
 */

public class ApiClient {
    private static Retrofit sRetrofit;

    private ApiClient() {
    }

    public synchronized static Retrofit getInstance(final Context context) {
        if (sRetrofit == null) {
            createRetrofit(context);
        }
        return sRetrofit;
    }


    private static void createRetrofit(final Context context) {
        OkHttpClient okHttpClient = new OkHttpClient.Builder().readTimeout(30, TimeUnit.SECONDS)
                .cache(new Cache(context.getCacheDir(), 10 * 1024 * 1024))
                .build();
        sRetrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("http://api.ajkerdeal.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}
