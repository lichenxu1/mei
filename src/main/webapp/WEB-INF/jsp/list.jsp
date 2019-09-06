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
列表
<form id="page" action="list.do" method="post">
<input type="hidden" name="cpage" value="${page.pageNum}">
姓名:<input type="text" name="name" value="${map.name}">
<input type="submit" value="查询"> 
</form>
<input type="button" value="添加" onclick="location='xia.do'">
<table>
<tr>
<td>编号</td>
<td>植物姓名</td>
<td>描述</td>
<td>种类</td>
<td>操作</td>
</tr>
<c:forEach items="${list}" var="e">
<tr>
<td>${e.id}</td>
<td>${e.name}</td>
<td>${e.ms}</td>
<td>${e.tname}</td>
<td>
<input type="button" value="删除" onclick="location='delete.do?id=${e.id}'">
<input type="button" value="修改" onclick="location='show.do?id=${e.id}'">
</td>
</tr>
</c:forEach>
<tr>
<td colspan="7">
<input type="button" value="首页" onclick="page('1')">
<input type="button" value="上一页" onclick="page(${page.pageNum-1})">
<input type="button" value="下一页" onclick="page(${page.pageNum+1})">
<input type="button" value="尾页" onclick="page(${page.pages})">
</td>
</tr>
</table>
</body>
<script type="text/javascript">
function page(cpage) {
	
	$("[name='cpage']").val(cpage);
	$("#page").submit();
	
}
</script>
</html>