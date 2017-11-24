package com.example.nas.foodlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<FoodData> foodList;
    TextView jumlahHarga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("dududu","onCreate");


        ListView listView = (ListView) findViewById(R.id.list);

        foodList = new ArrayList<>();

        foodList.add(new FoodData("Satay", "Ayam", "0.90"));
        foodList.add(new FoodData("Satay", "Daging", "1.00"));
        foodList.add(new FoodData("Satay", "Kambing", "1.50"));
        foodList.add(new FoodData("Satay", "Perut", "1.20"));
        foodList.add(new FoodData("Nasi Impit", "Rice cake", "0.50"));
        foodList.add(new FoodData("Mee Rebus", "Mee dengan kuah", "4.50"));
        foodList.add(new FoodData("Soto", "Nasi impit dengan sup", "3.50"));
        foodList.add(new FoodData("Mee Sup", "Mee dengan sup", "4.00"));
        foodList.add(new FoodData("Bihun Sup", "Bihun dengan sup", "4.00"));
        foodList.add(new FoodData("Kuey Tiaw Sup", "Kuew tiaw dengan sup", "4.00"));
        foodList.add(new FoodData("Nasi Lemak", "Nasi dengan lemak", "1.50"));

        ListAdapter adapter = new CustomAdapter(this, foodList);

        listView.setAdapter(adapter);

//        Log.i("dududu", "set adapter");

        listView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Intent i = new Intent(MainActivity.this, PlaceOrder.class);
//                        FoodData foodData = foodList.get(position);
                        String nama = foodList.get(position).getNama();
                        String ramuan = foodList.get(position).getRamuan();
                        String harga = foodList.get(position).getHarga();
                        i.putExtra("nama", nama);
                        i.putExtra("ramuan", ramuan);
                        i.putExtra("harga", harga);

                        Log.i("dududu", "intent dapat");

                        startActivity(i);
                    }
                }
        );

    }



    //    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_settings) {
//            return true;
//        }
//
//        return super.onOptionsItemSelected(item);
//    }
}



















