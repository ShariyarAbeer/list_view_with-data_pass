package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DataPass extends AppCompatActivity {
    TextView textView;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pass);

        textView = findViewById(R.id.datapass);
        Intent intent = getIntent();
        data = intent.getStringExtra("data");
        textView.setText(data);

    }
}