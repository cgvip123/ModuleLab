<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="100%" >
	<tr>
		<th>Emp No</th>
		<th>Name</th>
		<th>Salary</th>
	</tr>
 <c:forEach items="${list}" var="emp">
 	<tr> 
 		<td>${emp.empid}</td>
 		<td>${emp.empName}</td>
 		<td>${emp.empSal}</td>
 	</tr>
 </c:forEach>
</table>
<form action="EmpDetails.hr?id=${emp.empId}">
	<input type="text" name = "id">
	<input type="submit" value = "go">
</form>
<%-- <a href="EmpDetails.hr?id=${emp.empId}">view details</a> --%>
</body>
</html>