<!DOCTYPE html>
<html>
<head>
<title>Page Title</title>
</head>
<body bgcolor="blue">
    <%@page import="java.util.Scanner" %>
	<%!int c = 10;
	Scanner sc=new Scanner(System.in);%>
	<%
	int i = Integer.parseInt(request.getParameter("num1"));
	int j = Integer.parseInt(request.getParameter("num2"));
	int k = i + j;
	out.println("Output:" + k);
	%>

	<%=k%>
</body>
</html>