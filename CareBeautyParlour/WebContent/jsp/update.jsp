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
<s:form action="registerUserAction">
<s:textfield label="Member ID " key="member.memberId" /><br>
 <s:textfield label="User Id " key="member.username" /><br>
<s:textfield label="Password " key="member.password"/><br>
 <s:textfield label="First Name" key="member.firstName" /><br>
<s:textfield label="Contact" key="member.contact"/><br>
 <s:textfield label="Last Name" key="member.lastName" /><br>
 <s:textfield label="Age" key="member.age" /><br>
 <s:textfield label="Email" key="member.email" /><br>

<s:submit name="action" value="update"/>
</s:form>
</body>
</html>