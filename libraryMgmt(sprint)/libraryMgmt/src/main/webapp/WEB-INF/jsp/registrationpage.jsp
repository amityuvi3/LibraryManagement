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
<style>
TABLE{
position:absolute;
left:30%;
top:20%;
padding:20px;
background-color:snow;
font-size:20px;
}
th, td {
  padding: 15px;}
.registration form {
  width: 220px;
  height:330px;
  background-color: black;
  padding: 10px;
  border-radius: 15px;
  color: white;
  text-transform: uppercase;
  font-size: 11px;
  font-weight: bold;
  font-family: "Century Gothic";
}

table input:focus {
  background-color: orange;
}

a {
  outline: none;
}

#reset,#register{
  width: 149px;
  height: 42px;
  background-color: tan;
  border-radius: 10px;
  text-align: center;
  cursor: pointer;
  clear: both;
}


</style>
</head>
<body style="background-image: url('img/bg6.png');">
	<div class="registration"><table>
		<sf:form action="register" modelAttribute="register" method="post">
			<tr>
				<td>First Name:</td>
				<td><sf:input path="firstName" id="firstName" /></td>
				<td><span style="color:red"><sf:errors path="firstName" /></span></td>
				
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><sf:input path="lastName" id="lastName" /></td>
				<td><sf:errors path="lastName" /></td>
			
			</tr>
			<tr>
			<td>Select Your DOB:</td>
			<td><sf:input path="dOB" id="dOB" type="date" /></td>
			<td><sf:errors path="dOB"/></td>
		
			</tr><tr>
			<td>Gender:</td>
			<td><sf:radiobutton path="gender" id="gender" value="Male"/>Male
			<sf:radiobutton path="gender" id="gender" value="Female"/>Female</td>
			
			<td><sf:errors path="gender" /></td>
		
			</tr>

			<tr>
				<td>Contact Number:</td>
				<td><sf:input path="contactNumber" id="contactNumber" /></td>
				<td><sf:errors path="contactNumber" /></td>
			
			</tr>
			<tr>
				<td>Category:</td>
				<td><form:select name="category" path="category"
						id="category" items="${categoryList}">
						<form:errors  path="category"></form:errors>
					</form:select></td>
			</tr>

			<tr>
				<td>User Id (Email):</td>
				<td><sf:input path="userId" id="userId" /></td>
				<td><sf:errors path="userId" /></td>
			
			</tr>	
			<tr>
				<td>Password:</td>
				<td><sf:input path="password" id="password" type="password" /></td>
				<td><sf:errors path="password" /></td>
			
			</tr>		
			
			<tr>
				<td><input type="submit" value="Register" id="register" name="Register"></td>
				<td><input type="reset" value="Cancel" id="reset"></td>
			</tr>
		</sf:form>
	</table>
	</div>
<button onclick="goBack()" id="back">Go Back</button>
</body><%@ include file = "footer.html" %>
</html>
