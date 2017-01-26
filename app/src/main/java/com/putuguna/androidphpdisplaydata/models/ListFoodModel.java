package com.putuguna.androidphpdisplaydata.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by putuguna on 1/25/2017.
 */

public class ListFoodModel {
    @SerializedName("food")
    private List<FoodModel> listFoodM;
    @SerializedName("status")
    private int status;
    @SerializedName("message")
    private String message;

    public ListFoodModel(List<FoodModel> listFoodM, int status, String message) {
        this.listFoodM = listFoodM;
        this.status = status;
        this.message = message;
    }

    public ListFoodModel() {
    }

    public List<FoodModel> getListFoodM() {
        return listFoodM;
    }

    public void setListFoodM(List<FoodModel> listFoodM) {
        this.listFoodM = listFoodM;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
