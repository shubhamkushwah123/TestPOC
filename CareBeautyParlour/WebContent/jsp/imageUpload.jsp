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
<s:form name="imageUpload" action="imageUploadAction" enctype="multipart/form-data" method="post">

<s:select name="imageCategory" list="{'Hair','Skin','MakeUp'}" value="{'Hair','Skin','MakeUp'}">

Select Category
</s:select>

</br>

Image Name : 
	<s:textfield label="caption" name="imageCaption"/>
    <s:file name="image"/>
    <s:submit name="upload" value="upload"/>
    
    </s:form>
</body>
</html>