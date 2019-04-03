<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="t" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>landlord home</title>
	</head>
	<body>
		<h1 align="center">Property Management</h1>
		<hr width=500>
		<a href="landlord_prop_add.htm">Add Property</a>
		<hr width=100%>
		<h3>Welcome, ${loggedUserName}</h3>
		<center><font color="brown">Saved Property Details</font></center>
		<table cellspacing="20" align="center">
		<tr>
			<td>Land Id</td>
			<td>Area(in sqft)</td>
			<td>Location</td>
			<td>City</td>
			<td>State</td>
			<td>Status</td>
		</tr>
		<c:forEach items="${savedProperties}" var="propertiesList" >
			<tr>
				<td><c:out value="${propertiesList.landId}"></c:out></td>
				<td><c:out value="${propertiesList.area}"></c:out></td>
				<td><c:out value="${propertiesList.location}"></c:out></td>
				<td><c:out value="${propertiesList.city}"></c:out></td>
				<td><c:out value="${propertiesList.state}"></c:out></td>
				<td><c:out value="${propertiesList.status}"></c:out></td>
			</tr>
		</c:forEach>
		</table>
	</body>
</html>