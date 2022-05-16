<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <html>

        <head>
            <title>Clubs de l'ESI</title>
            <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/Style/index.css" />
        </head>

        <body>
            <div class="header">
            	<h1 class="header-title">Inscription aux Clubs de l'ESI</h1> 	
            </div>
            
            <table class="table-result">
                        <thead class="table-header">
                            <tr>
                                <th class="club-id">N°Club</th>
                                <th class="club-id">Nom club</th>
                                <th class="club-id">Nom Président</th>
                                <th class="club-id">Date création</th>
                                <th class="club-id">Actions</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!--   for (Todo todo: todos) {  -->
                            <c:forEach var="club" items="${clubList}">

                                <tr class="table-row">
                                    <td class="club-id">
                                        <c:out value="${club.idClub}" />
                                    </td>
                                    <td>
                                        <c:out value="${club.nomClub}" />
                                    </td>
                                    <td>
                                        <c:out value="${club.nomPresident}" />
                                    </td>
                                    <td>
                                        <c:out value="${club.dateCreation}" />
                                    </td>
                                    <td>
                                    	<c:choose>
                                    		<c:when test="${club.status == false}">
                                    			<a class="inscription-link" href="inscription?idClub=<c:out value='${club.idClub}' />">[ S'Inscrire ]</a> 
                                    		</c:when>
                                    		<c:when test="${club.status == true}">
                                    			<a class="inscription-link" href="DesabonnementController?idClub=<c:out value='${club.idClub}' />">[ Se désabonner ]</a> 
                                    		</c:when>
                                    	</c:choose>
                                    </td>
                                </tr>
                            </c:forEach>
                            <!-- } -->
                        </tbody>
                    </table>
        </body>

        </html>