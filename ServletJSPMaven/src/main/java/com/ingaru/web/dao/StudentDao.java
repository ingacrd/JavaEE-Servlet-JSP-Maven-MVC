package com.ingaru.web.dao;

import java.sql.*;

import com.ingaru.web.model.Student;

public class StudentDao {
	
	public Student getStudent(int rollno) {
		Student s = new Student();
		s.setRollno(101);
		s.setSname("Pepita");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/abc", "root", "1234");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from student where rollno=" + rollno);
			if(rs.next()) {
				s.setRollno(rs.getInt("rollno"));
				s.setSname(rs.getString("sname"));
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return s;
	}
}
