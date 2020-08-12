<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="showtake" method="post">
		起飞机场： <select name="takeid">
					<option value="0">请选择</option>
					<c:forEach items="${takeport}" var="take">
						<option value="${take.id}">${take.portName}</option>
					</c:forEach>
				</select> 
		降落机场： <select name="landid">
					<option value="0">请选择</option>
					<c:forEach items="${landport}" var="take">
					<option value="${take.id}">${take.portName}</option>
					</c:forEach>
				</select> 
		<input  type="submit" value="提交"/>
</form>
<table border="1">
	<tr>
		<th>飞机编号</th>
		<th>起飞机场</th>
		<th>起飞城市</th>
		<th>降落机场</th>
		<th>降落城市</th>
		<th>航行时间</th>
		<th>票价(元)</th>
	</tr>
	<c:forEach items="${showAirplaneList}" var="airplane">
		<tr>
			<td>${airplane.airNo}</td>
			<td>${airplane.takePort.portName}</td>
			<td>${airplane.takePort.cityName}</td>
			<td>${airplane.landPort.portName}</td>
			<td>${airplane.landPort.cityName}</td>
			<td>
				<c:if test="${Math.floor(airplane.time/60)>0}"> <fmt:formatNumber value="${airplane.time/60}" pattern="0"></fmt:formatNumber>小时</c:if> 
				<c:if test="${airplane.time%60>0}">${airplane.time%60}分钟</c:if>
			</td>
			<td>${airplane.price}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>