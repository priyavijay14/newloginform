 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Bootstrap outline structure </title>
    <meta charset="utf-8"> 
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
  
  <link rel="stylesheet" type="text/css" href="mystyle.css">
  
  </head>
  
<style>
body {
  background-color: orange;
}

h1 {
  color: yellow;
  margin-left: 20px;
}

</style>
<body>
<form action="Check"  method="POST"> 
<div class="container-fluid">
 <center> <h2><b>Registration Form</b></h2></center>
  
   <div class="jumbotron"> 
  <div class="form-group">
 
  <label for="username">Username:</label>
  <input type="username" class="form-control" id="username" placeholder= "enter username" name="username"  style="background-color:SlateBlue;">
  </div>
  
  
  <div class="form-group">
  <label for="password" style="color:Tomato;">password:</label>
  <input type="password" class="form-control" style="color:Tomato;" id="password" placeholder="enter password" name="normalpassword">
  </div>
  
  
  
  <div class="form-group">
  <label for="confirm password"> confirm password:</label>
  <input type="password" class="form-control" id="cpassword" placeholder="enter confirm username" name="cpassword">
  </div>
  
  
  
  <div class="form-group">
  <label for="mobile number">mobile number:</label>
  <input type="number" class="form-control" id="number" placeholder="enter mobile number" name="number">
  </div>
  
  <br>
  
  
  <button type="submit" class="btn btn-primary form-group">Submit</button>
  <button type="reset" class="btn btn-danger">Reset</button>
  
  </form>
  </div></div>

  </body>
  </html>
  
  
  
  
  
  
 