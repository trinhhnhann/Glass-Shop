/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Cart.CartDAO;
import Cart.CartInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nhana
 */
public class AddToCartServlet extends HttpServlet {

    private static final String ERROR="ProductListServlet";
    private static final String SUCCESS="ProductListServlet";
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
        String url= ERROR;
        String userId = request.getParameter("userId");
        String glassId = request.getParameter("glassId");
        String cartId = "C" + new Random().nextInt(1000);
        String invId = request.getParameter("invId");
        float price = Float.parseFloat(request.getParameter("price"));
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        float totalPrice = price*quantity;
        String image = request.getParameter("image");
        try {
        CartDAO dao = new CartDAO();
        CartInfo existingCart = dao.getCartByGlassesId(glassId,userId);
        if (existingCart != null) {
            existingCart.setQuantity(existingCart.getQuantity() + quantity);
            existingCart.setTotalprice(price*existingCart.getQuantity());
            boolean check = dao.updateCart(existingCart);
            if (check) {
                request.setAttribute("message", "Updated quantity of item in cart successfully.");
            } else {
                request.setAttribute("message", "Failed to update quantity of item.");
            }
        } else {
            existingCart = new CartInfo(cartId,glassId,userId,invId, price, quantity, totalPrice, image);
            boolean check = dao.addToCart(existingCart);
            if (check) {
                url = SUCCESS;
                request.setAttribute("message", "Add to cart successfully.");
            } else {
                request.setAttribute("message", "Failed to add to cart.");
            }
        }      
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("MESSAGE", "An error occurred: " + e.getMessage());
        } finally {
            request.getRequestDispatcher(SUCCESS).forward(request, response);
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
