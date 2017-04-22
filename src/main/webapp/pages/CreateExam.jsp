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
text-align: Left;
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
.createexambtn	 {
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
<title>EMS</title>
</head>
<body>
<h3>Create Exam</h3>
<form action="CreateExamController" method="post">
<div class="container">
    <label>Exam Id</label>
  <input type="text" placeholder="Enter Exam Id " name="ExamId" required="required">
    <br><br>
    <label>Exam Name</label>
  <input type="text" placeholder="Enter Exam Name " name="ExamName" required="required">
  &emsp;&ensp;&emsp;&ensp;
  <label>Category</label>
  <input type="text" placeholder="Prog/Core/Elective "name="ExamCategory" required="required">
  <br><br>
  <label>Exam Date</label>
  <input type="text" placeholder="YYYY-MM-DD " name="ExamDate" required="required">
  <br><br>
  <label>Start Time</label>
  <input type="text" placeholder="HH-MM-SS " name="StartTime" required="required">
  &emsp;&ensp;&emsp;&ensp;
  <label>End Time</label>
  <input type="text" placeholder="HH-MM-SS " name="EndTime" required="required">
  <br><br>
  <label>Exam Location</label>
  <input type="text" placeholder="Enter Exam Location" name="location" required="required">
  <br><br>
  <label>Semester</label>
  <input type="text" placeholder="Enter Semester" name="Sem" required="required">
  &emsp;&ensp;&emsp;&ensp;
  <label>Academic Year</label>
  <input type="text" placeholder="YYYY" name="Year" required="required">
  <br><br>
  <label>Reg Deadline</label>
  <input type="text" placeholder="YYYY-MM-DD" name="Deadline" required="required">
  <br><br>
   <div class="container" style="background-color:#f1f1f1">
    <input type="submit" value="Create Exam" class="createexambtn">
  <input type="submit" value="Cancel" class="cancelbtn">
  <input type="reset" value="Reset" class="resetbtn">
  </div>
</div>
</form> 
</body>
</html>