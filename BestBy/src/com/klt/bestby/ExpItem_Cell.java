package com.klt.bestby;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ExpItem_Cell extends LinearLayout {

	private ImageView img;
	private TextView item_tv;
	private TextView date_tv;
	
	public void setContent(ExpItem exp) {
		img.setImageResource(exp.getImg());
		item_tv.setText(exp.getItem_name());
		date_tv.setText(exp.getExp_date());
	}
	
	public ExpItem_Cell(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		
		LayoutInflater li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		li.inflate(R.layout.list_add_cell, this, true);
		
		img = (ImageView)findViewById(R.id.img_iv);
		item_tv = (TextView)findViewById(R.id.item_tv);
		date_tv = (TextView)findViewById(R.id.date_tv);
		
	}

}
