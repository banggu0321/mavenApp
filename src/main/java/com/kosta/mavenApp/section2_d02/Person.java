package com.kosta.mavenApp.section2_d02;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.stereotype.Component;

public class Person {
	private String name;
	private String phone;
	private Car car;
	
	private List<String> major;
	private List<License> 자격증들;
	private Map<String, Book> bookMap;
	private Set<String> friends;
	private Properties myProfile;
	
	public Person() {
		System.out.println("default생성자를 이용해서 Person를 만듬");
	}
	public Person(String name, String phone, Car car) {
		super();
		this.name = name;
		this.phone = phone;
		this.car = car;
		System.out.println("argument 3개있는 생성자 Person로 생성");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		System.out.println("setName : " + name);
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
		System.out.println("setPhone : " + phone);
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
		System.out.println("setCar : " + car);
	}
	public List<String> getMajor() {
		return major;
	}
	public void setMajor(List<String> major) {
		this.major = major;
	}
	public List<License> get자격증들() {
		return 자격증들;
	}
	public void set자격증들(List<License> 자격증들) {
		this.자격증들 = 자격증들;
	}
	public Map<String, Book> getBookMap() {
		return bookMap;
	}
	public void setBookMap(Map<String, Book> bookMap) {
		this.bookMap = bookMap;
	}
	public Set<String> getFriends() {
		return friends;
	}
	public void setFriends(Set<String> friends) {
		this.friends = friends;
	}
	public Properties getMyProfile() {
		return myProfile;
	}
	public void setMyProfile(Properties myProfile) {
		this.myProfile = myProfile;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [name=").append(name).append(", phone=").append(phone).append(", car=").append(car)
				.append(", major=").append(major).append(", 자격증들=").append(자격증들).append(", bookMap=").append(bookMap)
				.append(", friends=").append(friends).append(", myProfile=").append(myProfile).append("]");
		return builder.toString();
	}
	

	
}
