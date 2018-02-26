package com.example.calvin.droidcafe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();
    }

    public void showDonutOrder (View view){
        showFoodOrdered(getString(R.string.donut_order_message));
    }

    public void showIceCreamOrder (View view) {
        showFoodOrdered(getString(R.string.ice_cream_order_message));
    }

    public void showFroyoOrder (View view){
        showFoodOrdered(getString(R.string.froyo_order_message));
    }


    public void showFoodOrdered (String message){
        displayToast(message);
    }
}
