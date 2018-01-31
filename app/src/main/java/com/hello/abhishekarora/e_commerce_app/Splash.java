package com.hello.abhishekarora.e_commerce_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import pl.droidsonroids.gif.GifTextureView;

public class Splash extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);



        Intent intent = new Intent(this, CartShek.class);
        startActivity(intent);
        finish();
    }
}
