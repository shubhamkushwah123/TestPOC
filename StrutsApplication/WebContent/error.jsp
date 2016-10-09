<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<%@ taglib prefix="display" uri="http://displaytag.sf.net"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

/* for hiding the page banner */
.pagebanner 
{
        display: none;
}
/* for customizing page links */
.pagelinks 
{
        color: maroon;
        margin: 20px 0px 20px 50px;
}
/* for shifting all the Export options*/
.exportlinks 
{
        margin: 20px 0px 20px 30px;
}
/* For changing the spaces between export link */
.export 
{
        margin-left: 30px;
}
/* For Table css */
table 
{
        border: 1px solid #666;
        width: 60%;
        margin: 20px 0 20px 0px;
}
/* For odd and even row decoration */
tr.odd 
{
        background-color: #fff
}
tr.tableRowEven,tr.even 
{
        background-color: #CCCCCC
}
/* Css for table elements */
th,td 
{
        padding: 2px 4px 2px 4px;
        text-align: left;
        vertical-align: top;
}
thead tr 
{
        background-color: #999999;
}
/* For changing the background colour while sorting */
th.sorted 
{
        background-color: #CCCCCC;
}
th.sorted a,th.sortable a 
{
        background-position: right;
        display: block;
        width: 100%;
}
th a:hover 
{
        text-decoration: underline;
        color: black;
}
th a,th a:visited 
{
        color: black;
}
</style>

</head>
<body>
<s:form name="pagination" action="pagination.action"> 

<display:table id="pageList" name="pageList" pagesize="5" requestURI="">

<display:column property="firstName" title="First Name"></display:column>
<display:column property="lastName" title="Last Name"></display:column>
</display:table>
</s:form>
</body>
</html>