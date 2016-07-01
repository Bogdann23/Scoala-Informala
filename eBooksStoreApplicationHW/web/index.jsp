<%-- 
    Document   : index
    Created on : Jun 29, 2016, 10:53:12 PM
    Author     : Bogdan
--%>
<!DOCTYPE html>
<html>
    <head>
        <title>Electronic Books Store</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" type="text/css" href="./eBooksStoreApplicationHW.css">
    </head>
    <body>
        <h3> eBooksStore application</h3>  
        <br>
        <!-- usage of a servlet, i9n our case index, to process pushing of buttons -->
        <form action="${pageContext.request.contextPath}/index" method="post">
            <table class="tablewithborder">
                
                <tr><td class="tdc"><input type="submit" class="btn" name="mainpage_newebook" value="Insert EBook"></td></tr>
                <tr><td class="tdc"><input type="submit" class="btn" name="mainpage_updateebook" value="UpdateEBook"></td></tr>
                <tr><td class="tdc"><input type="submit" class="btn" name="mainpage_deleteebook" value="DeleteEBook"></td></tr>
                <tr><td class="tdc"><input type="submit" class="btn" name="mainpage_displayebooks" value="ReportAllEBooks" size="30"></td></tr>
                <tr><td class="tdc"><input type="submit" class="btn" name="mainpage_exit" value=" Exit" size="40"></td></tr>
            </table>
            <br>
        </form>
       