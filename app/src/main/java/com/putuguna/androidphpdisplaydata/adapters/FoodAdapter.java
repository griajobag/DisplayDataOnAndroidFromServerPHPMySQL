package com.putuguna.androidphpdisplaydata.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.putuguna.androidphpdisplaydata.R;
import com.putuguna.androidphpdisplaydata.models.FoodModel;

import java.util.List;

/**
 * Created by putuguna on 1/25/2017.
 */

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{

    private List<FoodModel> listFoodModel;
    private Context context;

    public FoodAdapter(List<FoodModel> listFoodModel, Context context) {
        this.listFoodModel = listFoodModel;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_food,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        FoodModel model = listFoodModel.get(position);

        try{
            holder.tvFoodName.setText(model.getFoodName());
            holder.tvFoodQty.setText(model.getFoodQty()+"");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public int getItemCount() {
        return listFoodModel.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView tvFoodName;
        private TextView tvFoodQty;

        public ViewHolder(View itemView) {
            super(itemView);

            tvFoodName = (TextView) itemView.findViewById(R.id.textview_foodname);
            tvFoodQty = (TextView) itemView.findViewById(R.id.textview_foodqty);
        }
    }
}
