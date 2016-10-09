<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body{
 background-image:url("../img/background.jpg");
  background-repeat:no-repeat;
 background-size:cover;
 }
   ul{
    background-color: black;
    overflow:hidden;
    list-style-type:none;
    }
   li{ 
     float:left;
    }
   li a{
     display: inline-block;
     color: white;
     padding:13px;
     text-decoration:none;
     }
   li:hover{
     background-color:pink;   
    }
  li a:hover{
    color:red;}

</style>
</head>
<body>
  <ul>
       <li><a href="http://localhost:8080/CareBeautyParlour/index.jsp">Home</a> </li>
        <li><a href="#About_Us">About Us</a> </li>
       <li><a href="#Contact_Us">Contact Us</a> </li>
       <li><a href="imageGalleryAction?action=Hair">Hair Care</a> </li>
       <li><a href="imageGalleryAction?action=Skin">Skin Care</a> </li>
       <li><a href="imageGalleryAction?action=MakeUp">MakeUp</a> </li>
     </ul>  
</body>
</html>