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

public class Snack extends AppCompatActivity {
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
                int count = random.nextInt(10)+1;
                switch(count){
                    case 1 :
                        imageView.setImageResource(R.drawable.coldbrew);
                        txtResult.setText("콜드브루커파");
                        break;
                    case 2 :
                        imageView.setImageResource(R.drawable.icecoffee);
                        txtResult.setText("아이스커피");
                        break;
                    case 3 :
                        imageView.setImageResource(R.drawable.nitro_vanilla_cream);
                        txtResult.setText("니트로바닐라크림");
                        break;
                    case 4 :
                        imageView.setImageResource(R.drawable.mangofruitblended);
                        txtResult.setText("망고프룻블렌디드");
                    case 5:
                        imageView.setImageResource(R.drawable.mintchocolatechipblended);
                        txtResult.setText("민트초콜렛칩블렌디드");
                    case 6:
                        imageView.setImageResource(R.drawable.blacktealemonade);
                        txtResult.setText("블랙티레몬에이드");
                    case 7:
                        imageView.setImageResource(R.drawable.icealgraytea);
                        txtResult.setText("아이스얼그래이티");
                    case 8:
                        imageView.setImageResource(R.drawable.vanilla_cream_coldbrew);
                        txtResult.setText("바닐라크림콜드브루");
                    case 9:
                        imageView.setImageResource(R.drawable.jabachipprafuchino);
                        txtResult.setText("자바칩프라푸치노");
                    case 10:
                        imageView.setImageResource(R.drawable.icesignaturechocolate);
                        txtResult.setText("아이스시그니처초콜렛");
                }
            }
        });
    }
}
