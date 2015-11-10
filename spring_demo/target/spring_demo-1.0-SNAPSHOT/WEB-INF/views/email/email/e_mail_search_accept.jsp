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
<script type="text/javascript">

function deleteemail_1(send_person,send_time){
	var b = confirm("确认要这封邮件吗？");
	alert(b.valueOf());
	
	if( b==true ){
		//document.
		document.getElementById("delete_email").action="deletepersonalacceptemail?sendperson=send_person&sendtime=send_time";
     
   	 	document.getElementById("delete_email").submit();
	}
}

</script>
<style>

.dd{
margin-left:10%;
font-size:12px;
margin-top:8px;

}

</style>
<body>
		
			<form action="personalemailacceptdetail" id ="delete_email" method="post">
		
		<div >
		<div class="c2">
			<div align="left" style="float:left;">
				
				<a href="web/e_mail_welcome.jsp"><input type="button" style="cursor:pointer" value="返回"></a>
				<a href=""><input type="button"  value="收件查看"></a>
				
				
			</div>
			<div style="float:left"class = "dd"><table align="center"> <tr> 共${totalP}页   &nbsp; &nbsp; 当前在${curP}页 </tr></table>  </div>
			<div align="center"  style="float:none">
				<a href="emailsearchaccept?curp=1"><input type="button" name ="up" style="cursor:pointer"value="首页"/></a>
				<a href="emailsearchaccept?curp=${curP-1}"><input type="button" name ="up" style="cursor:pointer"value="上一页"/></a>
				<a href="emailsearchaccept?curp=${curP+1}"><input type="button" name="next" style="cursor:pointer" value="下一页"></a>
				<a href="emailsearchaccept?curp=${totalP}"><input type="button" name="next" style="cursor:pointer" value="尾页"></a>
			</div>
			
			<div class="acceptbox">
			<table border="1" cellpadding="0" cellspacing="0" >
				<tr >
					
					<th width="100px">发件人</th>
					<th width="400px">主题</th>
					<th width="150px">时间</th>
					<th width="70px">操作</th>
				</tr>
				
				<%  
				
				 
				ArrayList<Email> personalemail = (ArrayList<Email>)request.getAttribute("personalemailaccept"); 
				
					int i = 0;
					for(Email email:personalemail){
					i = i + 1;
				
				%>
				<tr  class="t1">
					
					<td> <input type = "hidden" name="accept_person_id<%=i %>" id="accept_person_id"  value="<%=email.getAccept_person_id()%>"><%=email.getAccept_person_id()%></td>
					<td><%=email.getE_mail_theme() %></td>
					<td> <input type = "hidden" name="send_time<%=i %>" id="send_time" value="<%=email.getSend_time()%>"><%=email.getSend_time() %></td>
				    <td>
				    	<a href="personalemailacceptdetail?sendperson=<%=email.getAccept_person_id()%>&sendtime=<%=email.getSend_time()%>
				    		&atuosend=<%=email.isAtuosend()%>&sendoraccept=<%=email.isSendoraccept()%>&emailid=<%=email.getE_mail_id()%>"><input type="button"style="cursor:pointer" value="查看"/></a>
				    
				    </td>
				    
				</tr>
				<%} %>
				
				
			</table>
			</div>
			</div>
		</div>
	</form>
</body>
</html>
