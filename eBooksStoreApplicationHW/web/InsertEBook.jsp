<%-- 
    Document   : InsertEBook
    Created on : Jun 30, 2016, 10:24:43 PM
    Author     : Bogdan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="./eBooksStoreApplicationHW.css"> 
        <title>Insert EBook</title>
    </head>
    <body>
        <h1>InsertEBook</h1><br>
        <form action="${pageContext.request.contextPath}/insertebook" method="put">
            <table>
                <tr><td>I.S.B.N.:</td><td><input type="text" name="inputform_newebook_ISBN"></input></td></tr>
                <tr><td>Title:</td><td><input type="text" name="inputform_newebook_title"></input></td></tr>
                <tr><td>Authors:</td><td><input type="text"name="inputform_newebook_authors"></input></td></tr>
                <tr><td>Devices:</td><td><input type="text"name="inputform_newebook_devices"></input></td></tr>
                <tr><td>Price:</td><td><input type="text"name="inputform_newebook_price"></input></td></tr>
            </table>
            <input type="submit" class="btn" value="Save" name="inputform_save">
        </form>
    </body>
</html>
