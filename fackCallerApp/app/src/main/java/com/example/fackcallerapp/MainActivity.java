package com.example.fackcallerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        view=findViewById(R.id.textView);
        if(getIntent().getData() != null)
        {
            view.setText(getIntent().getData().toString());
        }
        else {
            
        }
    }
}