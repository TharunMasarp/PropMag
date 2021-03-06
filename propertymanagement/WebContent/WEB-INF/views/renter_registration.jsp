<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Rental Registration</title>
	</head>
	<body>
		<h1 align="center">Property Management</h1>
		<hr width=500>
		<center><font color="blue">Renter Registration</font></center>
		<form:form action="renter_reg.htm" method="post" modelAttribute="renterReg">
			<table align="center">
				<tr>
					<td>First Name</td>
					<td><form:input path="firstName"/> </td>
					<td><font color="red"><form:errors path="firstName"></form:errors> </font></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><form:input path="lastName"/> </td>
					<td><font color="red"><form:errors path="lastName"></form:errors> </font></td>
				</tr>
				<tr>
					<td>Location</td>
					<td><form:input path="location"/> </td>
					<td><font color="red"><form:errors path="location"></form:errors> </font></td>
				</tr>
				<tr>
					<td>Mobile No</td>
					<td><form:input path="mobile"/> </td>
					<td><font color="red"><form:errors path="mobile"></form:errors></font></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><form:input path="email"/> </td>
					<td><font color="red"><form:errors path="email"></form:errors> </font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><form:input path="password"/> </td>
					<td><font color="red"><form:errors path="password"></form:errors> </font></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><form:input path="cPassword"/> </td>
					<td><font color="red"><form:errors path="cPassword"></form:errors> </font></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register"/></td>
				</tr>
			</table>
		</form:form>
		<table align="center">
			<tr><td>already Registered, click here to <a href="renter_login.htm">login</a></td></tr>
			<tr><td>back to <a href="home.htm">home</a></td></tr>
		</table>
	</body>
</html>