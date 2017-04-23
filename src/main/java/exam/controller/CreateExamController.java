package exam.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import exam.dao.createExamDaoImpl;
import exam.service.CreateExamService;
import exam.service.createExamServiceImpl;

/**
 * Servlet implementation class CreateExamController
 */
@WebServlet("/CreateExamController")
public class CreateExamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateExamController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    				
		
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside create Exam contoller");
		String examId=request.getParameter("ExamId");
		String examName=request.getParameter("ExamName");
		String category=request.getParameter("ExamCategory");
		String date=request.getParameter("ExamDate");
		String startTime=request.getParameter("StartTime");
		String endTime=request.getParameter("EndTime");
		String location=request.getParameter("location");
		String sem=request.getParameter("Sem");
		String year=request.getParameter("Year");
		String deadline=request.getParameter("Deadline");
		
	CreateExamService createExamService=new createExamServiceImpl();
	createExamService.createExam(examId, examName, category, date, startTime, endTime, location, sem, year, deadline);

	}

}
