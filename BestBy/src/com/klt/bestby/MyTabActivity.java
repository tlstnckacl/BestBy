package com.klt.bestby;

import java.util.ArrayList;

import android.app.ActivityGroup;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;

public class MyTabActivity extends ActivityGroup{

	private TabHost th;
	private LocalActivityManager lam;
	ArrayList<View> al;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tab);
		
		th = (TabHost)findViewById(R.id.tabhost);
		lam = getLocalActivityManager();
		al = new ArrayList<View>();
		
		// 메인 리스트
		Intent i1 = new Intent(getApplicationContext(), MainListActivity.class);
		Window w1 = lam.startActivity("a1", i1);
		View v1 = w1.getDecorView();
		al.add(v1);
		
		// 검색
		Intent i2 = new Intent(getApplicationContext(), SearchActivity.class);
		Window w2 = lam.startActivity("a2", i2);
		View v2 = w2.getDecorView();
		al.add(v2);
				
		// 게시판
		Intent i3 = new Intent(getApplicationContext(), BoardTestAcivity.class);
		Window w3 = lam.startActivity("a3", i3);
		View v3 = w3.getDecorView();
		al.add(v3);
		
		// 삭제 리스트
		Intent i5 = new Intent(getApplicationContext(), BoardTestAcivity.class);
		Window w5 = lam.startActivity("a5", i5);
		View v5 = w5.getDecorView();
		al.add(v5);

		// 검색 리스트
		Intent i6 = new Intent(getApplicationContext(), SearchListActivity.class);
		Window w6 = lam.startActivity("a6", i6);
		View v6 = w6.getDecorView();
		al.add(v6);
		
		// 유통기한 검색
		Intent i7 = new Intent(getApplicationContext(), SearchDataActivity.class);
		Window w7 = lam.startActivity("a7", i7);
		View v7 = w7.getDecorView();
		al.add(v7);
		
		th.setup(lam);
		
		TabSpec ts = th.newTabSpec("aa");
		ts.setIndicator("리스트");
		ts.setContent(i1);
		th.addTab(ts);
		
		TabSpec ts2 = th.newTabSpec("aa");
		ts2.setIndicator("검색");
		ts2.setContent(i2);
		th.addTab(ts2);
		
		TabSpec ts3 = th.newTabSpec("aa");
		ts3.setIndicator("게시판");
		ts3.setContent(i3);
		th.addTab(ts3);
		
	}
	
	
}
