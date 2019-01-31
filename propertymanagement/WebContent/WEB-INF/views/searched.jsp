<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>search result</title>
	</head>
	<body>
		<h1 align="center">Property Management</h1>
		<hr width=500>
		<a href="renter_home.htm">Home</a>
		<a href="renter_req_add.htm">Add a request</a>
		<a href="renter_fav_list.htm">Favourite List</a>
		<form:form action="searchProperty.htm" method="post" modelAttribute="searchProperty">
			<form:input path="propertyLocation" placeholder="Enter location"/>
			<input type="submit" value=" search Property"/>
		</form:form>
		<form:form action="addFav.htm" method="post" modelAttribute="addFav">
			<form:input path="landId" placeholder="Enter Land Id"/>
			<input type="submit" value=" add to fav"/>
		</form:form>
		<hr width=100%>
		<center><font color="brown">Properties</font></center>
		<table align="center" cellspacing="15">
			<tr>
				<td>Land Id</td>
				<td>Area(in sqft)</td>
				<td>Location</td>
			</tr>
			<tr>
				<c:forEach items="${searchedProperties}" var="searchedProps">
					<td><c:out value="${searchedProps.landId}"></c:out></td>
					<td><c:out value="${searchedProps.area}"></c:out></td>
					<td><c:out value="${searchedProps.location}"></c:out></td>
				</c:forEach>
			</tr>
		</table>
	</body>
</html>