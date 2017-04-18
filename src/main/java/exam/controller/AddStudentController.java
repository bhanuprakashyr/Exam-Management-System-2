package exam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exam.service.*;

@WebServlet("/addstudent")
public class AddStudentController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddStudentController() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("inside add student contoller");
		int studentId=Integer.parseInt(request.getParameter("StudentId"));
		String Fname=request.getParameter("Fname");
		String Lname=request.getParameter("Lname");
		String DOB=request.getParameter("DOB");
		String major=request.getParameter("Major");
		String email=request.getParameter("Email");
		int phone=Integer.parseInt(request.getParameter("Phone"));
		String address=request.getParameter("Address");
		String city=request.getParameter("City");
		String state=request.getParameter("State");
		String country=request.getParameter("Country");
		int zipcode=Integer.parseInt(request.getParameter("Zipcode"));
		//
AddStudentService addStudentService=new AddStudentServiceImpl();
addStudentService.addStudent(studentId,Fname,Lname,DOB,major,email,phone,address,city,state,zipcode,country);
			}

}
