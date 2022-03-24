package com.model;

public class Book {
	public char code;
	public String title;
	public int price;
	public String authors;

	public Book() {

	}

	public Book(char code, String title, int price, String authors) {
		this.code=code;
		this.title=title;
		this.price=price;
		this.authors=authors;
		
	}

	public  String displayInfo() {
		String bookk = "code:"+ this.code+ ", Title:"+ this.title+", Price:"+ this.price+" VND"+", authors:"+ this.authors;
		return bookk;
	}
	
	
}