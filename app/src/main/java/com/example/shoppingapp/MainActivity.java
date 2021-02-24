package com.example.shoppingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this,"clicked!!" + parent.getItemAtPosition(position),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this,DataPass.class);
                intent.putExtra("data",listName[position]);
                startActivity(intent);




            }
        });


    }
}