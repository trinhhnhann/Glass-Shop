<%-- 
    Document   : Invoice
    Created on : Jun 22, 2024, 11:36:22 PM
    Author     : nhana
--%>

<%@page import="Invoice.InvoiceInfo"%>
<%@page import="Cart.CartInfo"%>
<%@page import="java.util.List"%>
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
        <title>USER PAGE</title>
        <link href="CSS/Invoice.css" rel="stylesheet" type="text/css"/>
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
                <p><b>Home / Shop / Cart / Checkout</b></p>
            </div>
        </form>





        <form action="AddInvoiceServlet" method="post">
            <div class="row bilorr">
                <div class="col-lg-6 mb-4 login-container">
                    <h3>Billing Details</h3>
                    <div>
                        <%
                            UserInfo loginUser = (UserInfo) session.getAttribute("loggedUser");
                            InvoiceInfo invoice = (InvoiceInfo) session.getAttribute("invoice");

                        %>
                        <br>Invoice ID:
                        <br><input type="text" name="invId" value="<%=invoice.getInvId()%>" readonly>
                        <br> User ID:
                        <br> <input type="text" name="userId" value="<%=loginUser.getUserId()%>" readonly>
                        <br> Date of Purchase:
                        <br><input type="datetime-local" name="dateBuy">
                        <br> Email <span style="color:red">*</span><br>
                        <input type="email" name="email" value="<%=loginUser.getGmail()%>"/><br>
                        Address <span style="color:red">*</span><br>
                        <input type="text" name="address" value="<%=loginUser.getAddress()%>"/><br>
                    </div>
                </div>
                <div class="col-lg-6 mb-4 bill">
                    <div>
                        <h3>Your Order</h3>
                    </div>
                    <div class="tab">
                        <table class="table site-block-order-table mb-5">
                            <thead class="table-light">
                            <th>Product</th>
                            <th>Total</th>
                            </thead>
                            <tbody>
                                <%
                                    List<CartInfo> cartList = (List<CartInfo>) session.getAttribute("cartList");
                                    float totalCost = 0;
                                    for (CartInfo cart : cartList) {
                                        totalCost += cart.getTotalprice();
                                %>
                                <tr>
                                    <td><%=cart.getGlassId()%> <strong class="mx-2">x</strong> <%=cart.getQuantity()%></td>
                                    <td>$<%=cart.getTotalprice()%></td>

                                </tr>
                                <%
                                    }
                                %>
                                <tr>
                                    <td><strong>Order Total</strong></td>
                                    <td><strong>$<%=totalCost%></strong></td>
                                </tr>
                                <tr>
                                    <%
                                        if (totalCost >= 500 && totalCost <= 799) {
                                            totalCost = totalCost / 100 * 95;
                                    %>
                                    <td>Voucher: 5% </td>
                                    <td><b style="color:green">$<%=totalCost%></b></td>
                                    <% } else if (totalCost >= 800 && totalCost <= 999) {
                                        totalCost = totalCost / 100 * 90;
                                    %>
                                    <td>Voucher: 10% </td>
                                    <td><b style="color:green">$<%=totalCost%></b></td>
                                    <% } else if (totalCost >= 1000) {
                                        totalCost = totalCost / 100 * 85;
                                    %>
                                    <td><b style="color:#F0A963 ">Voucher: 15% </b></td>
                                    <td><b style="color:green">$<%=totalCost%></b></td>
                                    <% }%>
                                </tr>
                            <input type="hidden" name="total" value="<%=totalCost%>">

                            </tbody>
                        </table>
                        <input type="submit" name="action" class="ord" value="PLACE ORDER"/>
                    </div>
                </div>
            </div>
        </form>

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
