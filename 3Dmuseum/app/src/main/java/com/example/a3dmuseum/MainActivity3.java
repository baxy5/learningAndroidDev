package com.example.a3dmuseum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "Tokmindegy";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        // Get data from MainActivity and display it
        Intent intent = getIntent();
        String text = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textbox = (TextView) findViewById(R.id.textView7);
        textbox.setText(text);
    }

    // Send data to MainAcitivity
    public void sikerFunc(View view){
        Intent intent = new Intent(this, MainActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName2);
        String textValue = editText.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, textValue);
        startActivity(intent);
    }
}