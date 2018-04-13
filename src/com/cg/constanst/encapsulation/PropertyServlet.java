package com.cg.constanst.encapsulation;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.cg.jdbc.JdbcUtil;

public class PropertyServlet {

	
	public void list() throws SQLException {

		JdbcUtil j = new JdbcUtil();
		Connection conn = j.getConnection();
		IPropertylDao propertyDb = new PropertyDaoImpl(conn);
		List<Property> findList =propertyDb.find();
	
	}
	
}
