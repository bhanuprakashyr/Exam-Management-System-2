<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
form {
    border: 5px solid #f1f1f1;
    margin:auto;
    position: relative;
    
}

body {
    background-color: lightblue;
   // background-image: url(exam_banner.jpg) ;
 
}

h3
{
color:blue;
text-align: left;
text-shadow: 3px 2px white;
}

label
{
text-align: center;
//padding: 10px 10px;
display: inline-block;
width:100px;
height:5px;
color: olive;
font-weight: bold;
font-style: oblique;
}
input[type=text] {
    width: 12%;
    //padding: 10px 15px;
    //margin: 1px 0;
    margin: auto;
    display: inline-block;
    border: 1px solid #ccc;
    box-sizing: border-box;
    text-align: left;
}

button {
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 10%;
}

button:hover {
    opacity: 0.8;
}

.cancelbtn {
    width: 10%;
    padding: 6px 10px;
    background-color: lightgrey;
}
.addstudentbtn {
    width: 10%;
    padding: 6px 10px;
    background-color: lightgrey;
}
.resetbtn {
    width: 10%;
    padding: 6px 10px;
    background-color: lightgrey;
}
.imgcontainer {
    text-align: center;
    margin: 24px 0 12px 0;
}

img.avatar {
    width: 40%;
    border-radius: 50%;
}

.container {
width: 100%;
    padding: 16px;
    margin:auto;
}

.cancelbtn {
       width: 10%;
    }
.resetbtn {
       width: 10%;
    }
}
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exam Management System</title>
</head>
<body >
<h3>Add Student</h3>
<form action="addstudent" method="get">
<div class="container">
    <label><b>Student Id</b></label>
    <input type="text" placeholder="Enter 700 number" name="StudentId" required="required">
  <br><br>
<label><b>First Name</b></label>
  <input type="text"  placeholder="Enter First Name" name="Fname" required="required">
  &emsp;&ensp;&emsp;&ensp;
<label><b>Last Name</b></b></label>
  <input type="text" placeholder="Enter Last Name" name="Lname" required="required">
  <br><br>
 <label><b>Date of Birth</label>
  <input type="text" placeholder="YYYY-MM-DD" name="DOB" required="required">
  <br><br>
<label><b>Major</b></label>
  <input type="text" placeholder="Enter Major" name="Major" required="required">
  <br><br>
<label><b>Email Id</b></label>
  <input type="text" placeholder="Enter Email Id" name="Email" required="required">
  <br><br>
<label><b>Phone No</b></label>
  <input type="text" placeholder="Enter Phone number" name="Phone" required="required">
  <br><br>
<label><b>Address</b></label>
  <input type="text" placeholder="Enter Address" name="Address" required="required">
  <br><br>
<label><b>City</b></label>
  <input type="text" placeholder="Enter City" name="City" required="required">
  &emsp;&ensp;
<label><b>State</b></label>
  <input type="text" placeholder="Enter State" name="State" required="required">
  <br><br>
<label><b>Zipcode</b></label>
  <input type="text" placeholder="Enter Zipcode" name="Zipcode" required="required">
  <br><br>
  <label><b>Country</b></label>
  <input type="text" placeholder="Enter Country" name="Country" required="required">
  <br><br>
  </div>
  <div class="container" style="background-color:#f1f1f1">
    <input type="submit" value="Add Student" class="addstudentbtn">
  <input type="submit" value="Cancel" class="cancelbtn">
  <input type="reset" value="Reset" class="resetbtn">
  </div>
</form>
</body>
</html>