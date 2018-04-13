package com.cg.constanst.encapsulation;

import com.cg.javabean.User;
import com.cg.jdbc.JdbcUtil;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class PropertyMain {

	public static void main(String[] args) throws SQLException {

		JdbcUtil j = new JdbcUtil();
		Connection conn = j.getConnection();
		
		
		String a = "5";
		
		a = "6";

		IPropertylDao propertyDb = new PropertyDaoImpl(conn);

		List list = new ArrayList();
		
		Property vp1 = new Property();
		vp1.setId(4);
		vp1.setName("ณฬธี");
		vp1.setAge(15);
		vp1.setPassword("5454sd");

		propertyDb.add(vp1);

		List<Property> list = propertyDb.find();

		for (Property p : list) {
			System.out.println(p.getName());
		}
	}
}
