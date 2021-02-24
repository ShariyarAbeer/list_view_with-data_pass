package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    String[] listName = new String[]{"abeer", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor", "tanvire", "mahinoor"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this, R.layout.item_view, R.id.textView, listName);
        listView.setAdapter(arrayAdapter);


    }
}