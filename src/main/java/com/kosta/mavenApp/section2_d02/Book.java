package com.kosta.mavenApp.section2_d02;

//변수선언(field), 생성자(초기화), 외부접근(getter/setter), 전체값문자열로 받기(toString())
public class Book {
	private String title;
	private int price;
	private String kind;
	
	public Book() {
		super();
	}
	public Book(String title, int price, String kind) {
		super();
		this.title = title;
		this.price = price;
		this.kind = kind;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Book [title=").append(title).append(", price=").append(price).append(", kind=").append(kind)
				.append("]");
		return builder.toString();
	}
}
