package com.example.a3dmuseum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageView aang = (ImageView) findViewById(R.id.imageView2);
        aang.setImageResource(R.drawable.aang);

        // Get data from MainActivity and display it
        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textview1 = (TextView) findViewById(R.id.textView2);
        textview1.setText(text);
        TextView textview2 = (TextView) findViewById(R.id.textView6);
        textview2.setText(text);
    }
}