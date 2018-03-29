package com.ourProject1.register;

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ourProject1.login.dao.LoginDao;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/Register")
public class RegisterController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fname, lname, pAddress, cAddress, mobNo, HomeNo, email;
		Date DoB=null;
		fname=request.getParameter("fname").toString();
		lname=request.getParameter("lname").toString();
		try {
			DoB=new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("DoB"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		pAddress=request.getParameter("p_address").toString();
		cAddress=request.getParameter("c_address").toString();
		mobNo=request.getParameter("mobile").toString();
		HomeNo=request.getParameter("home_tel").toString();
		email=request.getParameter("email").toString();
		
		if (fname.equals("") || lname.equals("") || DoB.toString().equals("") || pAddress.equals("") || cAddress.equals("") ||mobNo.equals("") || HomeNo.equals("") ||email.equals(""))
		{
			System.out.println("null values passed");
		}
		else {
			RegisterDao Rd=new RegisterDao();
			Rd.registerDetails(fname, lname, DoB, pAddress, cAddress, mobNo, HomeNo, email);
			System.out.println("Register successful");
			response.sendRedirect("index.jsp");
		}
	}

}
