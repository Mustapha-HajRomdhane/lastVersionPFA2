<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> Hello </h1>

<a href="index.jsp">Client Info </a> <br>
<a href="./AllPersonne">All Personnes </a>

<form action="index" method="post">
<table>
<tr><td>nom :</td><td><input type="text" name="nom" value="${personne.nom}"></td></tr>
<tr><td>lastname:</td><td> <input type="text" name="prenom" value="${personne.prenom}"></td></tr>
<tr><td>cin : </td><td><input type="text" name="cin" value="${personne.cin}"></td></tr>

<tr>
 <td><input type="submit" name="button" value="ADD">
  <input type="submit" name="button" value="UPDATE"></td>
</tr>

</table>
</form>
 


</body>
</html>