package exam.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import exam.Exam;
import exam.service.CreateExamService;
import exam.service.createExamServiceImpl;

/**
 * Servlet implementation class RegisterExamController
 */
@WebServlet("/RegisterExamController")
public class RegisterExamController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterExamController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		CreateExamService createExamService=new createExamServiceImpl();
    	List<String> categorylist=new ArrayList<>();
    	categorylist=createExamService.getCategory();
    	request.setAttribute("categoryList", categorylist);
   			getServletConfig().getServletContext().getRequestDispatcher("/RegisterExam.jsp").forward(request, response);
   			String Category=request.getParameter("Category");

   			List<String> examlist=new ArrayList<>();
	    	examlist=createExamService.getExam(Category);
	    	request.setAttribute("examList", examlist);
	    	getServletConfig().getServletContext().getRequestDispatcher("/RegisterExam.jsp").forward(request, response);
		
			String exam=request.getParameter("Exams");
			Exam aExam=new Exam();
			aExam=createExamService.getExamDetails(Category, exam);
			HttpSession session = request.getSession();
			session.setAttribute("object", aExam);
			getServletConfig().getServletContext().getRequestDispatcher("/Exam.jsp").forward(request, response);
		
			String exam_id=request.getParameter("Exam Id");
			String student_id=(String)session.getAttribute("MyID");
			
			
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
