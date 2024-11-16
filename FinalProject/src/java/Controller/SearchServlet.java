/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Account.UserInfo;
import Product.ProductDAO;
import Product.ProductInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author nhana
 */
public class SearchServlet extends HttpServlet {

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
        HttpSession session = request.getSession();
        UserInfo loggedUser = (UserInfo) session.getAttribute("loggedUser");
        if (loggedUser == null) {
            response.sendRedirect("Login.jsp");
            return;
        }

        int roleID = loggedUser.getRoleId();

        ProductDAO dao = new ProductDAO();
        String query = request.getParameter("query");
        List<ProductInfo> glass;
        if (query == null || query.isEmpty()) {
            glass = dao.getAll();
        } else {
            glass = dao.getAllByIdAndName(query, query);
            if (glass.isEmpty()) {
                request.setAttribute("NO_RESULTS", "No search results");
            }
        }

        request.setAttribute("data", glass);

        if (roleID == 1) {
            request.getRequestDispatcher("UserShop.jsp").forward(request, response);
        } else if (roleID == 2 || roleID == 3) {
            request.getRequestDispatcher("AdminShop.jsp").forward(request, response);
        } else {
            // Handle other roles or an invalid role case
            response.sendRedirect("Home.jsp"); // Example for handling invalid role
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
