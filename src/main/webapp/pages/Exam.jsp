<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="exam.Exam"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form>
<fieldset>
<form >
<fieldset>
<%
  Exam aExam=new Exam();%>
Exam Id:
  <input type="text" name="Exam Id" value=<%=request.getParameter(aExam.getExam_id()) %> >
  <br><br>  
  Exam Date:
  <input type="text" name="Exam Date" value=<%=request.getParameter(aExam.getExam_date()) %> >
  <br><br>
  Semester:
<input type="text" name="Sem" value=<%=request.getParameter(aExam.getSemester()) %> >
  <br><br>
  Year:
  <input type="text" name="Year" value=<%=request.getParameter(aExam.getYear()) %> >
 <br><br>
  Start Time:
  <input type="text" name="Start Time" value=<%=request.getParameter(aExam.getStart_time()) %>  >
  &nbsp;&nbsp;&nbsp;
  End Time:
  <input type="text" name="End Time" value=<%=request.getParameter(aExam.getEnd_time()) %> >
  <br><br>
  Location:
  <input type="text" name="Location" value=<%=request.getParameter(aExam.getLocation()) %> >
  <br><br>
  Deadline:
  <input type="text" name="Deadline" value=<%=request.getParameter(aExam.getDeadline()) %> >
  <br><br>
  <input type="submit" value="Register">
  <input type="submit" value="Cancel">
  <input type="reset" value="Reset">
  </fieldset></form>
</body>
</html>