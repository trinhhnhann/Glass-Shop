<%-- 
    Document   : Register
    Created on : Jun 14, 2024, 2:19:46 AM
    Author     : nhana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Account</title>
        <link href="CSS/Register.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript">  
            function validateForm() {
                var password = document.forms["registerForm"]["password"].value;
                var confirmPassword = document.forms["registerForm"]["confirmPassword"].value;
                if (password !== confirmPassword) {
                    alert("Passwords do not match!");
                    return false;
                }
                return true;
            }
        </script>
    </head>
    <body>
        <h1>ENTY GLASSES</h1>
        <div class="login-container">
            <h2><big>Register Account</big></h2></br>
        <form name="registerForm" action="Controller" method="post" onsubmit="return validateForm()">
            User ID <span style="color:red">*</span><br>
            <input type="text" placeholder="UserID" name="userId" required/><br>
            Full Name <span style="color:red">*</span><br>
            <input type="text" placeholder="Full Name" name="fullName" required/><br>
            Email <span style="color:red">*</span><br>
            <input type="email" placeholder="Email" name="email" required/><br>
            Address <span style="color:red">*</span><br>
            <input type="text" placeholder="Address" name="address" required/><br>
            Password <span style="color:red">*</span><br>
            <input type="password" placeholder="Password" name="password" required/><br>
            Confirm Password <span style="color:red">*</span><br>
            <input type="password" placeholder="Confirm Password" name="confirmPassword" required/><br>
            <input type="hidden" name="roleId" value="1"/> 
            <input type="hidden" name="status" value="1"/> 
            <input type="submit" name="action" value="REGISTER"/>
        </form>
        <%
            String message = (String) request.getAttribute("error");
            if (message == null) {
                message = "";
            }
        %>
        <h6 style="color: red"><%= message%></h6>
        </div>
        <br>
    </body>
</html>
