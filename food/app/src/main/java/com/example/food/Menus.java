package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Menus extends AppCompatActivity {
    Button btn_kinds;
    Button btn_sit;
    Button btn_wc;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menus);


        btn_kinds = (Button) findViewById(R.id.choose1);
        btn_sit = (Button) findViewById(R.id.choose2);
        btn_wc = (Button) findViewById(R.id.choose3);

        btn_kinds.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menus.this, Kinds.class);
                startActivity(intent);
            }
        });

        btn_sit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menus.this, Situation.class);
                startActivity(intent);
            }
        });

        btn_wc.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Menus.this, SelectActivity.class);
                startActivity(intent);
            }
        });
    }
}
