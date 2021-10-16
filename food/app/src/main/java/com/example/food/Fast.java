package com.example.food;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Fast extends AppCompatActivity {
    Button btn_click;
    Random random = new Random();
    ImageView imageView;
    TextView txtResult;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);

        imageView = findViewById(R.id.imageView);
        btn_click = (Button) findViewById(R.id.click);
        txtResult = findViewById(R.id.food_name);
        btn_click.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int count = random.nextInt(10)+1;
                switch(count){
                    case 1 :
                        imageView.setImageResource(R.drawable.s1);
                        txtResult.setText("꼬깔콘");
                        break;
                    case 2 :
                        imageView.setImageResource(R.drawable.s2);
                        txtResult.setText("홈런볼");
                        break;
                    case 3 :
                        imageView.setImageResource(R.drawable.s3);
                        txtResult.setText("새우깡");
                        break;
                    case 4 :
                        imageView.setImageResource(R.drawable.s4);
                        txtResult.setText("포카칩");
                        break;
                    case 5 :
                        imageView.setImageResource(R.drawable.s5);
                        txtResult.setText("프링글스");
                        break;
                    case 6 :
                        imageView.setImageResource(R.drawable.s6);
                        txtResult.setText("맛동산");
                        break;
                    case 7 :
                        imageView.setImageResource(R.drawable.s7);
                        txtResult.setText("오징어땅콩");
                        break;
                    case 8 :
                        imageView.setImageResource(R.drawable.s8);
                        txtResult.setText("카스타드");
                        break;
                    case 9 :
                        imageView.setImageResource(R.drawable.s9);
                        txtResult.setText("에이스");
                        break;
                    case 10 :
                        imageView.setImageResource(R.drawable.s10);
                        txtResult.setText("허니버터칩");
                        break;
                }
            }
        });
    }
}

