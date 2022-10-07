package com.ty.springxml2;

public class Mobile {
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void message() {
		System.out.println("Hi....How are you??");
	}

	public void call() {
		System.out.println("call");
	}

	public Mobile(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
}
