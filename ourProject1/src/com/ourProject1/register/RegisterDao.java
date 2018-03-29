package com.ourProject1.register;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class RegisterDao {
	
	public void registerDetails(String fn,String ln,Date DOB,String pa,String ca,String mob,String home,String email) {
		Connection con=null;
		PreparedStatement st=null,st2=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/book","root","");
		String sql="insert into member(fname,lname,DOB,p_address,c_address,mobile,home_tel) values(?,?,?,?,?,?,?)";
		st=con.prepareStatement(sql);
		st.setString(1,fn);
		st.setString(2,ln);
		st.setDate(3,(java.sql.Date) DOB);
		st.setString(4,pa);
		st.setString(5,ca);
		st.setString(6,mob);
		st.setString(7,home);
		st.execute();
		
		String sql2="insert into user(u_name,pwd,u_type,email) values(?,?,?,?)";
		st2=con.prepareStatement(sql2);
		st2.setString(1,fn+ln);
		st2.setString(2,fn+mob);
		st2.setString(3,"member");
		st2.setString(4,email);
		st2.execute();
		
		System.out.println("DB insert success");
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		try {
			st2.close();
			st.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
}
