package com.cg.constanst.encapsulation;

public class Property {
	private int age;
	private String name;
	private String password;
	private int id ;

	

	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public static void main(String[] args) {
		Property test = new Property();
		test.setAge(451);
		test.setName("³Â¸Õ");
		test.setId(487);;
		System.out.println(test.getName()+"½ñÄê" + test.getAge());
	
	}
}
