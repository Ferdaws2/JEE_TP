<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Inscription</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Style/inscription.css" />
</head>
<body>
	
	<div>
	  <form action="inscription" method="POST">
	    <label for="id">N°Club</label>
	    <input type="text" id="id" name="clubId" disabled value="${clubId}">
	
	    <label for="lname">Nom</label>
	    <input type="text" id="lname" name="lastname" placeholder="Nom abonné">
	    
	    <label for="lfname">Prénom</label>
	    <input type="text" id="lfname" name="firstname" placeholder="Prénom abonné">
	    <input type="submit" value="S'Inscrire">
	  </form>
	</div>
</body>
</html>