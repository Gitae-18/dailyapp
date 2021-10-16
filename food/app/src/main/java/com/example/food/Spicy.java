package com.example.food;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class Spicy extends AppCompatActivity {
    ImageButton btn_click;
    Random random = new Random();
    ImageView imageView;
    TextView txtResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);

        imageView = findViewById(R.id.imageView);
        btn_click = (ImageButton) findViewById(R.id.click);
        txtResult = findViewById(R.id.food_name);
        btn_click.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                int count = random.nextInt(16) + 1;
                switch (count) {
                    case 1:
                        imageView.setImageResource(R.drawable.b1);
                        txtResult.setText("바닐라");
                        break;
                    case 2:
                        imageView.setImageResource(R.drawable.b2);
                        txtResult.setText("엄마는 외계인");
                        break;
                    case 3:
                        imageView.setImageResource(R.drawable.b3);
                        txtResult.setText("아몬드 봉봉");
                        break;
                    case 4:
                        imageView.setImageResource(R.drawable.b4);
                        txtResult.setText("민트 초콜릿 칩");
                        break;
                    case 5:
                        imageView.setImageResource(R.drawable.b5);
                        txtResult.setText("뉴욕 치즈케이크");
                        break;
                    case 6:
                        imageView.setImageResource(R.drawable.b6);
                        txtResult.setText("슈팅스타");
                        break;
                    case 7:
                        imageView.setImageResource(R.drawable.b7);
                        txtResult.setText("체리쥬빌레");
                        break;
                    case 8:
                        imageView.setImageResource(R.drawable.b8);
                        txtResult.setText("레인보우 샤베트");
                        break;
                    case 9:
                        imageView.setImageResource(R.drawable.b9);
                        txtResult.setText("베리베리 스트로베리");
                        break;
                    case 10:
                        imageView.setImageResource(R.drawable.b10);
                        txtResult.setText("바람과 함께 사라지다");
                        break;
                    case 11:
                        imageView.setImageResource(R.drawable.b11);
                        txtResult.setText("피스타치오 아몬드");
                        break;
                    case 12:
                        imageView.setImageResource(R.drawable.b12);
                        txtResult.setText("초콜릿 무스");
                        break;
                    case 13:
                        imageView.setImageResource(R.drawable.b13);
                        txtResult.setText("이상한 나라의 솜사탕");
                        break;
                    case 14:
                        imageView.setImageResource(R.drawable.b14);
                        txtResult.setText("31요거트");
                        break;
                    case 15:
                        imageView.setImageResource(R.drawable.b15);
                        txtResult.setText("그린티");
                        break;
                    case 16:
                        imageView.setImageResource(R.drawable.b16);
                        txtResult.setText("오레오 쿠키 앤 크림");
                        break;
                }
            }
        });
    }
}