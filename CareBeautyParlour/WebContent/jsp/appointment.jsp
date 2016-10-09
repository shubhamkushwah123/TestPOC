<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file = "header.jsp" %>
    <%@ include file = "footer.jsp" %>
    <%@ taglib prefix="s" uri="/struts-tags"%>
    <%@ taglib prefix="sx" uri="/struts-dojo-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Appointment</title>
<sx:head />
<style>
body{
background-image:url(img/background.jpg);
}

</style>
</head>

<body background="img/background.jpg">

<s:form action="bookAppointmentAction" method="get" >

Select the Date : 

<sx:datetimepicker name="selectDate" displayFormat="dd-MM-yyyy" />
<s:submit name="action" value="getAppointment"></s:submit>
<s:if test="%{appointmentList!=null}">
<table border=1 align="center">
<tr>
<th>Select</th>
<th>Date</th>
<th>Slot</th>
<th>Status</th>
<th>Action</th>

</tr>
<s:iterator value="appointmentList">
<tr>
<td><input type="radio" name="chosenSlotId" value='<s:property value="appointmentSlotId"/>' checked/></td>
<td><s:property value="appointmentDate"/></td>
<td><s:property value="appointmentSlot"/></td>
<td><s:if test="isStatus()">
    booked
</s:if><s:else>
    available
</s:else></td>
<td><s:if test="isStatus()">   
<s:submit name="action" value="cancel" />
</s:if><s:else>
<s:submit name="action" value="book"/> 

</s:else>
</td>
</tr>
</s:iterator>
</table>
</s:if>

</s:form>

</body>
</html>