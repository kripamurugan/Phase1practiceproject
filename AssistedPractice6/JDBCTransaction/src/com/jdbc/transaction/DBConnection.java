package com.jdbc.transaction;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
Class.forName("com.mysql.cj.jdbc.Driver");
String dburl="jdbc:mysql://localhost:3307/transaction_management";
String username="root";
String password="kripa@1999";


Connection con=DriverManager.getConnection(dburl, username, password);
System.out.println("successfully connected to database");
con.close();
}

	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
}
