package com.ingaru.web;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;


import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import com.ingaru.web.dao.StudentDao;
import com.ingaru.web.model.Student;

/**
 * Servlet implementation class GetStudentController
 */
//@WebServlet("/getStudent")
public class GetStudentController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int rollno = Integer.parseInt(request.getParameter("rollno"));
		StudentDao dao = new StudentDao();
		Student s1 = dao.getStudent(rollno);
		
		request.setAttribute("student", s1);
		
		//Dispatcher for no to be seen, redirect will show the detination url.
		//response.sendRedirect("howStudent.jsp");
		//OR HttpSession session = request.getSession();
		//session.setAttribute("student", s1);
		//in the jsp -> use: Student s1 = (Student)session.getAttribute("student");
		RequestDispatcher rd = request.getRequestDispatcher("howStudent.jsp");
		rd.forward(request, response);
		
		
	}

}
