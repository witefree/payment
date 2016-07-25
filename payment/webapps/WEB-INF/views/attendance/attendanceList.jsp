<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<c:set var="ctx" value="${pageContext.request.contextPath}"  />
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>考勤列表</title>
<script type="text/javascript" src="${ctx }/js/jquery-3.1.0.js"></script>
<script type="text/javascript"
	src="${ctx }/js/attendance/attendanceList.js"></script>
	<script type="text/javascript">
		var attendanceList=null;
	</script>
</head>
<body>
	<table id="attendanceList" width="450" border="0" align="center"
		cellspacing="0">
		<tr>
			<td width="45px">序号</td>
			<td width="60px">员工编号</td>
			<td>姓名</td>
			<td>实际出勤</td>
		</tr>
		<c:forEach items="${attendanceList }" var="attendance">
			<tr>
				<td>$index+1</td>
				<td>${attendance.code }</td>
				<td>${attendance.name }</td>
				<td>${attendance.realDate }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>