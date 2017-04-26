package com.example.domain;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private int number;
	
	private String status;
	
	private List<Item> items = new ArrayList<>();

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	

}
