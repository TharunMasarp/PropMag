<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>renter home</title>
	</head>
	<body>
		<h1 align="center">Property Management</h1>
		<hr width=500>
		<a href="renter_req_add.htm">Add a request</a>
		<a href="renter_fav_list.htm">Favourite List</a>
		<form:form action="searchProperty.htm" method="post" modelAttribute="searchProperty">
			<form:input path="propertyLocation" placeholder="Enter location"/>
			<input type="submit" value=" search Property"/>
		</form:form>
		<hr width=100%>
		<center><font color="brown">Saved Requests</font></center>
		<table cellspacing="20" align="center">
		<tr>
			<td>Property Type</td>
			<td>City</td>
			<td>State</td>
		</tr>
		<c:forEach items="${savedRequests}" var="requestsList" >
			<tr>
				<td><c:out value="${requestsList.propType}"></c:out></td>
				<td><c:out value="${requestsList.city}"></c:out></td>
				<td><c:out value="${requestsList.state}"></c:out></td>
			</tr>
		</c:forEach>
		</table>
	</body>
</html>