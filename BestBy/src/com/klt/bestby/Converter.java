package com.klt.bestby;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Log;

public class Converter {
	
	public static float toPX_X(float emulPX, Activity a) {
		float px = emulPX;
		// abcd
		// 기기 화면 해상도
		DisplayMetrics dm = new DisplayMetrics();
		a.getWindowManager().getDefaultDisplay().getMetrics(dm);
		
		int x = dm.widthPixels; // 가로 해상도
		
		float rate = (float)x / 480;
		
		return px * rate;
	}
	
	public static float toPX_Y(float emulPX, Activity a) {
		float px = emulPX;
		
		// 기기 화면 해상도
		DisplayMetrics dm = new DisplayMetrics();
		a.getWindowManager().getDefaultDisplay().getMetrics(dm);
		
		int y = dm.heightPixels; // 세로 해상도
		
		float rate = (float)y / 800;
		
		return px * rate;
	}
}