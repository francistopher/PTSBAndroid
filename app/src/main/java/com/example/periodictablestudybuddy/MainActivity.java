package com.example.periodictablestudybuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.periodictablestudybuddy.Utilities.Dimensions;

public class MainActivity extends AppCompatActivity {

    private void setDimensionsInstance() {
        Dimensions.setInstance(getWindowManager());
        Dimensions instance = Dimensions.getInstance();
        //System.out.println("Width " + instance.getWidth(0.5f) + ", Height: " + instance.getHeight(0.5f));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View mainLayout = findViewById(R.id.laidout);
        mainLayout.setBackgroundColor(Color.BLACK);
    }
}