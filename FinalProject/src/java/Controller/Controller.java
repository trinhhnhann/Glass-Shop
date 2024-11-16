/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nhana
 */
public class Controller extends HttpServlet {

    private static final String REGISTER = "REGISTER";
    private static final String ADDACCOUNT_CONTROLLER = "AddAccountController";
    private static final String LOGIN = "Login";
    private static final String LOGIN_CONTROLLER = "LoginServlet";
    private static final String LOGOUT = "LOGOUT";
    private static final String LOGOUT_CONTROLLER = "LogoutServlet";
    private static final String SEARCH = "Search";
    private static final String SEARCH_CONTROLLER = "SearchServlet";
    private static final String SEARCHPRICE = "Filter";
    private static final String SEARCHPRICE_CONTROLLER = "SearchByPrice";

    private static final String SHOP = "SHOP NOW";
    private static final String SHOP_CONTROLLER = "ProductListServlet";
    private static final String SHOPP = "SHOP";
    private static final String SHOPP_CONTROLLER = "ProductListServlet";
    private static final String SHOPWOMEN = "WOMEN GLASSES";
    private static final String SHOPWOMEN_CONTROLLER = "ProductListOfWomen";
    private static final String SHOPMEN = "MEN GLASSES";
    private static final String SHOPMEN_CONTROLLER = "ProductListOfMen";
    private static final String SHOPSUN = "SUN GLASSES";
    private static final String SHOPSUN_CONTROLLER = "ProductListOfSun";
    private static final String ALLGLASSES = "ALL GLASSES";
    private static final String ALLGLASSES_CONTROLLER = "ProductListServlet";

    private static final String UPDATEUSER = "UPDATE USER";
    private static final String UPDATEUSER_CONTROLLER = "UpdateAccountUser";

    private static final String ADMINSHOP = "GLASSES";
    private static final String ADMINSHOP_CONTROLLER = "ShopFOrAdmin";
    private static final String UPDATESHOP = "UPDATE GLASS";
    private static final String UPDATESHOP_CONTROLLER = "UpdateGlassServlet";
    private static final String ADDPRODUCT = "CREATE";
    private static final String ADDPRODUCT_CONTROLLER = "AddProductServlet";
    private static final String DELETEPRODUCT = "Delete";
    private static final String DELETEPRODUCT_CONTROLLER = "DeleteGlassServlet";

    private static final String MANAGEUSER = "MANAGE USER";
    private static final String MANAGEUSER_CONTROLLER = "UserList";
    private static final String UPDATEUSERBYADMIN = "UPDATE";
    private static final String UPDATEUSERBYADMIN_CONTROLLER = "UpdateUserByAdmin";
    private static final String SEARCHUSERBYADMIN = "Search by Full Name";
    private static final String SEARCHUSERBYADMIN_CONTROLLER = "SearchUserByFullName";
    private static final String MANAGEINVOICE = "MANAGE INVOICE";
    private static final String MANAGEINVOICE_CONTROLLER = "InvoiceListServlet";

    
    private static final String ADDTOCART = "ADD TO CART";
    private static final String ADDTOCART_CONTROLLER = "AddToCartServlet";
    private static final String UPDATECART = "UPDATE QUANTITY";
    private static final String UPDATECART_CONTROLLER = "UpdateQuantityCartServlet";
    private static final String REMOVECART = "X";
    private static final String REMOVECART_CONTROLLER = "RemoveFromCart";
    private static final String CONTINUESHOPPING = "CONTINUE SHOPPING";
    private static final String CONTINUESHOPPING_CONTROLLER = "ProductListServlet";
    
    private static final String PLACEORDER = "PLACE ORDER";
    private static final String PLACEORDER_CONTROLLER = "AddInvoiceServlet";
    
    private static final String BACKTOSHOP = "BACK TO SHOP";
    private static final String BACKTOSHOP_CONTROLLER = "ProductListServlet";
    
    private static final String ERROR = "Login.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String action = request.getParameter("action");
            if (REGISTER.equals(action)) {
                url = ADDACCOUNT_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (LOGIN.equals(action)) {
                url = LOGIN_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (LOGOUT.equals(action)) {
                url = LOGOUT_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (SHOP.equals(action)) {
                url = SHOP_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (SHOPP.equals(action)) {
                url = SHOPP_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (SHOPWOMEN.equals(action)) {
                url = SHOPWOMEN_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (SHOPMEN.equals(action)) {
                url = SHOPMEN_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (SHOPSUN.equals(action)) {
                url = SHOPSUN_CONTROLLER;
            }
            if (UPDATEUSER.equals(action)) {
                url = UPDATEUSER_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (SEARCH.equals(action)) {
                url = SEARCH_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (SEARCHPRICE.equals(action)) {
                url = SEARCHPRICE_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (UPDATESHOP.equals(action)) {
                url = UPDATESHOP_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (ADMINSHOP.equals(action)) {
                url = ADMINSHOP_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (ADDPRODUCT.equals(action)) {
                url = ADDPRODUCT_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (MANAGEUSER.equals(action)) {
                url = MANAGEUSER_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (UPDATEUSERBYADMIN.equals(action)) {
                url = UPDATEUSERBYADMIN_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (ADDTOCART.equals(action)) {
                url = ADDTOCART_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (UPDATECART.equals(action)) {
                url = UPDATECART_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (REMOVECART.equals(action)) {
                url = REMOVECART_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (CONTINUESHOPPING.equals(action)) {
                url = CONTINUESHOPPING_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (BACKTOSHOP.equals(action)) {
                url = BACKTOSHOP_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (PLACEORDER.equals(action)) {
                url = PLACEORDER_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (MANAGEINVOICE.equals(action)) {
                url = MANAGEINVOICE_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (ALLGLASSES.equals(action)) {
                url = ALLGLASSES_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
            if (DELETEPRODUCT.equals(action)) {
                url = DELETEPRODUCT_CONTROLLER;
            } else {
                request.setAttribute("ERROR", "Your action not support");
            }
        } catch (Exception e) {
            log("Error at MainController: " + e.toString());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
