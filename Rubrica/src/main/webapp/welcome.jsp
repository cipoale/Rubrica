<%-- 
    Document   : welcome
    Created on : 6 apr 2022, 10:36:15
    Author     : Aesys
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
            
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            
            if(session.getAttribute("email")==null){
                response.sendRedirect("index.html");
            }
            
        %>
        
        <h1>Contatti: </h1>
        
        <ul>
            <c:forEach items="${persone}" var="persona">
                <li>
                    ${persona}
                </li>
            </c:forEach>
        </ul> 
        

        <a href="contatto.jsp">vai al contatto</a>
        
        <form action="logout" method="get">
            <input type="submit" value="Logout" >
        </form>
        
        <form action="contatto.jsp" method="get">
            <input type="submit" value="Inserisci contatto" >
        </form>
         
    </body>
</html>
