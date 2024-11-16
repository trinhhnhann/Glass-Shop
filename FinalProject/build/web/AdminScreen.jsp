<%-- 
    Document   : AdminScreen
    Created on : Jun 19, 2024, 4:14:34 AM
    Author     : nhana
--%>

<%@page import="Account.UserInfo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css"
              integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ADMIN PAGE</title>
        <link href="CSS/UserScreen.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="row head clo-md-12">
            <div class="col-md-4 headsearch">
                <img src="IMG/INTRO/FindIcon.jpg" alt="Search" class="search-icon">
                <input type="text" placeholder="Search" class="search-input">
            </div>
            <div class="col-md-4 headname">
                <a href="AboutShop.jsp">
                    <h2>ENTY GLASSES</h2>
                </a>
            </div>
            <div class="col-md-4 headact">
                <div class="col-md-2">
                    <form action="Controller" method="post" class="logout-form">
                        <input type="submit" class="btn btn-link p-0 text-dark" name="action" value="LOG OUT">
                    </form>
                </div>
                <div class="col-md-2">
                    <a href="AccountUser.jsp" class="action-link a">
                        <img src="IMG/INTRO/AccountIcon.jpg" alt="Account">
                    </a>
                </div>
                
            </div>
        </div>
        <form action="Controller" method="post">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="navbar">
                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" href="AdminScreen.jsp">HOME</a>
                    </li>
                    <li class="nav-item dropdown">
                        <input class="dropbtn" type="submit" name="action" value="GLASSES"/>
                        <div class="dropdown-content">
                            <input type="submit" name="action" value="WOMEN GLASSES"/>
                            <input type="submit" name="action" value="MEN GLASSES"/>
                            <input type="submit" name="action" value="SUN GLASSES"/>
                        </div>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="AddProduct.jsp">ADD NEW PRODUCT</a>
                    </li>
                    <% UserInfo loginUser = (UserInfo) session.getAttribute("loggedUser");
                        if (loginUser != null) {
                            int roleId = loginUser.getRoleId();
                        if (roleId == 2) { %>    
                    <li class="nav-item">
                        <a class="nav-link" href="AdminError.jsp">MANAGE USER</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="AdminError.jsp">MANAGE INVOICE</a>
                    </li>
                    <% } else if (roleId == 3) { %>
                    <li class="nav-item">
                        <input class="dropbtn" type="submit" name="action" value="MANAGE USER"/>
                    </li>
                    <li class="nav-item">
                        <input class="dropbtn" type="submit" name="action" value="MANAGE INVOICE"/>
                    </li>
                    <% }
                        } else {
                            response.sendRedirect("Login.jsp");
                    }%>
                </ul>
            </div>
                </nav>
        </form>

        <div class="row clo-lg-12 int">
            <div class="col-lg-6 ima">
                <img src="IMG/INTRO/AdminScreen.jpg" alt=""/>
            </div>
            <div class="col-lg-6 des">
                <h2 id="intr">Finding Your Perfect Glass</h2>
                <p>Welcome to Enty Glasses! We believe that the right pair of glasses can not only improve your vision,
                    but also express your unique personality and style. Whether you are looking for a professional look
                    for the office, a funky pair for the weekends, or a sturdy set for outdoor activities, we have got
                    you covered.</p>
            </div>
        </div>
        <footer class="text-center text-lg-start text-muted footer" >
            <section class="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">
                <div>
                </div>
            </section>
            <section class="">
                <div class="container text-center text-md-start mt-5">
                    <div class="row mt-3">
                        <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
                            <h6 class="text-uppercase fw-bold mb-4">
                                ENTY GLASSES
                            </h6>
                            <p>
                                Whether you are looking for a professional look
                                for the office, a funky pair for the weekends, or a sturdy set for outdoor activities, we
                                have got
                                you covered.
                            </p>
                        </div>
                        <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
                            <h6 class="text-uppercase fw-bold mb-4">
                                ABOUTS
                            </h6>
                            <form action="Controller" method="post">
                                <input type="submit" name="action" class="btn btn-link p-0 text-dark" value="WOMEN GLASSES"/></li>
                                <input type="submit" name="action" class="btn btn-link p-0 text-dark" value="MEN GLASSES"/></li>
                                <input type="submit" name="action" class="btn btn-link p-0 text-dark" value="SUN GLASSES"/></li>                            
                                <br><a href="AboutShop.jsp">ABOUT</a>
                            </form>
                        </div>
                        <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
                            <h6 class="text-uppercase fw-bold mb-4">Contact</h6>
                            <p><i class="fa fa-home me-3"> </i> FPT Universary, HCM Campus.</p>
                            <p>
                                <i class="fas fa-envelope me-3"></i>
                                nhantttse180345@fpt.edu.vn
                            </p>
                            <p><i class="fas fa-phone me-3"></i> 0974969904</p>
                            <p><i class="fas fa-print me-3"></i> 0347060426</p>
                        </div>
                    </div>
                </div>
            </section>
        </footer>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

    </body>
</html>
