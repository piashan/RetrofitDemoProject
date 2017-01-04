package com.example.extreme_piash.retrofitdemoproject.Model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Extreme_Piash on 1/4/2017.
 */

public class IndexCount {
    @SerializedName("MinPrice")
     private int MinPrice;
    @SerializedName("MaxPrice")
     private int MaxPrice;

    public IndexCount(int minPrice, int maxPrice) {
        MinPrice = minPrice;
        MaxPrice = maxPrice;
    }

    public void setMinPrice(int minPrice) {
        MinPrice = minPrice;
    }

    public void setMaxPrice(int maxPrice) {
        MaxPrice = maxPrice;
    }

    @Override
    public String toString() {
        return "IndexCount{" +
                "MinPrice=" + MinPrice +
                ", MaxPrice=" + MaxPrice +
                '}';
    }
}
