package com.example.gyro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(View ->menu());


    }
    public void menu(){
        Intent btn = new Intent(this,MainActivity.class);
        startActivity(btn);
    }
}