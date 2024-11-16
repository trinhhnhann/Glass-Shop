<%-- 
    Document   : Login
    Created on : Jun 10, 2024, 2:17:34 AM
    Author     : nhana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LOGIN PAGE</title>
        <link href="CSS/login.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>  
            <h1>ENTY GLASSES</h1></br>
        <div class="login-container">
            <h2><big>LOGIN</big></h2></br>
            <form action="LoginServlet" method="POST">
                User ID or Email <span style="color:red">*</span></br>
                <input type="text" placeholder="UserID or Email" name="userId"/></br>
                Password <span style="color:red">*</span></br> 
                <input type="password" placeholder="Password" name="password"/></br>
                <h6 style="color:red">${requestScope.error}</h6>
                <input type="submit" name="action" value="Login"/>
            </form>
        </div>
    </body>
</html>
