<%@ page import="com.model.BookBean" language="java"
     contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View Librarian Details</title>
</head>
<body>
     <br>
     <br>
     



     
     
     <h1 align="center">View Librarian Details</h1>
     <table border="1" align="center">
           <c:forEach var="librarianlist" items="${viewLibrarianlist}">
                <tr>
                     <td>${librarianlist.userId}</td>
                     <td>${librarianlist.firstName}</td>
                     <td>${librarianlist.contactNumber}</td>
                     <td>${librarianlist.gender}</td>
                     <td><a href="deleteLibrarian?userId=${librarianlist.userId}">Delete</a></td>
                </tr>
           </c:forEach>
     </table>
</body>
</html>

