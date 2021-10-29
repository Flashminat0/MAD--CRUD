package com.hyko.it20014940;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class StupidActivity extends AppCompatActivity {

    RadioButton r1,r2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stupid);

        r1 = findViewById(R.id.radioButton);
        r2 = findViewById(R.id.radioButton2);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        System.out.println(name);

        Toast toast = Toast.makeText(StupidActivity.this, "Welcome " + name, Toast.LENGTH_SHORT);
        toast.getView().setBackgroundColor(Color.GREEN);
        toast.setGravity(Gravity.CENTER , 0 ,0);
        toast.show();

        r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}