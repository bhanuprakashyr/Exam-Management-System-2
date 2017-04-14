<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EMS</title>
</head>
<body>
<h3>Create Exam</h3>
<form >
<fieldset>
    <legend>Exam Details:</legend>
    <br><br>
  Exam name:
  <select name="Exams">
    <option value="Prog1">Prog1</option>
    <option value="Core1">Core1</option>
    <option value="Core2">Core2</option>
    <option value="Core3">Core3</option>
  </select>
  &emsp;&ensp;&emsp;&ensp;
  Exam Category:
  <select name="Category">
    <option value="Programming">Programming</option>
    <option value="Core">Core</option>
    <option value="Electives">Core2</option>
    
  </select>
  Exam Date:
  <input type="text" name="Exam Date" >
  <br><br>
  Term:
  <input type="text" name="Term" >
  <br><br>
  Start Time:
  <input type="text" name="Start Time" >
  &nbsp;&nbsp;&nbsp;
  End Time:
  <input type="text" name="End Time" >
  <br><br>
  Location:
  <input type="text" name="location" >
  <br><br>
  Semester:
  <select name="Exams">
    <option value="Spring">Spring</option>
    <option value="Summer 1">Summer 1</option>
    <option value="Summer 2">Summer 2</option>
    <option value="Fall ">Fall</option>
  </select>
  
  <br><br>
  Registration Deadline:
  <input type="text" name="Deadline" >
  <br><br>
  <input type="submit" value="Create Exam">
  <input type="submit" value="Cancel">
  <input type="reset" value="Reset">
</fieldset>
</form> 
</body>
</html>