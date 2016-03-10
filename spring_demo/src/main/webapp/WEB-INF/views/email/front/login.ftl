<!DOCTYPE html>
<html lang="zh">
<head>
<meta charset="utf-8">

<meta name="viewport" content="width=device-width, initial-scale=1" />
<title>身份认证</title>

<link href="/css/bootstrap.min.css" rel="stylesheet">
<link href="/css/bootstrap-theme.min.css" rel="stylesheet">
<link href="/css/system.css" rel="stylesheet">
<script type="text/javascript" src="/js/md5.js"></script>
</head>
<script type="text/javascript" src="/js/jquery-1.11.1.min.js">
function show(){
	alert("若无法登录系统请于管理员联系！");
}

function check(){
    var input = document.getElementById("password");
    var name = input.value;
    var password = hex_md5(name);
    document.getElementById("password").value = password;
    document.login.action="/web/front/login";
    document.login.submit();
}

function changeImg() {
    var imgSrc = $("#imgObj");
    var src = imgSrc.attr("src");
    imgSrc.attr("src", chgUrl(src));
}
//时间戳
//为了使每次生成图片不一致，即不让浏览器读缓存，所以需要加上时间戳
function chgUrl(url) {
    var timestamp = (new Date()).valueOf();
    url = url.substring(0, 17);
    if ((url.indexOf("&") >= 0)) {
        url = url + "×tamp=" + timestamp;
    } else {
        url = url + "?timestamp=" + timestamp;
    }
    return url;
}
</script>
<body class="cas zh " >

<div class="container">
			<div class="login">
				<div class="heading" >
					<h2 style="color:#000000">欢迎来到您的安全邮箱系统</h2>
					<h4>让我们先确认您的个人身份和账户安全</h4>
				</div>
				<div class="square-gradient-bar">
					<div class="bar left one"></div>
					<div class="bar two"></div>
					<div class="bar three"></div>
					<div class="bar four"></div>
					<div class="bar five"></div>
					<div class="bar right six"></div>
				</div>
				<div class="well-big square-top">
					<form method="post" name="login" action="/web/front/login" th:action="@{/web/front/login}">
						
						<div class="field">
							<div class="input-group ">
								<span class="input-group-addon">
								<img src="/img/user.jpg">
								</span>
								<input type="text" class="form-control input-lg" name="userId" tabindex="1" placeholder="用户ID"
								value="" data-required="true" />
							</div>
						</div>
						
						<div class="field">
							<div class="input-group ">
								<span class="input-group-addon">
									<img src="/img/password.jpg">
								</span>
								<input type="password" class="form-control input-lg" name="userPw" id="password" tabindex="2" placeholder="密码"
								value="" data-required="true"/>
							</div>
						</div>
						<div class="field">
							<div class="input-group ">
								
								<input type="text" class="form-control input-lg" style="width:150px" name="code" tabindex="1" placeholder="验证码"
								value="" data-required="true" />
								<img title="看不清？换一张" src="code" style="cursor:pointer;margin-left: 20px;" onclick="this.src='code?date='+new Date();"/>
                                <#--<img id="imgObj" alt="验证码" src="code" />-->
                                <#--<a href="#" onclick="changeImg()">换一张</a>-->
							</div>
							
						</div>

						<div class="row">
							<div class="col-6 col-lg-6 col-sm-12">
								<input type="submit" class="button" value="登录" onclick="check()"/>
									
							</div>
							<div class="col-6 col-lg-6 col-sm-12">
								<div class="note">
									<div class="title">是否注册？</div>
									<a href="/web/front/register">注册账号</a>
									
								</div>
							</div>
						</div>
						
					</form>
					
					
		
				</div>
			</div>
  </div> 



</body>
</html>