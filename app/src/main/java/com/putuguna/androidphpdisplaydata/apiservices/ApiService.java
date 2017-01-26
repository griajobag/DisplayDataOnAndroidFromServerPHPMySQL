package com.putuguna.androidphpdisplaydata.apiservices;

import com.putuguna.androidphpdisplaydata.models.ListFoodModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by putuguna on 1/24/2017.
 */

public interface ApiService {
    @GET("food/DisplayJsonFood.php")
    Call<ListFoodModel> getAllDataFood();
}
