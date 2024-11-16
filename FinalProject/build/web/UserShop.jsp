<%-- 
    Document   : UserShop
    Created on : Jun 16, 2024, 4:22:02 AM
    Author     : nhana
--%>

<%@page import="Account.UserInfo"%>
<%@page import="Product.ProductInfo"%>
<%@page import="java.util.List"%>
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
        <title>USER PAGE</title>
        <link href="CSS/UserShop.css" rel="stylesheet" type="text/css"/>
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
                <div class="col-md-1">
                    <a href="AccountUser.jsp" class="action-link a">
                        <img src="IMG/INTRO/AccountIcon.jpg" alt="Account">
                    </a>
                </div>
                <div class="col-md-1">
                    <a href="Cart.jsp" class="action-link b">
                        <img src="IMG/INTRO/CartIcon.jpg" alt="Cart">
                    </a>
                </div>
            </div>
        </div>
        <form action="Controller" method="post">
            <nav class="navbar navbar-expand-lg navbar-light bg-light">
                <div class="collapse navbar-collapse navb" id="navbarNav">
                    <ul class="navbar-nav">
                        <li class="nav-item">
                            <a class="nav-link" href="UserScreen.jsp">HOME</a>
                        </li>
                        <li class="nav-item dropdown">
                            <input class="dropbtn" type="submit" name="action" value="SHOP"/>
                            <div class="dropdown-content">
                                <input type="submit" name="action" value="WOMEN GLASSES"/>
                                <input type="submit" name="action" value="MEN GLASSES"/>
                                <input type="submit" name="action" value="SUN GLASSES"/>
                            </div>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="AboutShop.jsp">ABOUT</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="AccountUser.jsp">ACCOUNT</a>
                        </li>
                    </ul>
                </div>
            </nav>
        </form>
        <form action="Controller" method="post">
            <div class="tag">
                <p>Home / Shop</p>
            </div>
        </form>
        <div class="container">
            <div class="row menu">
                <div class="col-lg-3 task">
                    <div class="cate">
                        <form action="Controller" method="post">

                            <h5>CATEGORIES</h5>
                            <input type="submit" name="action" value="MEN GLASSES"/>
                            <br><input type="submit" name="action" value="WOMEN GLASSES"/>
                            <br><input type="submit" name="action" value="SUN GLASSES"/>
                            <br><input type="submit" name="action" value="ALL GLASSES"/>

                        </form>
                    </div>
                    <div class="fill">
                        <form action="Controller" method="post">

                            <h5>FILTER BY PRICE</h5>
                            Min Price:
                            <input type="number" min="0" name="minPrice" />
                            Max Price:
                            <input type="number" min="0" name="maxPrice" />
                            <br><input type="submit" value="Filter" name="action" /><br/>

                        </form>
                    </div>
                </div>
                <div class="col-lg-9">
                    <div class="row">
                        <%
                            UserInfo loginUser = (UserInfo) session.getAttribute("loggedUser");
                            if (loginUser != null) {
                                List<ProductInfo> list = (List<ProductInfo>) request.getAttribute("data");
                                if (list != null) {
                                    for (ProductInfo i : list) {
                        %>
                        <div class="col-md-4 mb-4">
                            <form action="Controller" method="POST" class="card">
                                <img src="<%=i.getImage()%>" class="card-img-top">
                                <div class="card-body">
                                    <h5 class="card-title"><%=i.getGlassName()%></h5>
                                    <p class="card-text"><%=i.getDescription()%></p>
                                    <p class="card-text-price" >$<%=i.getPrice()%></p>
                                    <input type="hidden" name="invId" value="null">
                                    <input type="hidden" name="quantity" value="1">
                                    <input type="hidden" name="glassName" value="<%=i.getGlassName()%>">
                                    <input type="hidden" name="description" value="<%=i.getDescription()%>">
                                    <input type="hidden" name="price" value="<%=i.getPrice()%>">
                                    <input type="hidden" name="type" value="<%=i.getType()%>">
                                    <input type="hidden" name="glassId" value="<%=i.getGlassId()%>">
                                    <input type="hidden" name="status" value="<%=i.getStatus()%>">
                                    <input type="hidden" name="image" value="<%=i.getImage()%>">
                                    <input type="hidden" name="userId" value="<%=loginUser.getUserId()%>">
                                    <button type="submit" name="action" value="ADD TO CART" class="btn ">ADD TO CART</button>
                                </div>
                            </form>
                        </div>
                        <%
                            }
                        } else {
                        %>
                        <h3>No results found</h3>
                        <%
                                }
                            }
                        %>
                    </div>
                </div>
            </div>
        </div>
        <footer class="text-center text-lg-start text-muted footer">
            <section class="d-flex justify-content-center justify-content-lg-between p-4 border-bottom">
                <div></div>
            </section>
            <section class="">
                <div class="container text-center text-md-start mt-5">
                    <div class="row mt-3">
                        <div class="col-md-3 col-lg-4 col-xl-3 mx-auto mb-4">
                            <h6 class="text-uppercase fw-bold mb-4">
                                ENTY GLASSES
                            </h6>
                            <p>
                                Whether you are looking for a professional look for the office, a funky pair for the weekends, or a sturdy set for outdoor activities, we have got you covered.
                            </p>
                        </div>
                        <div class="col-md-3 col-lg-2 col-xl-2 mx-auto mb-4">
                            <h6 class="text-uppercase fw-bold mb-4">
                                ABOUTS
                            </h6>
                            <form action="Controller" method="post">
                                <input type="submit" name="action" class="btn btn-link p-0 text-dark" value="WOMEN GLASSES"/>
                                <input type="submit" name="action" class="btn btn-link p-0 text-dark" value="MEN GLASSES"/>
                                <input type="submit" name="action" class="btn btn-link p-0 text-dark" value="SUN GLASSES"/>
                                <br><a href="AboutShop.jsp">ABOUT</a>
                            </form>
                        </div>
                        <div class="col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4">
                            <h6 class="text-uppercase fw-bold mb-4">Contact</h6>
                            <p><i class="fa fa-home me-3"></i> FPT Universary, HCM Campus.</p>
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
