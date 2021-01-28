package com.example.imageloading;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView=findViewById(R.id.imageView);

        Glide
                .with(MainActivity.this)
                .load("https://freepikpsd.com/prime-minister-of-bangladesh-sheikh-hasina-png/1388275/")
                .centerCrop()
                .into(imageView);
    }
}