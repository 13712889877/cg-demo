package com.cg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {

	public Connection conn = null;
	public Statement stmt = null;
	public ResultSet rs = null;
	String dbDriver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://101.201.235.213:3306:cg";
	String username = "cg";
	String password = "123456";

	public JdbcUtil() {
		try {
			Class.forName(dbDriver);
			conn = (Connection) DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection() {
		return this.conn;
	}

	public ResultSet executeQuery(String sql) {
		try {
			stmt = (Statement) conn.createStatement();
			rs = (ResultSet) stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;

	}

	public int executeUpdate(String sql) {
		int num = 0;
		try {
			stmt = (Statement) conn.createStatement();
			num = stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return num;

	}

	public void closeDB() {
		try {
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

/*
 * public static void main(String[] args) {
 * Class.forName("com.mysql.jdbc.Driver"); Connection conn =
 * DriverManager.getConnection("jdbc:mysql://101.201.235.213:3306:cg", "cg",
 * "123456"); Statement stem = conn.createStatement(); ResultSet rs =
 * stem.executeQuery("sql");
 * 
 * 
 * }
 */
