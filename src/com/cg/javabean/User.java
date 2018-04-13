package com.cg.javabean;

import java.sql.Connection;

public class User {
	
	public static int sss = 666;
	
	public int id = 777;
	
	public String name;

	
	private  Connection conn;
	
	
	public User(Connection eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee) {
		this.conn = eeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeee;
	}
	
	public Connection getConn() {
		return conn;
	}



	public void setConn(Connection conn) {
		this.conn = conn;
	}



	public User() {
		super();
	}



	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public static int findApple() {
		
		return sss;
	}
	
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
