package com.klt.bestby;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class SearchListActivity extends Activity{

	private Spinner cat_spn;
	private EditText search_et;
	private Button search_btn;
	
	private ListView search_list;
	
	private ArrayList<ExpItem> list;
	private ArrayList<String> cat_al;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_list_search);
	
	cat_spn = (Spinner)findViewById(R.id.cat_spn);
	search_et = (EditText)findViewById(R.id.search_et);
	search_btn = (Button)findViewById(R.id.search_btn);
	search_list = (ListView)findViewById(R.id.main_search_list);
	
	// 카테고리 스피너
	cat_al = new ArrayList<String>();
	
	cat_al.add("식품");
	cat_al.add("약품");
	cat_al.add("화장품");
	cat_al.add("기타");
	
	ArrayAdapter<String> adpt = new ArrayAdapter<String>(
			getApplicationContext(), android.R.layout.simple_spinner_item, cat_al); 

	adpt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	cat_spn.setAdapter(adpt);
	
	// 리스트뷰
	list = new ArrayList<ExpItem>();
	
	list.add(new ExpItem(R.drawable.ic_launcher, "탕근", "2014/08/08"));
	list.add(new ExpItem(R.drawable.ic_launcher, "기침약", "2015/08/08"));
	list.add(new ExpItem(R.drawable.ic_launcher, "키야", "2014/08/08"));
	
	search_list.setAdapter(new MyListAdapter());
	
}

private class MyListAdapter extends BaseAdapter {

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ExpItem_Cell getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
			
			ExpItem_Cell exp = null;
			
			if (convertView == null) {
				exp = new ExpItem_Cell(getApplicationContext());
			} else {
				exp = (ExpItem_Cell) convertView;
			}
			
			exp.setContent(list.get(position));
			
			return exp;
			
		}
		
	}
	
}
