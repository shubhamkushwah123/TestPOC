<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<sx:head/>
</head>
<body>
<s:form action="Tutorial/getTutorial.action" method="post">

<sx:datetimepicker name="date1" label="Format (dd-MM-yyyy)" displayFormat="dd-MMM-yyyy" value="%{today}"/>

<s:submit key="submit"></s:submit>

</s:form>
</body>
</html>