package com.example.a3dmuseum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ImageView imageView = (ImageView) findViewById(R.id.imageView);
        // imageView.setImageResource(R.drawable.aang);

        // Get data from MainActivity3 and display it
        Intent intent = getIntent();
        String text1 = intent.getStringExtra(MainActivity3.EXTRA_MESSAGE);
        TextView textbox1 = (TextView) findViewById(R.id.textView9);
        textbox1.setText(text1);
    }

    // Send data to MainActivity2
    public void sendMessage(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    // Send data to MainActivity3
    public void sendMessage2(View view){
        Intent intent = new Intent(this, MainActivity3.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}