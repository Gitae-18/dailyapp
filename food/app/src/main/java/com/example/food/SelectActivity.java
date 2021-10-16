package com.example.food;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SelectActivity extends Activity {
	private Button imgBtn1, imgBtn2, imgBtn3, imgBtn4,imgbtn5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_kinds_wc);

		imgBtn1 = (Button) findViewById(R.id.kinds_wc_1); //한식
		imgBtn2 = (Button) findViewById(R.id.kinds_wc_2); //중식
		imgBtn3 = (Button) findViewById(R.id.kinds_wc_3); //일식
		imgBtn4 = (Button) findViewById(R.id.kinds_wc_4); //양식
		imgbtn5 = (Button) findViewById(R.id.kinds_wc_5);//동남아식

		imgBtn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),
						RoundActivity.class);
				intent.putExtra("food", 1);
				intent.putExtra("round", 16);
				startActivity(intent);
				finish();
			}
		});

		imgBtn2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),
						RoundActivity.class);
				intent.putExtra("food", 2);
				intent.putExtra("round", 16);
				startActivity(intent);
				finish();
			}
		});

		imgBtn3.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),
						RoundActivity.class);
				intent.putExtra("food", 3);
				intent.putExtra("round", 16);
				startActivity(intent);
				finish();
			}
		});

		imgBtn4.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),
						RoundActivity.class);
				intent.putExtra("food", 4);
				intent.putExtra("round", 16);
				startActivity(intent);
				finish();
			}
		});

		imgbtn5.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),
						RoundActivity.class);
				intent.putExtra("food", 4);
				intent.putExtra("round", 16);
				startActivity(intent);
				finish();
			}
		});
	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.gender, menu);
//		return true;
//	}
//
//	@Override
//	public boolean onOptionsItemSelected(MenuItem item) {
//		// Handle action bar item clicks here. The action bar will
//		// automatically handle clicks on the Home/Up button, so long
//		// as you specify a parent activity in AndroidManifest.xml.
//		int id = item.getItemId();
//		if (id == R.id.action_settings) {
//			return true;
//		}
//		return super.onOptionsItemSelected(item);
//	}
}
