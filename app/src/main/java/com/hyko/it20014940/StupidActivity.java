package com.hyko.it20014940;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StupidActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stupid);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        System.out.println(name);

        Toast toast = Toast.makeText(StupidActivity.this, "Welcome " + name, Toast.LENGTH_SHORT);
        toast.getView().setBackgroundColor(Color.GREEN);
        toast.setGravity(Gravity.CENTER , 0 ,0);
        toast.show();
    }
}