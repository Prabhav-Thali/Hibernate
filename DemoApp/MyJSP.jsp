<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Welcome To My JSP</h1>
<%! int count=0; %>
<% int i=0; %>
<h2> Value of count=<%=count++ %> </h2>
<h2> Value of i=<%=i++ %> </h2>
<%
int j=0;
j=count+i;

%>
Now Display j=<%=j %>
</body>
</html>