<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/index_work.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript" src="js/jquery-1.8.2.min.js">
</script>
</head>
<body>
<form action="add.do" method="post">
姓名:<input type="text" name="name"><br>
描述:<input type="text" name="ms"><br>
类型:<select name="tid">
	<option>===请选择===</option>
	<c:forEach items="${xia}" var="e">
	<option value="${e.tid}">${e.tname}</option>
	</c:forEach>
</select><br>
<input type="submit" value="添加">
</form>
</body>
</html>