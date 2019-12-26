<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
	<link rel = "icon" type = image/png href = "https://media.glassdoor.com/sqll/1266141/revature-squarelogo-1518529139618.png">
    <link rel="stylesheet" href = "Css/PageStyle.css"/>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <title>Manage Reimbursements</title>
</head>
<body>
 <div class="container-fluid">
 <div class = "row justify-content-center"><h3 class = "display-4">Manage Reimbursements</h3></div>
 <br>
    <div id = "manSideNav" class = "sidenav">
		<a href = "man-view-emp">View All Employees</a>
		<a href = "man-view-appr">View Approved Employee Requests</a>
		<a href = "man-view-den">View Denied Employee Requests</a>
		<a href = "login">Logout</a>
	</div>
<div class = "row justify-content-center">
<table id="reimb-table-w-name" class="table">
	<tr>
		<th>Employee Name</th>
		<th>Reimbursement ID</th>
		<th>Amount</th>
		<th>Description</th>
	</tr>
</table>
</div>
<br>
<div class = "row justify-content-center">
<form class = "form-group" method = "post">
<div class = "row justify-content-center">
	<select id= "dropdown" name = "dropdown">
  </select>
	<div class = "button btn-group">
	<br>	
	<button class = "btn btn-primary" name = "approve" type = "submit" value = "approved">Approve Request</button>
	<button class = "btn btn-primary" name = "deny" type = "submit" value = "denied">Deny Request</button>
</div>
</div>
</form>
</div>
</div>
<div class = "row justify-content-center"><input type = "button" class = "btn btn-secondary" value = "Return To Manager Home" onclick ="window.location.href = 'man-home';"/></div>
<script src="Js/ManagerViewReimb.js"></script>
</body>
</html>