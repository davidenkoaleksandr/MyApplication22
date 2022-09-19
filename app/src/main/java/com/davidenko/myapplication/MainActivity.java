package com.davidenko.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Integer x;
TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x = 0;
        text = findViewById(R.id.tv);
    }
    public void click(View view)
    {
        x = x + 1;
        text.setText("Сытость: " + x);

    }
}