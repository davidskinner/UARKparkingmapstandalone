package com.example.davidskinner.uarkparkingmapstandalone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatDelegate;
import android.view.Menu;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);


        TouchImageView img = new TouchImageView(this);
        img.setImageResource(R.drawable.parkmapsa);
        img.setMaxZoom(4f);
        setContentView(img);
    }
}