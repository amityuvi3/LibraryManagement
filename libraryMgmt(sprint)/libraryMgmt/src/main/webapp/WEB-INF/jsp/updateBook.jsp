<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file = "header.html" %>
<head><style>table{
background-color:wheat;
position: absolute;
	left: 40%;
	top: 35%;
}

th, td {
  padding: 20px;
  text-align: left;
}
tr:hover {background-color:Snow;color:brown;}
</style></head>

<body  style="background-image: url('img/bg6.png');">

	<table>
		<sf:form action="addBook" modelAttribute="bookBean" >
			
			<tr>
				<th>Book Number:</th>
				<td><sf:input path="bookNumber" id="bookNumber" /></td>
				<td><sf:errors path="bookNumber" /></td>
			
			</tr><tr>
			<th>Subject:</th>
			<td><sf:input path="subject" id="subject" /></td>
			<td><sf:errors path="subject"/></td>
		
			</tr>
			<tr>
			<th>Book Name:</th>
			<td><sf:input path="bookName" id="bookName" /></td>
			<td><sf:errors path="bookName"/></td>
		
			</tr>
			<tr>
			<th>Author Name:</th>
			<td><sf:input path="authorName" id="authorName" /></td>
			<td><sf:errors path="authorName"/></td>
		
			</tr>
			
			<tr>
				<td colspan="2"><input type="submit" value="Update Book" name="Update Book"></td>
				<td><input type="reset" value="reset"></td>
			</tr>
		</sf:form>
	</table>
<button onclick="goBack()" id="back">Go Back</button>
</body><%@ include file = "footer.html" %>
</html>
