<%-- 
    Document   : VueJeu
    Created on : Apr 28, 2016, 7:55:25 PM
    Author     : Ayoub MOUSTAID
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Jeu Hasard</title>
    </head>
    <body>
        <div>
            <form action="controleur" method="post">
                <h2>Le serveur a choisit un nombre entre 1 et 100, pourriez vous le devinner ?</h2>
            <table>
                    <td>Devinnez : </td>
                    <td><input type="text" name="nombre" value="${essaiForm.nombre}"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="essai" name="btn"/></td>
                    <td><input type="submit" value="rejouer" name="btn"/></td>
                </tr>
            </table>
                </form>
        </div>
        <div>
            <c:forEach items="${essaiForm.msgs}" var="i">
                ${i} <br/>
            </c:forEach>
        </div>
    </body>
</html>
