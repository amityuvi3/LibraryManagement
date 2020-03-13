<%@ page import="com.model.BookBean" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book View Page</title>
<style>tr:hover {background-color:Snow;color:brown;}
#back{
position:absolute;
bottom:80px;background-color:wheat;
  color: black;
  border: 4px solid tan; /* Green */
  height:50px;
font-size:20px;
  width:150px;
}

.searchresult {
position:absolute;
left:55%;
top:25%;
}
.searchbooks{
background-color:wheat;
color:black;
width:50%;float:right;
text-align:center;
font-size:20px;
}

table{
background-color:wheat;

}

th, td {
  padding: 20px;
  text-align: left;
}

</style>
<%@ include file = "header.html" %>
<script>
	function goBack() {
		window.history.back();
	}
</script>
</head>
<body  style="background-image: url('img/bg6.png');"><br><br><br>
<div class="searchbooks">
<a href="addBook" style="font-size:20px;">Add New Book</a><br>
     <form action="searchBook">
           Select any category to search a book:
           <td><select name="bookCategory">
                     <option value="author_name">Author Name</option>
                     <option value="subject">Subject</option>
                     <option value="book_name">Book Name</option>

           </select> <br>Type a name as per category you have selected: <input type="text"
                name="category"></td> <input type="submit" value="Search"><br>
     </form>
</div>


     <table border="1" class="searchresult" >
    
      <tr><th>BookId</th><th>BookNumber</th><th>BookName</th><th>Subject</th><th>AuthorName</th><tr>
     
           <c:forEach var="c" items="${bookBeanList}">
                <tr>
                     <td>${c.bookId}</td>
                     <td>${c.bookNumber}</td>
                     <td>${c.bookName}</td>
                     <td>${c.subject}</td>
                     <td>${c.authorName}</td>
                </tr>
           </c:forEach>
     </table>
     
 
     <table border="1"  class="bookdetails">
     <tr><th colspan="7" style="text-align:center;">BookDetails</th><tr>
     <tr><th>BookId</th><th>BookNumber</th><th>BookName</th><th>Subject</th><th>AuthorName</th><th colspan="2">Action</th><tr>
     
           <c:forEach var="booklist" items="${viewBooklist}">
                <tr>
                     <td>${booklist.bookId}</td>
                     <td>${booklist.bookNumber}</td>
                     <td>${booklist.bookName}</td>
                     <td>${booklist.subject}</td>
                     <td>${booklist.authorName}</td>
                     <td><a href="showupdatepage?bookId=${booklist.bookId}">Update</a></td>
                     <td><a href="deleteBook?bookId=${booklist.bookId}">Delete</a></td>
                </tr>
           </c:forEach>
     </table>
<button onclick="goBack()" id="back">Go Back</button>
</body>
<%@ include file = "footer.html" %>
</html>