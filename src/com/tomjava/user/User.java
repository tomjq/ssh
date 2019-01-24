package com.tomjava.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(name="loginServlet",urlPatterns={"/login"})
public class User extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String name=request.getParameter("username");
		 String pwd=request.getParameter("pwd");
		 if(checklogin(name,pwd)){
			 request.getRequestDispatcher("pg.jsp").forward(request, response);
		 }else{
			 response.sendRedirect("login.jsp");
		 }
	}

	private boolean checklogin(String name, String pwd) {
		 boolean flag=false;
		  if(pwd!=null&&name!=null){
			  flag=pwd.matches("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$");
		  }
		 return flag;
		
	}

}
