package com.gmall.sys.user;

import java.io.Serializable;

public class UserBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name; //姓名
	private int age; //年龄
	private String address;//地址
	
//	public UserBean(int id,String name,int age,String address) {
//		this.id=id;
//		this.name=name;
//		this.age=age;
//		this.address=address;
//	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	


}
