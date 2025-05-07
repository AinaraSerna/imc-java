<%-- 
    Document   : index
    Created on : 7 may 2025, 20:11:23
    Author     : ainar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Calcula tu IMC</h1>
        <form action="ServletIMC" method="POST">
            <label for="peso">Peso: </label>
            <input type="number" name="peso" step=".01"><br>
            <label for="altura">Altura: </label>
            <input type="number" name="altura" step=".01"><br><br>
            <button type="submit" value="Enviar">Enviar</button>
        </form>
    </body>
</html>
