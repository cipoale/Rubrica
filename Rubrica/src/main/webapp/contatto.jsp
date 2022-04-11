<%-- 
    Document   : contatto
    Created on : 6 apr 2022, 11:05:17
    Author     : Aesys
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="com.aesys.rubrica.dao.ConnessioneDao"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>contatto</h1>
        
        <%
            if(session.getAttribute("email")==null){
                response.sendRedirect("index.html");
            }
            
        
        %>
        
        <form action="insert" method="post">
            Nome: <input type="text" name="nome"> <br>
            Cognome: <input type="text" name="cognome"> <br>
            Telefono: <input type="text" name="telefono"> <br>
            <input type="submit" value="Inserisci">
        </form>
        
        
    </body>
</html>
