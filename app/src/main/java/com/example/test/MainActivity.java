package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static final String TAG = "My Logs:";
    private EditText name;
    private EditText password;
    private CalendarView cl;
    private Button subject;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        subject = findViewById(R.id.button);
//        subject.setOnClicklistener(this);
    }

    @Override
    public void onClick (View v) {
        if (v.equals(subject)) {
            Intent intent = new Intent(this, LoginActivity.class);
            intent.putExtra("message", "Hello mon amie");
            startActivity(intent);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "aplication on start");
    }
}