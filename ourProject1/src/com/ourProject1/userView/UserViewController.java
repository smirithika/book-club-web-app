package com.ourProject1.userView;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ourProject1.encrypt.perform;
import com.ourProject1.register.RegisterDao;

/**
 * Servlet implementation class UserViewController
 */
@WebServlet("/UserView")
public class UserViewController extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		String fname, lname, pAddress, cAddress, mobNo, homeNo, email,pwd,conPwd;
		String regex ="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#\\$%\\^&\\*])(?=.{8,})";
		
		fname=request.getParameter("fname").toString();
		lname=request.getParameter("lname").toString();
		pAddress=request.getParameter("p_address").toString();
		cAddress=request.getParameter("c_address").toString();
		mobNo=request.getParameter("mobile").toString();
		homeNo=request.getParameter("home_tel").toString();
		email=request.getParameter("email").toString();
		pwd=request.getParameter("pwd").toString();
		conPwd=request.getParameter("con_pwd").toString();
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date;
		java.sql.Date sqlStartDate = null;
		try {
			date = sdf1.parse(request.getParameter("DoB").toString());
			sqlStartDate = new java.sql.Date(date.getTime()); 
		} catch (ParseException e) {
			e.printStackTrace();
		}
		//System.out.println(fname+lname+sqlStartDate+pAddress+cAddress+mobNo+homeNo+email+pwd+conPwd+" =output");
		
		String select[]= request.getParameterValues("selected");
		if(select == null) {
			out.println("<script type=\"text/javascript\">");
	        out.println("alert('Select atleast one interest.');");
	        out.println("location='Register.jsp';");
	        out.println("</script>");
		}
		else if (sqlStartDate.after(new Date())) {
			out.println("<script type=\"text/javascript\">");
	        out.println("alert('Date invalid.\nCannot be a future date.');");
	        out.println("location='Register.jsp';");
	        out.println("</script>");
		}
		else if (pwd.matches(regex)) {
			out.println("<script type=\"text/javascript\">");
	        out.println("alert('password should contains atleast 8 characters including a digit,a lower case,an uppercase letter,a special character and no spaces allowed');");
	        out.println("location='Register.jsp';");
	        out.println("</script>");
		}
		else if (pwd.equals(conPwd)==false) {
			out.println("<script type=\"text/javascript\">");
	        out.println("alert('Your password mismatch.');");
	        out.println("location='Register.jsp';");
	        out.println("</script>");
		}
		else if (mobNo.contains("[0-9]+") && mobNo.length() != 10) {;
			out.println("<script type=\"text/javascript\">");
	        out.println("alert('Invalid Mobile No.\nCannot contain characters');");
	        out.println("location='Register.jsp';");
	        out.println("</script>");
		}
		else if (homeNo.contains("[0-9]+") && homeNo.length() != 10) {
			out.println("<script type=\"text/javascript\">");
	        out.println("alert('Invalid Home No.\nCannot contain characters');");
	        out.println("location='Register.jsp';");
	        out.println("</script>");
		}
		else {
//			RegisterDao Rd=new RegisterDao();
//			Rd.registerDetails(fname,lname, sqlStartDate, pAddress, cAddress, mobNo, homeNo, email,perform.encrypt(pwd),select);
			out.println("<script type=\"text/javascript\">");
	        out.println("alert('Register Successful !!');");
	        out.println("location='index.jsp';");
	        out.println("</script>");
		}
	}

}
