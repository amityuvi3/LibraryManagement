<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Home page</title>
<style>
.vertical-menu {
	  width: 200px; 
	}

	.vertical-menu a {
	  background-color: #eee; 
	  color: black; 
	  display: block; 
	  padding: 12px; 
	  text-decoration: none; 
	}

	.vertical-menu a:hover {
	  background-color: #ccc; 
	}

	.vertical-menu a.active {
	  background-color: #4CAF50; 
	  color: white;
	}
</style>
</head><%@ include file = "header.html" %>
<body>
<h1>Welcome Admin </h1>
<h2>${username}</h2> 

<div class="vertical-menu">
<a href="viewBook">View Books</a>
<a href="">View Issued Books</a>
<a href="viewBook">Search Books</a>
<a href="">Sort and Filter</a>
<a href="">View User Norms</a>
<a href="">Add feedback</a>

</div>

 <button onclick="goBack()" id="back">Go Back</button>
</body>
<%@ include file = "footer.html" %>
</html>