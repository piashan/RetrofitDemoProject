package com.example.extreme_piash.retrofitdemoproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.extreme_piash.retrofitdemoproject.Model.Count;
import com.example.extreme_piash.retrofitdemoproject.Model.IndexCount;
import com.example.extreme_piash.retrofitdemoproject.Network.ApiClient;
import com.example.extreme_piash.retrofitdemoproject.interfaceapi.NetworkCallInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private NetworkCallInterface mNetworkCallInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = ApiClient.getInstance(getApplicationContext());
        mNetworkCallInterface = retrofit.create(NetworkCallInterface.class);


        mNetworkCallInterface.networkCallForCount(new IndexCount(0, 100)).enqueue(
                new Callback<Count>() {
                    @Override
                    public void onResponse(Call<Count> call, Response<Count> response) {
                        if (response.isSuccessful() && response.body() != null){
                            Log.e("Yo yo", "onResponse: "+response.body().getmCount() );
                        }
                    }

                    @Override
                    public void onFailure(Call<Count> call, Throwable t) {

                        Log.e("not yo yo", "onFailure: "+t.toString() );
                    }
                }
        );
    }
}
