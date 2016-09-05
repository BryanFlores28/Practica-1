<%-- 
    Document   : registroMatricula
    Created on : 05/09/2016, 11:49:10 AM
    Author     : lalap
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Matricula</title>
    </head>
    <body>
        <h1>Registro de Matricula</h1>
        
        <label>Nombre:</label>
        <span>${user.firstName}</span><br>
        
        <form action="" method="get">
            <input type="hidden" name="action" value="join">
        </form>
    </body>
</html>
