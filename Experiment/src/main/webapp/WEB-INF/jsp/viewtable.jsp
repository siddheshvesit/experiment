<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>


<!DOCTYPE html>
<html>

<head>
<script src="https://code.jquery.com/jquery-3.5.1.js" type="text/javascript"></script>
<script type="text/javascript" charset="utf8" src="https://cdn.datatables.net/1.10.21/js/jquery.dataTables.js"></script>
<link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.21/css/jquery.dataTables.min.css">
<script type="text/javascript">
$(document).ready( function () {
    $('#tt').DataTable();
} );
</script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>welcome to Dmart</h1>
<table id="tt" class="display">
<thead>
<tr>
<th>productUniqueId</th>
<th>productName</th>
<th>productCategory</th>
<th>ProductSubCategory</th>
<th>ProductBrand</th>
<th>productWeight</th>
<th>productPrice</th>
</tr>
</thead>
<tbody>
<c:forEach items= "${records}" var="temp">

<tr>
<td>${temp.productUniqueId}</td>
<td>${temp.productName}</td>
<td>${temp.productCategory}</td>
<td>${temp.productSubCategory}</td>
<td>${temp.productBrand}</td>
<td>${temp.productWeight}</td>
<td>${temp.productPrice}</td>
</tr>

</c:forEach>
</tbody>
</table>
</body>
<a href="welcome.jsp">click me</a>
</html>