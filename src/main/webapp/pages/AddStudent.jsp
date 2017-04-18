<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addstudent" method="post">
Student Id:
  <input type="text" name="StudentId" >
  <br><br>
First Name:
  <input type="text" name="Fname" >
  &emsp;&ensp;&emsp;&ensp;
Last Name:
  <input type="text" name="Lname" >
  <br><br>
  DOB:
  <input type="text" name="DOB" >
  <br><br>
Major:
  <input type="text" name="Major" >
  <br><br>
Email Id:
  <input type="text" name="Email" >
  <br><br>
Phone No:
  <input type="text" name="Phone" >
  <br><br>
Address:
  <input type="text" name="Address" >
  <br><br>
City:
  <input type="text" name="City" >
  &emsp;&ensp;
State:
  <input type="text" name="State" >
  <br><br>
Zipcode:
  <input type="text" name="Zipcode" >
  <br><br>
  Country:
  <input type="text" name="Country" >
  <br><br>
  <input type="submit" value="Add Student">
  <input type="submit" value="Cancel">
</form>
</body>
</html>