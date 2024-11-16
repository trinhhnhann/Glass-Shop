package Controller;

import Cart.CartDAO;
import Cart.CartInfo;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateQuantityCartServlet extends HttpServlet {

    private static final String ERROR = "Cart.jsp";
    private static final String SUCCESS = "Cart.jsp";

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        try {
            String cartId = request.getParameter("cartId");
            String quantityStr = request.getParameter("quantity");

            if (cartId != null && quantityStr != null && !quantityStr.isEmpty()) {
                int newQuantity = Integer.parseInt(quantityStr);
                CartDAO cartDAO = new CartDAO();
                CartInfo existingCart = cartDAO.getCartById(cartId);
                if (existingCart != null) {
                    existingCart.setQuantity(newQuantity);
                    boolean check = cartDAO.updateCart(existingCart);
                    if (check) {
                        
                        request.setAttribute("success", "Update of item in cart successfully.");
                        url = SUCCESS;
                    } else {
                        request.setAttribute("message", "Failed to update item.");
                    }
                } else {
                    request.setAttribute("message", "Cart item not found.");
                }
            } else {
                request.setAttribute("message", "Invalid input.");
            }
        } catch (NumberFormatException e) {
            request.setAttribute("message", "Quantity must be a number.");
            log("Error at UpdateQuantityCartServlet: " + e.toString());
        } catch (Exception e) {
            log("Error at UpdateQuantityCartServlet: " + e.toString());
        } finally {
            request.getRequestDispatcher(url).forward(request, response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
