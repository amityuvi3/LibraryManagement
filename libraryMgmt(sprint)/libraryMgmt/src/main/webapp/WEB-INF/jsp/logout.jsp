<% 
session.removeAttribute("username");
session.removeAttribute("category");
response.sendRedirect("loginpage");

%>
