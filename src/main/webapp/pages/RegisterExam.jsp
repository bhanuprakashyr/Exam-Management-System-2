<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form >
<fieldset>
    <legend>Exam Details:</legend>
    <br><br>
    Exam Category:
  <select name="Category">
  <%
  List<String> category=( List<String>) request.getAttribute("categoryList"); 
  for (String str: category) {   
%>
  
  <option value="Programming"><%= str%></option>   
    
<%}%>
  </select>
  <br><br>
  Exam name:
  <select name="Exams">
  <%
  List<String> exam=( List<String>) request.getAttribute("examList"); 
  for (String str: exam) {   
%>
  
  <option value="Programming"><%= str%></option>   
    
<%}%>
  </select>
  <br><br>
  <input type="submit" value="Submit">
  <input type="submit" value="Cancel">
  
</fieldset>
</form> 
</body>
</html>