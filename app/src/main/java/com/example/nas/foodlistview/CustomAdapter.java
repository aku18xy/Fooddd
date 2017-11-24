package com.example.nas.foodlistview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * Created by nas on 18/11/2017.
 */

public class CustomAdapter extends ArrayAdapter<FoodData>  {

    private ArrayList<FoodData> dataSet;
    Context mContext;

    CustomAdapter(Context context, @NonNull ArrayList<FoodData> data) {
        super(context, R.layout.custom_listview, data);
        this.dataSet=data;
        this.mContext=context;
        Log.i("dududu", "custom adapter");
    }

    @SuppressLint("ViewHolder")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        FoodData foodData = getItem(position);

        //ni ikut sample tutorial
        LayoutInflater inflater = LayoutInflater.from(getContext());
        @SuppressLint("ViewHolder") View customView = inflater.inflate(R.layout.custom_listview, parent, false);
        TextView txtNama = (TextView) customView.findViewById(R.id.txtnama);
        TextView txtRamuan = (TextView) customView.findViewById(R.id.txtRamuan);
        TextView txtHarga = (TextView) customView.findViewById(R.id.txtHarga);


        txtNama.setText(foodData.getNama());
        txtRamuan.setText(foodData.getRamuan());
        txtHarga.setText("RM" + foodData.getHarga());
        return customView;
        ////////////sampai sini//////////////////////////


    }
}





























