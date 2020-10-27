<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Login</title>
</head>
<body>

<form action="loginCheck">

	아이디&nbsp;&nbsp;&nbsp;&nbsp;: <input type="text" name="id"><br>
	비밀번호 : <input type="password" name="password"><br>
	<input type="submit" value="로그인">

</form>




</body>
</html>
