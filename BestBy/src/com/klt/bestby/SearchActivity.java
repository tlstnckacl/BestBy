package com.klt.bestby;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class SearchActivity extends Activity {

	private ListView search_list;
	private ArrayList<String> items;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		
		// abcdbacd
		search_list = (ListView)findViewById(R.id.search_list);
		items = new ArrayList<String>();
		
		items.add("a");
		items.add("b");
		items.add("c");
		
		ArrayAdapter<String> adpt = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
		
		search_list.setAdapter(adpt);
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.search_menu, menu);
		
		return super.onCreateOptionsMenu(menu);
		
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		
		Intent intent = new Intent();
		MyTabActivity mta = (MyTabActivity) getParent();
		
		switch (item.getOrder()) {
			case 0:
				Toast.makeText(getApplicationContext(), item.getOrder()+"", Toast.LENGTH_LONG).show();
			break;
			
			case 1:
				Toast.makeText(getApplicationContext(), item.getOrder()+"", Toast.LENGTH_LONG).show();
			break;
			
			case 2:
				Toast.makeText(getApplicationContext(), "°Ë»ö", Toast.LENGTH_LONG).show();
				setContentView(mta.al.get(5));

			break;
			
		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
	}
}
