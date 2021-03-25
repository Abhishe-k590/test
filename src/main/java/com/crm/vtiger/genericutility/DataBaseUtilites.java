






 package com.crm.vtiger.genericutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import com.mysql.cj.jdbc.Driver;

/**
 * @ author abhishek
 */
public class DataBaseUtilites {
	static Connection conn = null;
	static ResultSet result = null;

	public void ConnectTODb() throws Throwable {

		Driver driverref = new Driver();

		DriverManager.registerDriver(driverref);
		DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");

	}
	/**
	 * 
	 * 
	 * getDataFromDB method to retrieve data from database as key value pairs
	 * @throws Throwable
	 */
	 
	
	public void closeDB() throws Throwable {
		conn.close();
	}
	
	
	// executing the query
	public ResultSet  executequery(String query) throws Throwable
	{
		result=conn.createStatement().executeQuery(query);
		return result;
	}

}
