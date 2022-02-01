package com.crm.comcast.orgTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;

public class UnitTest {
	@Test
	public void projectUnitTest() throws Throwable
	{
		String ProjectName="dash";
		Connection conn=null;
	try{
		Driver driverRef= new Driver();
	DriverManager.registerDriver(driverRef);
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		System.out.println("conn is done");
		Statement stat = conn.createStatement();
		String query = "select * from project";
		ResultSet result = stat.executeQuery(query);
		boolean flag = false;
		while(result.next()){
			String actProjName = result.getString(4);
			if(actProjName.equals(ProjectName))
			{
				flag=true;
			}
		}
		Assert.assertTrue(flag);
	}catch (Exception e) {
	}
	finally {
		conn.close();
		System.out.println("close db conn");
	}
}
}
