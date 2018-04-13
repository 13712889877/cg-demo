package com.cg.constanst.encapsulation;

import java.sql.SQLException;
import java.util.List;

public interface IPropertylDao {
	public void add(Property x) throws SQLException ;
	public void updata(Property x) throws SQLException;
	public void delete(int id) throws SQLException;
	public void findById(int id) throws SQLException;
	public List<Property> find() throws SQLException;
	
	
}
	 
	       