package com.klt.bestby;

import java.util.ArrayList;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainListActivity extends Activity{

	public EditText search_et;

	private ListView lv;
	
	private ArrayList<ExpItem> list;
	
	FrameLayout content;
	
	// 되라되라
	// ssoogoon : 응답했다 오바
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_list);
		content = (FrameLayout) getWindow().getDecorView().findViewById(android.R.id.tabcontent);
		
		
		lv = (ListView)findViewById(R.id.main_list);
		
		list = new ArrayList<ExpItem>();
		
		list.add(new ExpItem(R.drawable.ic_launcher, "탕근", "2014/08/08"));
		list.add(new ExpItem(R.drawable.ic_launcher, "기침약", "2015/08/08"));
		list.add(new ExpItem(R.drawable.ic_launcher, "키야", "2014/08/08"));
		
		lv.setOnItemLongClickListener(new OnItemLongClickListener() {

			@Override
			public boolean onItemLongClick(AdapterView<?> parent, View view,
					final int position, long id) {
				// TODO Auto-generated method stub
				
				// 롱클릭 아이템 포지션, 이름 토스트
				final String infos[] = {"상세정보", "수정", "삭제"};
				
				AlertDialog.Builder dl_info = new AlertDialog.Builder(MainListActivity.this);
				dl_info.setTitle("정보");
				
				dl_info.setItems(infos, new OnClickListener() {
					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						// TODO Auto-generated method stub
						Toast.makeText(getApplicationContext(), infos[which], Toast.LENGTH_LONG).show();
					}
				});
				
				dl_info.show();
				
				
				return false;
			}
		});
		
		lv.setAdapter(new MyListAdapter());
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
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.main_menu, menu);
		
		
//		menu.add(0, 0, 0, "add").setIcon(android.R.drawable.ic_menu_add);
//		menu.add(0, 1, 1, "delete").setIcon(android.R.drawable.ic_menu_delete);
//		menu.add(0, 2, 2, "search").setIcon(android.R.drawable.ic_menu_search);
//		menu.add(0, 3, 3, "setting").setIcon(android.R.drawable.ic_menu_set_as);
		
		return true;
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
				//content.removeView(mta.al.get(3));
				setContentView(mta.al.get(3));
			break;
			
			case 2:
				Toast.makeText(getApplicationContext(), "검색", Toast.LENGTH_LONG).show();
				//content.removeView(mta.al.get(4));
				setContentView(mta.al.get(4));
			break;
			
			case 3:
				Toast.makeText(getApplicationContext(), item.getOrder()+"", Toast.LENGTH_LONG).show();
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	private void check_second_view() {
		
	}
}
