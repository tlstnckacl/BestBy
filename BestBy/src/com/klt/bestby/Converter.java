package com.klt.bestby;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Log;

public class Converter {
	
	public static float toPX_X(float emulPX, Activity a) {
		float px = emulPX;
		// abcd
		// ��� ȭ�� �ػ�
		DisplayMetrics dm = new DisplayMetrics();
		a.getWindowManager().getDefaultDisplay().getMetrics(dm);
		
		int x = dm.widthPixels; // ���� �ػ�
		
		float rate = (float)x / 480;
		
		return px * rate;
	}
	
	public static float toPX_Y(float emulPX, Activity a) {
		float px = emulPX;
		
		// ��� ȭ�� �ػ�
		DisplayMetrics dm = new DisplayMetrics();
		a.getWindowManager().getDefaultDisplay().getMetrics(dm);
		
		int y = dm.heightPixels; // ���� �ػ�
		
		float rate = (float)y / 800;
		
		return px * rate;
	}
}