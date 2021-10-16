package com.example.food;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;
import android.widget.ImageButton;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import androidx.annotation.Nullable;

import com.example.food.R;

public class GameManager extends Activity {
	private static GameManager instance;

	public static GameManager getInstance() {
		if (instance == null) {
			instance = new GameManager();
		}
		return instance;
	}

	private GameManager() {

	}

	public int nowRound;

	public ArrayList<Player> fdwc = new ArrayList<Player>();

	public void addFood(String name, int img, int id) {
		Player tmpFood = new Player();
		tmpFood.setName(name);
		tmpFood.setFoodIndex(id);
		tmpFood.setImg(img);
		fdwc.add(tmpFood);
	}

	public void initKgame() { // 한식
		fdwc.clear();

		nowRound = 0;
		addFood("보쌈", R.drawable.h1, 0);
		addFood("닭갈비", R.drawable.h2, 1);
		addFood("삼겹살", R.drawable.h3, 2);
		addFood("떡볶이", R.drawable.h4, 3);
		addFood("소고기", R.drawable.h5, 4);
		addFood("삼합", R.drawable.h6, 5);
		addFood("떡국", R.drawable.h7, 6);
		addFood("부대찌개", R.drawable.h8, 7);
		addFood("제육볶음", R.drawable.h9, 0);
		addFood("떡갈비", R.drawable.h10, 1);
		addFood("된장찌개", R.drawable.h11, 2);
		addFood("김치찌개", R.drawable.h12, 3);
		addFood("백숙", R.drawable.h13, 4);
		addFood("김밥", R.drawable.h14, 5);
		addFood("회", R.drawable.h15, 6);
		addFood("비빔밥", R.drawable.h16, 7);

	}

//	public void inittmp() {
//		fdwc.clear();
//
//		nowRound = 0;
//		addFood("1", R.drawable.number1, 0);
//		addFood("2", R.drawable.number2, 1);
//		addFood("3", R.drawable.number3, 2);
//		addFood("4", R.drawable.number4, 3);
//		addFood("5", R.drawable.number5, 4);
//		addFood("6", R.drawable.number6, 5);
//		addFood("7", R.drawable.number7, 6);
//		addFood("8", R.drawable.number8, 7);
//		addFood("9", R.drawable.number9, 0);
//		addFood("10", R.drawable.number10, 1);
//		addFood("11", R.drawable.number11, 2);
//		addFood("12", R.drawable.number12, 3);
//		addFood("13", R.drawable.number13, 4);
//		addFood("14", R.drawable.number14, 5);
//		addFood("15", R.drawable.number15, 6);
//		addFood("16", R.drawable.number1, 7);
//
//	}


	public void initCgame() { // 중식
		fdwc.clear();

		nowRound = 0;
		addFood("짜장면", R.drawable.jf1, 0);
		addFood("짬뽕", R.drawable.jf2, 1);
		addFood("마라탕", R.drawable.jf3, 2);
		addFood("꿔바로우", R.drawable.jf4, 3);
		addFood("유린기", R.drawable.jf5, 4);
		addFood("깐쇼새우", R.drawable.jf6, 5);
		addFood("울면", R.drawable.jf7, 6);
		addFood("새우볶음밥", R.drawable.jf8, 7);
		addFood("팔보채", R.drawable.jf9, 0);
		addFood("탕수육", R.drawable.jf10, 1);
		addFood("짜장밥", R.drawable.jf11, 2);
		addFood("짬뽕밥", R.drawable.jf12, 3);
		addFood("고추잡채", R.drawable.jf13, 4);
		addFood("유산슬", R.drawable.jf14, 5);
		addFood("난자완스", R.drawable.jf15, 6);
		addFood("양장피", R.drawable.jf16, 7);

	}

	public void initJgame() { // 일식
		fdwc.clear();

		nowRound = 0;
		addFood("덴푸라", R.drawable.i1, 0);
		addFood("소바", R.drawable.i2, 1);
		addFood("우동", R.drawable.i3, 2);
		addFood("라멘", R.drawable.i4, 3);
		addFood("오코노미야끼", R.drawable.i5, 4);
		addFood("초밥", R.drawable.i6, 5);
		addFood("야키니쿠", R.drawable.i7, 6);
		addFood("야키토리", R.drawable.i8, 7);
		addFood("야끼소바", R.drawable.i9, 0);
		addFood("스키야키", R.drawable.i10, 1);
		addFood("카레", R.drawable.i11, 2);
		addFood("가라아게", R.drawable.i12, 3);
		addFood("로바다야키", R.drawable.i13, 4);
		addFood("규동", R.drawable.i14, 5);
		addFood("오니기리", R.drawable.i15, 6);
		addFood("타코야끼", R.drawable.i16, 7);

	}

	public void initWgame() { // 양식
		fdwc.clear();

		nowRound = 0;
		addFood("파스타", R.drawable.w1, 0);
		addFood("피자", R.drawable.w2, 1);
		addFood("스테이크", R.drawable.w3, 2);
		addFood("리조또", R.drawable.w4, 3);
		addFood("에그인헬", R.drawable.w5, 4);
		addFood("뇨끼", R.drawable.w6, 5);
		addFood("라자냐", R.drawable.w7, 6);
		addFood("스튜", R.drawable.w8, 7);
		addFood("연어스테이크", R.drawable.w9, 0);
		addFood("감바스", R.drawable.w10, 1);
		addFood("아란치니", R.drawable.w11, 2);
		addFood("파피요트", R.drawable.w12, 3);
		addFood("치즈그라탕", R.drawable.w13, 4);
		addFood("잠발라야", R.drawable.w14, 5);
		addFood("오므라이스", R.drawable.w15, 6);
		addFood("라따뚜이", R.drawable.w16, 7);

	}
	public void initDgame() { // 동남아
		fdwc.clear();

		nowRound = 0;
		addFood("똠양꿍", R.drawable.d1, 0);
		addFood("쏨땀", R.drawable.d2, 1);
		addFood("칠리크랩", R.drawable.d3, 2);
		addFood("샤오롱바오", R.drawable.d4, 3);
		addFood("나시고렝", R.drawable.d5, 4);
		addFood("할로할로", R.drawable.d6, 5);
		addFood("록락", R.drawable.d7, 6);
		addFood("반세오", R.drawable.d8, 7);
		addFood("쌀국수", R.drawable.d9, 0);
		addFood("미꽝", R.drawable.d10, 1);
		addFood("탄두리치킨", R.drawable.d11, 2);
		addFood("사테", R.drawable.d12, 3);
		addFood("아목", R.drawable.d13, 4);
		addFood("팟타이", R.drawable.d14, 5);
		addFood("시니강", R.drawable.d15, 6);
		addFood("락사", R.drawable.d16, 7);

	}

	public void randomList() {
		ArrayList mainRandomList = new ArrayList();
		Random ra = new Random();
		int mainSize = fdwc.size(); // 사이즈 따로 구해서
		for (int i = 0; i < mainSize; i++) {
			int rv = ra.nextInt(fdwc.size());
			mainRandomList.add(fdwc.get(rv));
			fdwc.remove(rv);
		}
		fdwc = mainRandomList;
	}


/*	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wc);

		TextView textView = (TextView) findViewById(R.id.foodname);
		TextView textView1 = (TextView) findViewById(R.id.foodname2);
		String name = getIntent().getStringExtra("name");
		textView.setText(name);
		textView1.setText(name);


	}
 */
}

