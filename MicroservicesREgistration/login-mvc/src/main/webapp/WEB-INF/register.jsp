Hello data
<%@ page language="java" contentType="text/html;charset=UTF-8"
pageEncoding="UTF-8"%>
<%@taglib prefix ="c" uri= "http://java.sun.com/jsp/jstl/core"%>
<style>



form{

background-color:olive;
width:200px;
height:250px;
border-style:solid;
border:colour:blue;
padding:10px;
}

</style>
<br>

<div >

<form action="/set-user" method="post">  
<div >Name:<input type="text" name="userName" value=""/><br/><br/>  </div >
Password:<input type="password" name="password1" value=""/><br/><br/>  
ReType Password:<input type="password" name="password2" value=""/><br/><br/>  
 
<input type="submit" value="register "style="background-color:orange;"/> 
</form>  
</div >



