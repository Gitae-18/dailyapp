package com.example.food;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
public class MainActivity extends AppCompatActivity {
    ImageButton btn_start;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView gif_image1 = (ImageView) findViewById(R.id.gif_image2);
        Glide.with(this).load(R.drawable.gif_image2).into(gif_image1);
        btn_start = findViewById(R.id.start);

        btn_start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Menus.class);
                startActivity(intent);
            }
        });
    }
}
