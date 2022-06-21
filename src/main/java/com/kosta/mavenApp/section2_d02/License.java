package com.kosta.mavenApp.section2_d02;

public class License {
	private String title;
	private int year;
	
	public License() {
		super();
	}
	public License(String title, int year) {
		super();
		this.title = title;
		this.year = year;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("License [title=").append(title).append(", year=").append(year).append("]");
		return builder.toString();
	}
}
