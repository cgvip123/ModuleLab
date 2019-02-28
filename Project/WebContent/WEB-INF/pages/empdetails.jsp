<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
 	<tr> 
 		<td>${emp.empid}</td>
 		<td>${emp.empName}</td>
 		<td>${emp.empSal}</td>
 	</tr>
</table>
</body>
</html>