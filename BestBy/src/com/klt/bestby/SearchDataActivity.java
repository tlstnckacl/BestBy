package com.klt.bestby;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class SearchDataActivity extends Activity {

	private Spinner cat_spn;
	private EditText search_et;
	private Button search_btn;
	private ListView search_list;
	
	private ArrayList<String> list_al;
	private ArrayList<String> cat_al;
	@Override
	
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search_data);
		
		cat_spn = (Spinner)findViewById(R.id.cat_data_spn);
		search_et = (EditText)findViewById(R.id.search_data_et);
		search_btn = (Button)findViewById(R.id.search_data_btn);
		search_list = (ListView)findViewById(R.id.search_data_list);
		
		// 카테고리 스피너
		cat_al = new ArrayList<String>();
		
		cat_al.add("식품");
		cat_al.add("약품");
		cat_al.add("화장품");
		cat_al.add("기타");
		
		// 유통기한 리스트뷰
		list_al = new ArrayList<String>();
		
		list_al.add("a");
		list_al.add("b");
		list_al.add("c");
		
		ArrayAdapter<String> adpt = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, list_al);
		
		search_list.setAdapter(adpt);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.search_menu, menu);
		
		return super.onCreateOptionsMenu(menu);
		
	}
}
