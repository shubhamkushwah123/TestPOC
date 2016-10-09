<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<sx:head/>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hello World !!!
<s:property value="message"/>
<display:table id="pagination" name="pageList">

<display:column property="firstName" title="First Name"></display:column>
<display:column property="lastName" title="Last Name"></display:column>
</display:table>

</body>
</html>