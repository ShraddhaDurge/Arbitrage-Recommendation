package com.pojo;

import java.sql.Date;

import org.springframework.stereotype.Component;

public class CustomerShares {
	private int user_id;
	private String stock_symbol;
	private String stock_shortname;
	private double stock_bseprice;
	private double stock_nseprice;
	private double stock_profit;
	private int stock_quantity;
	private Date saved_time;
	
	
	public CustomerShares() {
		
	}
	public CustomerShares(int user_id,String stock_symbol, String stock_shortname, double stock_bseprice, double stock_nseprice,
			double stock_profit, int stock_quantity,Date saved_time)
	{
		super();
		this.user_id=user_id;
		this.stock_symbol = stock_symbol;
		this.stock_shortname = stock_shortname;
		this.stock_bseprice = stock_bseprice;
		this.stock_nseprice = stock_nseprice;
		this.stock_profit = stock_profit;
		this.stock_quantity = stock_quantity;
		this.saved_time=saved_time;

	}
	public CustomerShares( String stock_shortname, double stock_bseprice, double stock_nseprice,
			 int stock_quantity,double stock_profit,Date saved_time)
	{
		super();
		this.stock_shortname = stock_shortname;
		this.stock_bseprice = stock_bseprice;
		this.stock_nseprice = stock_nseprice;
		this.stock_profit = stock_profit;
		this.stock_quantity = stock_quantity;
		this.saved_time=saved_time;

	}
	
	public int getUser_id() {
		 
		return user_id;
	}
	public void setUser_id(int user_id) {
		
		this.user_id = user_id;
	}
	
	
	public String getStock_symbol() {
		return stock_symbol;
	}
	public void setStock_symbol(String stock_symbol) {
		this.stock_symbol = stock_symbol;
	}
	public String getStock_shortname() {
		return stock_shortname;
	}
	public void setStock_shortname(String stock_shortname) {
		this.stock_shortname = stock_shortname;
	}
	public double getStock_bseprice() {
		return stock_bseprice;
	}
	public void setStock_bseprice(double stock_bseprice) {
		this.stock_bseprice = stock_bseprice;
	}
	public double getStock_nseprice() {
		return stock_nseprice;
	}
	public void setStock_nseprice(double stock_nseprice) {
		this.stock_nseprice = stock_nseprice;
	}
	public double getStock_profit() {
		return stock_profit;
	}
	public void setStock_profit(double stock_profit) {
		this.stock_profit = stock_profit;
	}
	public int getStock_quantity() {
		return stock_quantity;
	}
	public void setStock_quantity(int stock_quantity) {
		this.stock_quantity = stock_quantity;
	}
	public Date getSaved_time() {
		return saved_time;
	}
	public void setSaved_time(Date saved_time) {
		this.saved_time = saved_time;
	}
	@Override
	public String toString() {
		return "CustomerShares [user_id=" + user_id + ", stock_symbol=" + stock_symbol + ", stock_shortname="
				+ stock_shortname + ", stock_bseprice=" + stock_bseprice + ", stock_nseprice=" + stock_nseprice
				+ ", stock_profit=" + stock_profit + ", stock_quantity=" + stock_quantity + ", saved_time=" + saved_time
				+ "]";
	}
	
	

}
