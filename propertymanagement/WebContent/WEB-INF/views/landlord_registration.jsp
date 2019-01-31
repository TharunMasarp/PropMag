<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form"  uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LandLord Registration</title>
</head>
	<body>
		<h1 align="center">Property Management</h1>
		<hr width=500>
		<center><font color="blue">Landlord Registration</font></center>
		<form:form action="landlordReg.htm" method="post" modelAttribute="landlordReg">
			<table align="center">
				<tr>
					<td>first Name</td>
					<td><input path="firstName"/></td>
					<td><font color="red"><form:errors path="firstName"></form:errors></font></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input path="LastName"/></td>
					<td><font color="red"><form:errors path="lastName"></form:errors></font></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td>
						<input type="radio" path="gender" value="male"/>Male
						<input type="radio" path="gender" value="female"/>female
					</td>
					<td><font color="red"><form:errors path="gender"></form:errors></font></td>
				</tr>
				<tr>
					<td>City</td>
					<td><input path="city"/></td>
					<td><font color="red"><form:errors path="city"></form:errors></font></td>
				</tr>
				<tr>
					<td>Mobile</td>
					<td><input path="mobile"/></td>
					<td><font color="red"><form:errors path="mobile"></form:errors></font></td>
				</tr>
				<tr>
					<td>Email</td>
					<td><input path="email"/></td>
					<td><font color="red"><form:errors path="email"></form:errors></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input path="password"/></td>
					<td><font color="red"><form:errors path="password"></form:errors></font></td>
				</tr>
				<tr>
					<td>Confirm Password</td>
					<td><input path="cpassword"/></td>
					<td><font color="red"><form:errors path="cpassword"></form:errors></font></td>
				</tr>
				<tr>
					<td><input type="submit" value="Register"></td>
				</tr>
			</table>
		</form:form>
		<table align="center">
				<tr>
					<td>already Registered, click here to <a href="landlord_login.htm">login</a></td>
				</tr>
				<tr><td>back to <a href="home.htm">home</a></td></tr>
			</table>
	</body>
</html>