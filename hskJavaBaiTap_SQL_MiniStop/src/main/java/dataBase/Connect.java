package dataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.swing.JOptionPane;

public class Connect 
{
	//Cài đặt cơ sở dữ liệu
	String url = "jdbc:sqlserver://localhost:3000;databaseName=Ministop";
    String username = "siu";
    String password = "messivodichworldcupUCL0981";   
	public Connect() 
	{
		super();
	}
	public Connection con()
	{
		Connection con=null;
		try 
		{
			con= DriverManager.getConnection(url, username, password);
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return con;
	}
	public Statement stmt()
	{
		Statement stmt=null;
		try 
		{
			stmt=con().createStatement();
		} catch (SQLException e) 
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return stmt;
	}
	public ResultSet resultSet(String sqlQuery)
	{
		ResultSet rs=null;
		try 
		{
			rs = stmt().executeQuery(sqlQuery);
		} catch (SQLException e) 
		{
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		return rs;
	}
}
