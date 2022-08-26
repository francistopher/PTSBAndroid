package com.example.periodictablestudybuddy;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.periodictablestudybuddy.Utilities.Colors;
import com.example.periodictablestudybuddy.Utilities.Dimensions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View mainLayout = findViewById(R.id.laidout);
        mainLayout.setBackgroundColor(Colors.TEAL_LIGHT);

        Dimensions.setInstance(getWindowManager());

    }
}