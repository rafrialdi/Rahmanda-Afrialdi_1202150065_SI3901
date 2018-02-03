package com.example.android.rahmandaafrialdi_1202150065_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etFood, etPortion; //sebagai atribut
    Intent intent;
    String restaurant, menu;
    int portion;

    @Override
    //onCreate method yang pertama kali dijalankan
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFood = (EditText)findViewById(R.id.et_food);
        etPortion = (EditText)findViewById(R.id.et_portion);
        intent = new Intent(this,TotalPesanan.class);

    }

    public void onEatbus(View view) {

        menu = etFood.getText().toString();
        restaurant = "Eatbus";
        portion = Integer.parseInt(etPortion.getText().toString());
        int total = 50000 * portion; //LOG menampilkan data informasi developer(munculnya di logcat android studio)
        Log.d("TOTAL HARGA", "Rp. "+total); //menampilkan sesuatu di Logcat android studio
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu", menu);
        intent.putExtra("portion",portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }

    public void onAbnormal(View view) {

        menu = etFood.getText().toString();
        restaurant = "Abnormal";
        portion = Integer.parseInt(etPortion.getText().toString());
        int total = 30000 * portion; //LOG menampilkan data informasi developer(munculnya di logcat android studio)
        Log.d("TOTAL HARGA", "Rp. "+total); //menampilkan sesuatu di Logcat android studio
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu", menu);
        intent.putExtra("portion",portion);
        intent.putExtra("price",total);
        startActivity(intent);
    }
}
