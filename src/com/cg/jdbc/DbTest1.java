package com.cg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cg.javabean.User;
import com.mysql.jdbc.PreparedStatement;

public class DbTest1 {

	static String dbDriver = "com.mysql.jdbc.Driver";
	static String url = "jdbc:mysql://101.201.235.213:3306/cg";
	static String userName = "cg";
	static String password = "123456";

	/**
	 * @param args
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	/*
	 * public static void main(String[] args) throws SQLException,ClassNotFoundException { 
	 * DbTest1 db = new DbTest1(); 
	 * String sql="insert into "; 
	 * String result = db.insert(sql);
	 * 
	 * List<User> uList = db.find(sql);
	 * 
	 * List<User> userList = db.change(uList);
	 * 
	 * System.out.println(result);
	 * 
	 * } public List<User> change( List<User> list){ 
	 * return null;
	 * }
	 * 
	 * 
	 * 
	 * public String insert(String sql) {
	 *  Connection conn = null; 
	 *  Statement stmt =null; 
	 *  String result = ""; 
	 *  try { 
	 *  conn =DriverManager.getConnection(url,userName, password);
	 *  stmt =conn.createStatement(); 
	 *  int rs =stmt.executeUpdate(sql); 
	 *  if (rs == 0) {
	 * result = "插入失败"; }
	 *  else { 
	 *  result ="插入成功";
	 *   } } 
	 *   catch (Exception e) {
	 * 
	 * } 
	 * finally { 
	 * if (stmt != null) { 
	 * try { 
	 * stmt.close(); }
	 *  catch (SQLException e)
	 * { // TODO Auto-generated catch block e.printStackTrace(); } } 
	 * if (conn !=null) { 
	 * try { 
	 * conn.close(); } 
	 * catch (SQLException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } } } 
	 * return result;
	 * 
	 * }
	 * 
	 * public String[] changeUpToLow(String[] users) {
	 * 
	 * String[] newUsers = new String[users.length];
	 *  for(int i=0;i<users.length;i++) { 
	 *  newUsers[i] = users[i].toLowerCase(); }
	 *   return newUsers;
	 * 
	 * }
	 * 
	 * public List<User> find(String sql) throws SQLException,ClassNotFoundException { 
	 * List<User> userList = new ArrayList<User>();
	 * Class.forName(dbDriver); 
	 * Connection conn = DriverManager.getConnection(url,userName, password); 
	 * Statement stmt = conn.createStatement(); 
	 * ResultSet rs1 =stmt.executeQuery(sql);
	 * 
	 * while (rs1.next()) { 
	 * userList.add(new User(rs1.getInt("id"),rs1.getString("name"))); }
	 * 
	 * if (stmt != null) { 
	 * stmt.close(); } 
	 * if (conn != null) { 
	 * conn.close(); }
	 * 
	 * return userList;
	 * 
	 * }
	 */
	/*
	 * public static void main(String[] args) throws ClassNotFoundException,SQLException { 
	 * Class.forName(dbDriver); 
	 * Connection conn =DriverManager.getConnection(url, userName, password); 
	 * Statement stmt =conn.createStatement(); 
	 * ResultSet rs =stmt.executeQuery("select * from user");
	 * 
	 * if (stmt != null) {
	 *  stmt.close(); 
	 *  if (conn != null) { 
	 *  conn.close(); } }
	 * 
	 * }
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		Connection conn= DriverManager.getConnection("jdbc:mysql://101.201.235.213:3306/cg","cg",  "123456");
		Statement stmt = conn.prepareStatement("sql");
		ResultSet rs = stmt.executeQuery("select * from user");
		
		for(;rs.next();) {
			
			System.out.println(rs.getInt("id")+rs.getString("name"));
		}
		
	}

	public void query(String sql) throws ClassNotFoundException, SQLException {
		String result = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(result, userName, result);
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		
		//return result;

	}
	
	public void sadfew(PreparedStatement stmt) throws SQLException {
		
		stmt.enableStreamingResults();
		
	}

}
