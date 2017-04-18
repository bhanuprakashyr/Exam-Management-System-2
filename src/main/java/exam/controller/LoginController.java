package exam.controller;

import exam.service.LoginService;
import exam.service.LoginServiceImpl;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/login",name="loginServlet")
public class LoginController extends HttpServlet {
    @Override
    public void service(HttpServletRequest servletRequest, HttpServletResponse servletResponse)
            throws ServletException, IOException {
        LoginService loginService = new LoginServiceImpl();
        
        
        String userName = servletRequest.getParameter("");
        String password = servletRequest.getParameter("");
        boolean isValidUser = loginService.isValidateLoginCredentials(userName,password);
        if(isValidUser){
        	if(userName=="700000000")
        		servletResponse.sendRedirect("FacultyOptions.jsp");
        	else
        		servletResponse.sendRedirect("StudentOptions.jsp");
        }else {
        	servletResponse.sendRedirect("Signin.jsp");   
        }
    }
}