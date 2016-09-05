<%-- 
    Document   : registroAlumno
    Created on : 05/09/2016, 11:48:50 AM
    Author     : lalap
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Alumno</title>
    </head>
    <body>
        <h1>Registrar Alumno</h1>
        
        <h1>Introduce datos del alumno</h1>
        
        <form action="emailList" method="post">        
        <input type="hidden" name="action" value="add">          
        
        <label class="pad_top">Codigo:</label>        
        <input type="text" name="code" required><br>
        <label class="pad_top">Nombre:</label>        
        <input type="text" name="firstName" required><br>        
        <label class="pad_top">Apellidos:</label>        
        <input type="text" name="lastName" required><br>        
        <label class="pad_top">Email:</label>        
        <input type="email" name="email" required><br>
        
        <label>&nbsp;</label>        
        <input type="submit" value="REGISTRAR ALUMNO" class="margin_left"> 
    </body>
</html>
