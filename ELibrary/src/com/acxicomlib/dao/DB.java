package com.acxicomlib.dao;

import java.sql.*;

public class DB {
public static Connection getCon(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/acxiomlib","root","Sutu@2001");
		
	}catch(Exception e){
		System.out.println(e);
	}
	return con;
}
}
