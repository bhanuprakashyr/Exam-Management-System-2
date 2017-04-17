<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>EMS</title>
</head>
<body>
<h3>Enter Result</h3>
<form >
<fieldset>
    <legend>Result:</legend>
    <br><br>
  Exam name:
  <select name="Exams">
    <option value="Prog1">Prog1</option>
    <option value="Core1">Core1</option>
    <option value="Core2">Core2</option>
    <option value="Core3">Core3</option>
  </select>
 <br><br>
  Student Id:
  <select name="StudentId">
    <option value="Stud1">Stud1</option>
    <option value="Stud2">Stud2</option>
    <option value="Stud3">Stud3</option>
    <option value="Stud4">Stud4</option>
  </select>
  <br><br>
  Result:
  <select name="Result">
    <option value="Pass">Pass</option>
    <option value="Fail">Fail</option>
    <option value="On Hold">On Hold</option>
  </select>
<br><br>
  <label style="color:red" >System Status:</label>
  <input type="text" name="Status" >
  <br><br>
  <input type="submit" value="Save"> 
  <input type="submit" value="Cancel"> 
  </fieldset>
</form> 
</body>
</html>