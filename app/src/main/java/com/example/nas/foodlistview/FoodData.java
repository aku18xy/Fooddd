package com.example.nas.foodlistview;

import android.util.Log;

/**
 * Created by nas on 18/11/2017.
 */

public class FoodData {

    String nama;
    String ramuan;
    String harga;

    public FoodData(String nama, String ramuan, String harga){
        this.nama=nama;
        this.ramuan=ramuan;
        this.harga=harga;
    }

    public String getNama(){
        return nama;
    }

    public String getRamuan(){
        return ramuan;
    }

    public String getHarga(){
        return harga;
    }



}
