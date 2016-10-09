<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %>
<div Id="body" align="center">
<form action="TestServlet" name=test method="GET">
Sex : 
<input type="radio" name="sex" value="Male" checked/> Male
<input type="radio" name="sex" value="Female"/>Female
<input type="submit" value="Get Method Button"/>
</form>

<form action="TestServlet" name=test method="POST">
Sex : 
<input type="radio" name="sex" value="Male" checked/> Male
<input type="radio" name="sex" value="Female"/>Female
<input type="submit" value="Get Method Button"/>
</form>

<img src="images/0835.JPG" width="600" height="400"/>
</div>
</body>
</html>