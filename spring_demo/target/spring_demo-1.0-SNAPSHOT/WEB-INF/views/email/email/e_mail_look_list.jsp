<%@ page language="java" import="java.util.*,com.email.dto.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>邮件系统</title>
<link href="<%=basePath %>css/e_mail.css" rel="stylesheet" type="text/css">
</head>
<script type="text/javascript" src="../js/total.js">

</script>

<style>

.c2{

width:75%;
height:100%;
margin-left:50px;
padding-left:10px;
}
.dd{
margin-left:10%;
font-size:12px;
margin-top:8px;

}
</style>

<body>
		
			
		
		<div >
		<form action="emailmodelsearchdetail" method="post">
		<div class="c2">
			<div align="left" style="float:left" align="center" class="d9">
				<a href="web/e_mail_welcome.jsp"><input type="button" style="cursor:pointer"value="返回"></a>
				<a href="groupemailsearch"><input type="submit" name="search" style="cursor:pointer"value="查看内容"></a>
			</div>
			
			<div style="float:left"class = "dd"><table align="center"> <tr> 共${totalP}页   &nbsp; &nbsp; 当前在${curP}页 </tr></table>  </div>
			
			<div align="center"  style="float:none">
				<a href="emaillooklist?curp=1"><input type="button" name ="up" style="cursor:pointer"value="首页"/></a>
				<a href="emaillooklist?curp=${curP-1}"><input type="button" name ="up" style="cursor:pointer"value="上一页"/></a>
				<a href="emaillooklist?curp=${curP+1}"><input type="button" name="next" style="cursor:pointer" value="下一页"></a>
				<a href="emaillooklist?curp=${totalP}"><input type="button" name="next" style="cursor:pointer" value="尾页"></a>
			</div>
			
			<div class="acceptbox">
			<table border="1" cellpadding="0" cellspacing="0" >
				<tr >
					<th width="100px">邮件编号</th>
					<th width="500px">主题</th>
					
				</tr>
				<%  
				 request.setCharacterEncoding("utf-8");
				 
				ArrayList<EmailModel> all = (ArrayList<EmailModel>)request.getAttribute("groupemailtheme"); 
				
					
					for(EmailModel al:all){
				
				%>
				<tr  >
					<td><input type="radio" name="emailid" value="<%=al.getE_mail_id() %>"/> <%=al.getE_mail_id() %></td>
					<td> <%=al.getE_mail_theme() %></td>
					
				
				</tr>
				<%} %>
			
			</table>
			</div>
			</div>
			</form>
		</div>
	
</body>
</html>
