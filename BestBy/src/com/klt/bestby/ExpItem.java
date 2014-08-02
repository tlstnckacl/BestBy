package com.klt.bestby;

public class ExpItem {
	private int img;
	private String item_name;
	private String exp_date;
	
	public ExpItem(int img, String item_name, String exp_date) {
		super();
		this.img = img;
		this.item_name = item_name;
		this.exp_date = exp_date;
	}

	public int getImg() {
		return img;
	}

	public void setImg(int img) {
		this.img = img;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public String getExp_date() {
		return exp_date;
	}

	public void setExp_date(String exp_date) {
		this.exp_date = exp_date;
	}
	
	
	
}
