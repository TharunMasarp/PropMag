<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login</title>
</head>
<body>
	<h1 align="center">Property Management</h1>
		<hr width=500>
		<center><font color="blue">Renter Registration</font></center>
		<form:form action="landlordReg.htm" method="post" modelAttribute="landlordReg">
			<table align="center">
				<tr>
					<td>User Id</td>
					<td><input path="userId"/></td>
					<td><font color="red"><form:errors path="userId"></form:errors></font></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input path="password"/></td>
					<td><font color="red"><form:errors path="password"></form:errors></font></td>
				</tr>
				<tr>
					<td><input type="submit" value="login"/></td>
				</tr>
			</table>
			</form:form>
			<table align="center">
				<tr>
					<td>not registered, click here to <a href="renter_regitration.htm">login</a></td>
				</tr>
				<tr>
					<td>back to <a href="home.htm">home</a></td>
				</tr>
			</table>
</body>
</html>