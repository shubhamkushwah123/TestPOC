<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<s:form action="addCard">
<s:textfield key="cardId" label="Enter the Card Id"></s:textfield>
<s:textfield key="bankName" label="Enter the Bank Name"></s:textfield>
<s:textfield key="cardType" label="Enter the Card type"></s:textfield>
<s:textfield key="outstanding" label="Enter the Outstanding amount"></s:textfield>
<s:textfield key="dueDate" label="Enter the Due Date"></s:textfield>
<s:textfield key="statementGenerationDate" label="Enter the Statement Date"></s:textfield>
<s:submit value="Add Card"></s:submit>
</s:form>
</body>
</html>