<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Property Add</title>
	</head>
	<body>
		<h1 align="center">Property Management</h1>
		<hr width=500>
		<a href="landlord_home.htm">Home</a>
		<hr width=100%>
		<center><font color="brown">Adding Property</font></center>
		<form:form action="add_prop.htm" method="post" modelAttribute="addProp">
			<table align="center">
				<tr>
					<td>Area(in sqft)</td>
					<td><input path="area"/></td>
					<td><font color="red"><form:errors path="area"></form:errors></font></td>
				</tr>
				<tr>
					<td>Location</td>
					<td><input path="location"/></td>
					<td><font color="red"><form:errors path="location"></form:errors></font></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input path="city"/></td>
					<td><font color="red"><form:errors path="city"></form:errors></font></td>
				</tr>
				<tr>
					<td>State</td>
					<td><input path="state"/></td>
					<td><font color="red"><form:errors path="state"></form:errors></font></td>
				</tr>
				<tr>
					<td>
						<input type="submit" value="Add" align="center">
					</td>
				</tr>
			</table>
		</form:form>
	</body>
</html>