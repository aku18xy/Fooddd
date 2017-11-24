package com.example.nas.foodlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PlaceOrder extends AppCompatActivity implements View.OnClickListener {

    int minteger = 1;
    int nombo;
    Button btnMinus, btnPlus;
    String harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_order);

        Bundle recdData = getIntent().getExtras();
        String nama = recdData.getString("nama");
        String ramuan = recdData.getString("ramuan");
        String harga = recdData.getString("harga");

        TextView txtNama2 = findViewById(R.id.txtNama2);
        TextView txtRamuan2 = findViewById(R.id.txtRamuan2);
        TextView txtHarga2 = findViewById(R.id.txtHarga2);

        txtNama2.setText(nama);
        txtRamuan2.setText(ramuan);
        txtHarga2.setText("RM" + harga);

        Button btnMinus = findViewById(R.id.btnMinus);
        Button btnPlus = findViewById(R.id.btnPlus);

        btnMinus.setOnClickListener(this);
        btnPlus.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnPlus:
                minteger = minteger +1;
                display(minteger);

                break;

            case R.id.btnMinus:
                if(nombo == 1){
                    btnMinus.setEnabled(false);
                }
                else{
                    btnMinus.setEnabled(true);
                    minteger = minteger -1;
                    display(minteger);
                }

                break;
        }


    }

    public void display (int number){
        TextView displayInteger = findViewById(R.id.txtNombo);
        displayInteger.setText("" + number);
        String nombo = displayInteger.getResources().toString();
    }

    public void addToCart (View view){
        String x = String.valueOf(Float.valueOf(nombo) * Double.valueOf(harga));
        Intent addCartIntent = new Intent(PlaceOrder.this, MainActivity.class);
        addCartIntent.putExtra("jumlahHarga", x);
        startActivity(addCartIntent);

    }



}
