<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file= "jsp/header.jsp"%>
<%@ include file= "jsp/footer.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Care Beauty Parlour</title>
<style>
body{
 background-image:url("img/background.jpg");
  background-repeat:no-repeat;
 background-size:cover;
 }
 form{
     
    position: absolute;
    right: 0px;
    width: 150px;
    padding: 10px;

 }
</style>
<script >
function openR(){
	location.href="http://localhost:8080/CareBeautyParlour/jsp/registration.jsp";
}
</script>
</head>
<body>
<form>
<a href="http://localhost:8080/CareBeautyParlour/jsp/login.jsp"><input type="button" name="login" value="login"/></a>
<input type="button" onclick="openR()" name ="registration" value="registration">

</form>

</body>

</html>