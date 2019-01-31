<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>success</title>
</head>
	<body>
		<h1 align="center">Property Management</h1>
		<hr width=500>
		<a href="landlord_registration.htm">Landlord Registration</a> &nbsp;&nbsp;&nbsp;&nbsp;
		<a href="renter_registration.htm">Renter Registration</a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="landlord_login.htm">Landlord Login</a>&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="renter_login.htm">Renter Login</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		
		<form:form action="searchProperty.htm" method="post" modelAttribute="searchProperty">
			<form:input path="propertyLocation" placeholder="Enter location"/>
			<input type="submit" value=" search Property"/>
		</form:form>
		<hr width=100%>
		<br/>
		<br/>
		<br/>
		<br/>
		<br/>
		<center><font>Your successfully registered to our site...</font></center>
		
	</body>
</html>