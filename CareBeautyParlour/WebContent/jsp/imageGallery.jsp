<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:if test="%{imageList!=null}">
<table border=1 align="center">
<s:iterator value="imageList">
<tr>
<td> <img width="200" height="200" src='Images/<s:property value="imageCaption"/>'/></td></tr>
<tr><td><s:property value="imageCaption"/></td>
</tr>
</s:iterator>
</table>
</s:if>
</body>
</html>