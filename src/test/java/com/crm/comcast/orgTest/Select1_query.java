package com.crm.comcast.orgTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Select1_query {

	public static void main(String[] args) throws Throwable {
		Connection conn=null;
		try{
		Driver drive=new Driver();
		DriverManager.registerDriver(drive);
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		System.out.println("conn is done");
		Statement stat = conn.createStatement();
		ResultSet result = stat.executeQuery("select * from project");
		while(result.next())
		{
			System.out.println(result.getString(2));
		}
		}
		finally {
			conn.close();
		}
	}

}
