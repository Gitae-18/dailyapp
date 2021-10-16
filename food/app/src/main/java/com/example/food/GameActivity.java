package com.example.food;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

import com.example.food.GameManager;
import com.plattysoft.leonids.ParticleSystem;
import com.plattysoft.leonids.modifiers.ScaleModifier;

public class GameActivity extends Activity {
	ImageButton foodImg1;
	ImageButton foodImg2;
	final static int imageNumber[] = { R.id.emiter_star_one,
			R.id.emiter_star_two, R.id.emiter_star_three,
			R.id.emiter_star_four, R.id.emiter_star_five, R.id.emiter_star_six,
			R.id.emiter_star_seven, R.id.emiter_star_eight,
			R.id.emiter_star_nine };

	final static int starNumber[] = { R.drawable.star1, R.drawable.star2,
			R.drawable.star3, R.drawable.star4, R.drawable.star5,
			R.drawable.star6, R.drawable.star7, R.drawable.star8,
			R.drawable.star9 };
	int gameCount; // 0~6
	int nowPlay;
	int nowPlay2;
//	int nowPlay3;
//	int nowPlay4;

	int food;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wc);
		foodImg1 = (ImageButton) findViewById(R.id.imageButton_foodimg1);
		foodImg2 = (ImageButton) findViewById(R.id.imageButton_foodimg2);
		food = getIntent().getIntExtra("food", 0);
		if (food == 1) {
			GameManager.getInstance().initKgame();
			// GameManager.getInstance().inittmp();
			GameManager.getInstance().randomList();

		} else if (food == 2) {
			GameManager.getInstance().initCgame();
			GameManager.getInstance().randomList();
		} else if (food == 3) {
			GameManager.getInstance().initJgame();
			GameManager.getInstance().randomList();
		} else if (food == 4) {
			GameManager.getInstance().initWgame();
			GameManager.getInstance().randomList();
		}else if (food == 5) {
			GameManager.getInstance().initWgame();
			GameManager.getInstance().randomList();
		}

		gameCount = 0;
		nowPlay = gameCount;
		nowPlay2 = gameCount + 1;
//		nowPlay3 = gameCount + 2;
//		nowPlay4 = gameCount + 3;

		foodImg1.setImageResource(GameManager.getInstance().fdwc.get(
				nowPlay).getImg());

		foodImg2.setImageResource(GameManager.getInstance().fdwc.get(
				nowPlay2).getImg());


		foodImg1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				for (int i = 0; i < 9; i++) {
					new ParticleSystem(GameActivity.this, 2, starNumber[i],
							1000)
							.setSpeedByComponentsRange(-0.2f, 0.2f, -0.2f,
									0.04f).setAcceleration(0.000009f, 90)
							.setInitialRotationRange(0, 360)
							.setRotationSpeed(120).setFadeOut(150)
							.addModifier(new ScaleModifier(0f, 1.5f, 0, 500))
							.oneShot(v, 20);
				}

				new Handler().postDelayed(new Runnable() {

					@Override
					public void run() {

						// TODO Auto-generated method stub
						if (gameCount == 7) {

							Intent roundIntent = new Intent(GameActivity.this,
									RoundActivity.class);
							roundIntent.putExtra("food", food);
							roundIntent.putExtra("round", 8);
							startActivity(roundIntent);
							overridePendingTransition(0, 0);

							new Handler().postDelayed(new Runnable() {

								@Override
								public void run() {
									// TODO Auto-generated method stub

									GameManager.getInstance().fdwc
											.remove(nowPlay2);
									// GameManager.getInstance().randomList();
									nowPlay = 0;
									nowPlay2 = 1;
									foodImg1.setImageResource(GameManager
											.getInstance().fdwc.get(
											nowPlay).getImg());
									foodImg2.setImageResource(GameManager
											.getInstance().fdwc.get(
											nowPlay2).getImg());

								}
							}, 1500);

						} else if (gameCount == 11) {

							Intent roundIntent = new Intent(GameActivity.this,
									RoundActivity.class);
							roundIntent.putExtra("food", food);
							roundIntent.putExtra("round", 4);
							startActivity(roundIntent);
							overridePendingTransition(0, 0);

							new Handler().postDelayed(new Runnable() {

								@Override
								public void run() {
									// TODO Auto-generated method stub

									// GameManager.getInstance().randomList();

									GameManager.getInstance().fdwc
											.remove(nowPlay2);
									// GameManager.getInstance().randomList();
									nowPlay = 0;
									nowPlay2 = 1;
									foodImg1.setImageResource(GameManager
											.getInstance().fdwc.get(
											nowPlay).getImg());
									foodImg2.setImageResource(GameManager
											.getInstance().fdwc.get(
											nowPlay2).getImg());
								}
							}, 1500);

						} else if (gameCount == 13) {
							Intent roundIntent = new Intent(GameActivity.this,
									RoundActivity.class);
							roundIntent.putExtra("food", food);
							roundIntent.putExtra("round", 2);
							startActivity(roundIntent);
							overridePendingTransition(0, 0);

							new Handler().postDelayed(new Runnable() {

								@Override
								public void run() {
									// TODO Auto-generated method stub

									// GameManager.getInstance().randomList();

									GameManager.getInstance().fdwc
											.remove(nowPlay2);
									// GameManager.getInstance().randomList();
									nowPlay = 0;
									nowPlay2 = 1;
									foodImg1.setImageResource(GameManager
											.getInstance().fdwc.get(
											nowPlay).getImg());
									foodImg2.setImageResource(GameManager
											.getInstance().fdwc.get(
											nowPlay2).getImg());

								}
							}, 1500);

						} else if (gameCount == 14) {

							GameManager.getInstance().fdwc
									.remove(nowPlay2);

							// userImg2.setVisibility(View.GONE);
							Intent roundIntent = new Intent(GameActivity.this,
									FinishActivity.class);
							roundIntent.putExtra("name", GameManager
									.getInstance().fdwc.get(0).getName());
							roundIntent.putExtra("img", GameManager
									.getInstance().fdwc.get(0).getImg());
							startActivity(roundIntent);
							finish();
							overridePendingTransition(0, 0);
						} else {

							GameManager.getInstance().fdwc
									.remove(nowPlay2);
							nowPlay++;
							nowPlay2++;

							Log.e("testing", GameManager.getInstance().fdwc
									.get(nowPlay).getName() + " ");

							Log.e("testing", GameManager.getInstance().fdwc
									.get(nowPlay2).getName() + " ");
							foodImg1.setImageResource(GameManager.getInstance().fdwc
									.get(nowPlay).getImg());
							foodImg2.setImageResource(GameManager.getInstance().fdwc
									.get(nowPlay2).getImg());

						}

						gameCount++;

					}
				}, 1000);

			}

		});

		foodImg2.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				for (int i = 0; i < 9; i++) {
					new ParticleSystem(GameActivity.this, 2, starNumber[i],
							1000)
							.setSpeedByComponentsRange(-0.2f, 0.2f, -0.2f,
									0.04f).setAcceleration(0.000009f, 90)
							.setInitialRotationRange(0, 360)
							.setRotationSpeed(120).setFadeOut(150)
							.addModifier(new ScaleModifier(0f, 1.5f, 0, 500))
							.oneShot(v, 20);
				}

				new Handler().postDelayed(new Runnable() {

					@Override
					public void run() {

						// TODO Auto-generated method stub
						if (gameCount == 7) {
							Intent roundIntent = new Intent(GameActivity.this,
									RoundActivity.class);
							roundIntent.putExtra("food", food);
							roundIntent.putExtra("round", 8);
							startActivity(roundIntent);
							overridePendingTransition(0, 0);

							new Handler().postDelayed(new Runnable() {

								@Override
								public void run() {
									// TODO Auto-generated method stub

									GameManager.getInstance().fdwc
											.remove(nowPlay);

									// GameManager.getInstance().randomList();
									nowPlay = 0;
									nowPlay2 = 1;
									foodImg1.setImageResource(GameManager
											.getInstance().fdwc.get(
											nowPlay).getImg());
									foodImg2.setImageResource(GameManager
											.getInstance().fdwc.get(
											nowPlay2).getImg());
									// GameManager.getInstance().randomList();

								}
							}, 1500);

						} else if (gameCount == 11) {
							Intent roundIntent = new Intent(GameActivity.this,
									RoundActivity.class);
							roundIntent.putExtra("food", food);
							roundIntent.putExtra("round", 4);
							startActivity(roundIntent);
							overridePendingTransition(0, 0);

							new Handler().postDelayed(new Runnable() {

								@Override
								public void run() {
									// TODO Auto-generated method stub

									GameManager.getInstance().fdwc
											.remove(nowPlay);

									// GameManager.getInstance().randomList();
									nowPlay = 0;
									nowPlay2 = 1;
									foodImg1.setImageResource(GameManager
											.getInstance().fdwc.get(
											nowPlay).getImg());
									foodImg2.setImageResource(GameManager
											.getInstance().fdwc.get(
											nowPlay2).getImg());
									// GameManager.getInstance().randomList();

								}
							}, 1500);

						} else if (gameCount == 13) {
							Intent roundIntent = new Intent(GameActivity.this,
									RoundActivity.class);
							roundIntent.putExtra("food", food);
							roundIntent.putExtra("round", 2);
							startActivity(roundIntent);
							overridePendingTransition(0, 0);

							new Handler().postDelayed(new Runnable() {

								@Override
								public void run() {
									// TODO Auto-generated method stub

									GameManager.getInstance().fdwc
											.remove(nowPlay);

									// GameManager.getInstance().randomList();
									nowPlay = 0;
									nowPlay2 = 1;
									foodImg1.setImageResource(GameManager
											.getInstance().fdwc.get(
											nowPlay).getImg());
									foodImg2.setImageResource(GameManager
											.getInstance().fdwc.get(
											nowPlay2).getImg());
									// GameManager.getInstance().randomList();

								}
							}, 1500);
						} else if (gameCount == 14) {

							GameManager.getInstance().fdwc.remove(nowPlay);
							// userImg1.setVisibility(View.GONE);
							Intent roundIntent = new Intent(GameActivity.this,
									FinishActivity.class);
							roundIntent.putExtra("name", GameManager
									.getInstance().fdwc.get(0).getName());
							roundIntent.putExtra("img", GameManager
									.getInstance().fdwc.get(0).getImg());
							startActivity(roundIntent);
							finish();
							overridePendingTransition(0, 0);
						}

						else {
							GameManager.getInstance().fdwc.remove(nowPlay);
							nowPlay++;
							nowPlay2++;
							foodImg1.setImageResource(GameManager.getInstance().fdwc
									.get(nowPlay).getImg());
							foodImg2.setImageResource(GameManager.getInstance().fdwc
									.get(nowPlay2).getImg());

						}
						gameCount++;

					}
				}, 1000);

			}
		});

	}

//	@Override
//	public boolean onCreateOptionsMenu(Menu menu) {
//		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.male, menu);
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
