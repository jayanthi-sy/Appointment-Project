Hello data
<%@ page language="java" contentType="text/html;charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<style>



form{

background-color:red;
width:200px;
height:250px;
border-style:solid;
border:colour:blue;
padding:10px;
}

</style>
<br>

<div >

<form action="/login" method="post">  
<div >Name:<input type="text" name="userName" value=""/><br/><br/>  </div >
<div ><br></div  >
<c:if test="${ not empty error}">
<div style="color:blue"><h5>${error}</h5></div >
<div ><br></div >
</c:if >
Password:<input type="password" name="password" value=""/><br/><br/>  
<input type="submit" value="login" style="background-color:green;"/> <br/><br/>
<input type="button" value="register"onClick="goToRegister()" style="background-color:orange;"/> 
</form>  
</div >
<script type= "text/java script">
function gToRegister(){
alert("go to register");
window.location.href="/register";
}
</script>



