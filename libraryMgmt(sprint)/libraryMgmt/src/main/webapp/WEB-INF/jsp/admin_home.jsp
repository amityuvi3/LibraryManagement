<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home page</title>
<style>
.vertical-menu {

	  width: 200px; 
	}

	.vertical-menu a {
	  background-color: tan; 
	  color: black; 
	  display: block; 
	  padding: 12px; 
	  text-decoration: none; 
	}

	.vertical-menu a:hover {
	  background-color: white; 
	}

	.vertical-menu a.active {
	  background-color: white; 
	  color: white;
	}
	
</style>
</head><%@ include file = "header.html" %>
<body style="background-image: url('img/bg6.png');">
<div id="admin"><h1 style="	color:white;position:absolute;top:10%;left:12%;">Welcome Admin ${username}</h1>
<div>
<br><br><br><br>
<div class="vertical-menu">
<a href="viewLibrarianDetails">View Librarian details</a>
<a href="showaddpage">Add Books</a>
<a href="viewBook">View Books</a>
<a href="">Generate Report</a>

<a href="viewBook">Search Books</a>
<a href="">Sort and Filter</a>
<a href="">Add User Norms</a>
<a href="">Update User Norms</a>
<a href="">Delete User Norms</a>
<a href="">Add feedback Questinnaires</a>
</div>


</body>
<%@ include file = "footer.html" %>
</html>