<%@ page language="java" import="java.util.*" pageEncoding="gbk"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>������</title>
</head>
<frameset rows="105,*" border="2" bordercolor="#FFFFFF">
		<frame src="web/main_LOGO.jsp" noresize="noresize"/>
		<frame src="web/main_AO.jsp" name="down" noresize="noresize" />
</frameset><noframes></noframes>


</html>
