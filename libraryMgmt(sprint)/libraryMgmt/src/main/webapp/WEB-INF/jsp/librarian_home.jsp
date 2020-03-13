<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Librarian Home page</title>
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
<h1>Welcome Librarian </h1>
<h2>${username}</h2> 

<div class="vertical-menu">
<a href="viewBook">View Books</a>
<a href="viewBook">Search Books</a>
<a href="">Sort and Filter</a>
<a href="">Add User Norms</a>
<a href="">Update User Norms</a>
<a href="">Delete User Norms</a>
 <a href="">Update Librarian details</a>
 <a href="">Issue/Issued Books</a>
 

</div>

 <button onclick="goBack()" id="back">Go Back</button>
</body>
<%@ include file = "footer.html" %>
</html>