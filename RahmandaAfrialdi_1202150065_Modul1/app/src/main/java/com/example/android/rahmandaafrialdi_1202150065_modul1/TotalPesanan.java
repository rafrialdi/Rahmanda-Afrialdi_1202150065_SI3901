package com.example.android.rahmandaafrialdi_1202150065_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class TotalPesanan extends AppCompatActivity {

    TextView tvRestaurant, tvMenu, tvPortion, tvPrice;
    String restaurant, menu;
    int portion, price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_pesanan);
        tvRestaurant = (TextView)findViewById(R.id.tv_restaurant);
        tvMenu = (TextView)findViewById(R.id.tv_menu);
        tvPortion = (TextView)findViewById(R.id.tv_portion);
        tvPrice = (TextView)findViewById(R.id.tv_price);

        Intent intent = getIntent();
        restaurant = intent.getStringExtra("restaurant");
        menu = intent.getStringExtra("menu");
        portion = intent.getIntExtra("portion",0);
        price =  intent.getIntExtra("price", 0);

        tvRestaurant.setText(restaurant); //setText untuk mengisi komponen dengan data
        tvMenu.setText(menu);
        tvPortion.setText(""+portion);
        tvPrice.setText(""+price);

        Toast toast = null;
        if(price < 65000){
            toast = Toast.makeText(getApplicationContext(), "Disini aja makan malamnya", Toast.LENGTH_SHORT);
        }else {
            toast = Toast.makeText(getApplicationContext(), "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_SHORT);
        }
        toast.show();
    }
}
