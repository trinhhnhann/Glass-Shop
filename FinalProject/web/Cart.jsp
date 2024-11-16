<%@page import="Invoice.InvoiceInfo"%>
<%@page import="Invoice.InvoiceDAO"%>
<%@page import="java.util.Random"%>
<%@page import="Account.UserInfo"%>
<%@page import="Cart.CartInfo"%>
<%@page import="java.util.List"%>
<%@page import="Cart.CartDAO"%>
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
        <link href="CSS/Cart.css" rel="stylesheet" type="text/css"/>
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
                <p>Home / Shop / Cart</p>
            </div>
        </form>
        <div class="container my-5">
            <%
                UserInfo loginUser = (UserInfo) session.getAttribute("loggedUser");
                List<CartInfo> cartList = null;
                float totalCost = 0;
                String invId = null;
                boolean invoiceExists = false;
                if (loginUser != null) {
                    CartDAO cartDAO = new CartDAO();
                    String userID = loginUser.getUserId();
                    cartList = (List<CartInfo>) cartDAO.getListCart(userID);
                    session.setAttribute("cartList", cartList);
                    if (cartList == null) {
                        invId = (String) session.getAttribute("invId");
                    }
                    if (invId == null) {
                        invId = "INV-" + new Random().nextInt(10000);
                        session.setAttribute("invId", invId);
                    }
                    InvoiceDAO dao = new InvoiceDAO();
                    invoiceExists = dao.checkInvoice(invId);

                    if (cartList != null) {
                        for (CartInfo cart : cartList) {
                            cart.setInvId(invId);
                            cartDAO.updateInvId(cart);
                            totalCost += cart.getTotalprice();
                        }
                    }
            %>
            <div class="table-responsive">
                <table class="table table-bordered">
                    <thead class="table-light">
                        <tr>
                            <th>IMAGE</th>
                            <th>PRODUCT</th>
                            <th>PRICE</th>
                            <th>QUANTITY</th>                
                            <th>TOTAL</th>                
                            <th>REMOVE</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            for (CartInfo cart : cartList) {
                        %>
                    <form action="Controller" method="post">
                        <tr>
                            <td><img src="<%=cart.getImage()%>" alt="Image" class="img-fluid cart-img"></td>
                            <td><%=cart.getGlassId()%></td>
                            <td><%=cart.getPrice()%> $</td>
                            <td>
                                <input type="number" name="quantity" value="<%=cart.getQuantity()%>" min="1" class="form-control">
                                <input type="hidden" name="cartId" value="<%=cart.getCardId()%>">
                                <input type="submit" value="UPDATE QUANTITY" name="action" class="btn btnn  mt-2"/>
                            </td>
                            <td><%=cart.getTotalprice()%> $</td>
                            <td><input type="submit" value="X" name="action" class="btn btn-danger"/></td>
                        </tr>
                    </form>
                    <%
                        }
                    %>
                    </tbody>
                </table>
            </div>
            <form action="Controller" method="post" class="d-inline">
                <input type="submit" value="CONTINUE SHOPPING" name="action" class="btn btn-outline-dark"/>
            </form>
            <div class="text-end mt-4">
                <h3>CART TOTALS</h3>
                <p>Total: $<%= totalCost%></p>

                <%
                    if (!invoiceExists && totalCost > 0) {
                        InvoiceInfo invoice = new InvoiceInfo();
                        invoice.setInvId(invId);
                        invoice.setUserId(loginUser.getUserId());
                        invoice.setTotal(totalCost);
                        invoice.setDateBuy("null");
                        invoice.setGmail("null");
                        invoice.setAddress("null");
                        session.setAttribute("invoice", invoice);
                %>
                <a href="Invoice.jsp" class="btn btn-success">GO TO CHECKOUT</a>
                <%
                    } else {
                        request.setAttribute("message", "Cannot checkout");
                    }
                %>
            </div>
            <%
                }
            %>
            <%
                String message = (String) request.getAttribute("message");
                if (message == null) {
                    message = "";
                }
            %>
            <div>
                <h6 style="color: red;"><%= message%></h6>
            </div>  
            <%
                String success = (String) request.getAttribute("success");
                if (success == null) {
                    success = "";
                }
            %>
            <div>
                <h6 style="color: green;"><%= success%></h6>
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
