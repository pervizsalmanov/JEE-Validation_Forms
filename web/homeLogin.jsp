<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Login</title>
</head>
<body>
    <div style="text-align: center">
        <a href="https://github.com/pervizsalmanov"><h1>My Github</h1></a>
        <strong>Authorization completed successfully!</strong>
        <br>
        <br>
        Your Fullname: <b>${user.fullname}</b> <br> Your Email: <b>(${user.email})</b>
        <br><br>
        <a href="../Web-Login/logout">Logout</a>
    </div>
</body>
</html>