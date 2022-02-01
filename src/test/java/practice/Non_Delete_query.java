package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class Non_Delete_query {
	
	public static void main(String[] args) throws Throwable {
		Connection conn=null;
		int result=0;
		try{
		Driver drive=new Driver();
		DriverManager.registerDriver(drive);
		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/projects", "root", "root");
		Statement stat = conn.createStatement();
		String query = "update project set project_name='dash_no1' where lower(created_by)='vivek'";
		result=stat.executeUpdate(query);
		}
		catch (Exception e) {
		}
		finally {
			if(result==1)
			{
				System.out.println("successfully deleted");
			}
			else
			{
				System.out.println("failed");
			}
			conn.close();
			System.out.println("closed");
		}
	}
		}

