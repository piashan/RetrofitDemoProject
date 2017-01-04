package com.example.extreme_piash.retrofitdemoproject.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Extreme_Piash on 1/4/2017.
 */

public class Count {
    @SerializedName("Count")
    private int mCount;

    public int getmCount() {
        return mCount;
    }

    @Override
    public String toString() {
        return "Count{" +
                "mCount=" + mCount +
                '}';
    }
}
