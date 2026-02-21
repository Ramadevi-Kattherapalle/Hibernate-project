package com.example.Controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.Entity.Student;
import com.example.Service.Service;
import com.example.ServiceImp.ServiceImp;
import com.example.daoImp.DataBaseOperationsImp;
@WebServlet("/Home")
public class StudentHome extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		try {
			HttpSession session=req.getSession();
			String name=session.getAttribute("name").toString();
			Service service=new ServiceImp();
			List<Student> list=service.findAll();
			
			req.setAttribute("message", "Successfully logged");
			req.setAttribute("name", name);
			req.setAttribute("list", list);
			
			req.getRequestDispatcher("home.jsp").forward(req, res);
		    }
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}