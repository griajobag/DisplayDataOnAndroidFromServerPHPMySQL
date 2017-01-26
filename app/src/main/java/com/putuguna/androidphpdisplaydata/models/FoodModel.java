package com.putuguna.androidphpdisplaydata.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by putuguna on 1/25/2017.
 */

public class FoodModel {
    @SerializedName("idfood")
    private int idFood;
    @SerializedName("foodname")
    private String foodName;
    @SerializedName("foodqty")
    private int foodQty;

    public FoodModel() {
    }

    public FoodModel(int idFood, String foodName, int foodQty) {
        this.idFood = idFood;
        this.foodName = foodName;
        this.foodQty = foodQty;
    }

    public int getIdFood() {
        return idFood;
    }

    public void setIdFood(int idFood) {
        this.idFood = idFood;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodQty() {
        return foodQty;
    }

    public void setFoodQty(int foodQty) {
        this.foodQty = foodQty;
    }
}
