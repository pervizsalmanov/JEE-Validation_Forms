<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Admin CPanel - Bookshop</title>
</head>
<body>
    <div style="text-align: center">
        <h1>Welcome to Bookshop Website Admin Panel</h1>
        <b>${users.fullname} (${users.email})</b>
        <br><br>
        <a href="../Web-Login/logout">Logout</a>
    </div>
</body>
</html>