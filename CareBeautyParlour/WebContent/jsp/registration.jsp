<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ include file= "header.jsp"%>
    <%@ include file= "footer.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="registerUserAction" method="post">

<s:textfield name="fistName" label=" First Name"/>
<s:textfield name="lastName" label=" Last Name"/>
<s:textfield name="email" label="Email"/>
<s:textfield name="age" label="Age"/>
<s:textfield name="contact" label="Contact"/>
<s:textfield name="username" label="Username"/>
<s:password name="password" label="Password"/>
<s:submit name="action" value="register"/>

</s:form>

</body>
</html>