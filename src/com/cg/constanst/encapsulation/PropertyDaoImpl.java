package com.cg.constanst.encapsulation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PropertyDaoImpl implements IPropertylDao {

	private Connection conn;

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public PropertyDaoImpl(Connection conn) {
		super();
		this.conn = conn;
	}

	public void add(Property x) throws SQLException {
		// TODO Auto-generated method stub

		PreparedStatement ps = null;
		String sql = "insert into property(name,age,password) values(?,?,?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, x.getName());
			ps.setInt(2, x.getAge());
			ps.setString(3, x.getPassword());
			int result = ps.executeUpdate();

			System.out.println(result > 0 ? "success" : "failed");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("添加数据失败");
		}
	}

	@Override
	public void updata(Property x) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		String sql = "update property set name=?,age=?,password=? where=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(0, x.getName());
			ps.setInt(1, x.getAge());
			ps.setString(2, x.getPassword());
			ps.setInt(4, x.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("更新数据失败");

		}

	}

	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub

		PreparedStatement ps = null;
		String sql = "delete from property where id=?";
		try {
			ps = conn.prepareStatement(sql);

			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("删除数据失败");
		}

	}

	@Override
	public void findById(int id) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement ps = null;
		java.sql.ResultSet rs = null;
		Property k = null;
		String sql = "select name,age,password from property where id=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(0, id);

			rs = ps.executeQuery();
			if (rs.next()) {

				k = new Property();
				k.setId(id);
				k.setName(rs.getString(0));
				k.setAge(rs.getInt(1));
				k.setPassword(rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("根据id查找数据失败");

		}
	}

	@Override
	public List<Property> find() throws SQLException {
		List<Property> list = new ArrayList<Property>();
		PreparedStatement ps = null;
		java.sql.ResultSet rs = null;
		Property k = null;
		int i = 0;
		String sql = "select * from property ";
		try {
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while (rs.next()) {
				Property property = new Property();
				property.setId(rs.getInt("id"));
				property.setAge(rs.getInt("age"));
				property.setPassword(rs.getString("password"));
				property.setName(rs.getString("name"));
				list.add(property);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("查找list表数据失败");

		}
		return list;

	}

}
