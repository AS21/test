package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class NextActivity extends AppCompatActivity {

    private final String TAG = "------------------------------------";
    ConnectDB ConnectDB = new ConnectDB(this);
    private TextView TextView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        dataTextView = findViewById(R.id.data);

        Intent intent = getIntent();
        String name = Intent.getStringExtra("name");



    }
}

