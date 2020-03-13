<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ include file = "header.html" %>
<head>
<link href="css/indexstyle.css" rel="stylesheet"
	type="text/css" />
	<style>table{background-color: snow;}</style>
</head>

<body style="text-align:center;background-image: url('img/bg13.png');">

	

	<table>
		<sf:form  action="login" method="post" modelAttribute="login">
			<tr>
                           <td>User Id :</td>
                           <td><sf:input path="userId" id="userId" /></td>
                           <td><span style="color:red"><sf:errors path="userId" /></span></td>
                           <td><span style="color:red">${errorUserId}</span></td>
                     </tr>
                     <tr>
                           <td>Password:</td>
                           <td><sf:input path="password" id="password" type="password"/></td>
                           <td><span style="color:red"><sf:errors path="password" /></span></td>
                           <td><span style="color:red">${errorPassword}</span></td>
                     </tr>


			<tr>
				<td><input type="submit" value="Login" name="Login"></td>
				<td><input type="reset" value="Reset" ></td>
			</tr>
			<tr>
				<td><h3>If New User</h3></td>
				<td><a href="registerPage">Click here to Register</a></td>
			</tr>
		</sf:form>
	</table>
	
	</body>
	<%@ include file = "footer.html" %>
	

</html>