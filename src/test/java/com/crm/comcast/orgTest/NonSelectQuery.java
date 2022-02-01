package com.crm.comcast.orgTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class NonSelectQuery {

	public static void main(String[] args) throws Throwable{
		Connection conn=null;
		int result=0;
		try{
		Driver driverRef=new Driver();
		DriverManager.registerDriver(driverRef);
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		System.out.println("connection is done");
		Statement stat = conn.createStatement();
		String query = "insert into project values('TY_PROJ_3003','bari dovvu','12/01/2022','YES BANK','COMPLETED',6)";
		result=stat.executeUpdate(query);
	}
		catch (Exception e) {
			
		}
		finally {
	if(result==1)
	{
	System.out.println("project inserted successfully");
	}
	else
	{
		System.out.println("not inserted");
	}
	conn.close();
	System.out.println("close db connection");
}
	}
}
