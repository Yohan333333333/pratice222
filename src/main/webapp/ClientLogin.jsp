<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript"> 

 function sendit(){
	
 let form = document.loginform;
 let customer_id = form.customer_id;
 let customer_pw = form.customer_pw;

 if(!customer_id.value){
	alert("아이디를 입력하세요");
	customer_id.focus();
	return;
}

if(!customer_pw.value){
	alert("비밀번호를 입력하세요");
	customer_pw.focus();
	return;
}

form.submit();
}
</script>



</head>
<body>
<form action="ClientLogin.do" method="post" name="loginform" id = "loginform">
	
		<p>
			<label>아이디 <input type="text" name="cId" value="${CID}" > </label>
		</p>
		
		<p>
			<label>비밀번호  <input type="password" name="cPw" value="${dto.password }" >  </label>
		</p>
		<input type="submit" value="로그인" onclick="sendit();">
		<%-- <a href="YHlogin.do?id=${dto.id}"><input type="button" value="로그인" onclick="sendit();"></a> --%>
	
	</form>

</body>
</html>