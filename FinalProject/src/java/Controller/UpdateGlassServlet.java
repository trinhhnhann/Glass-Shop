/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Product.ProductDAO;
import Product.ProductInfo;
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
public class UpdateGlassServlet extends HttpServlet {

    private static final String SUCCESS = "ShopFOrAdmin";
    private static final String ERROR = "ShopFOrAdmin";
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
            String glassName = request.getParameter("glassName");
            String description = request.getParameter("description");
            float price = Float.parseFloat(request.getParameter("price")); 
            String image = request.getParameter("image");
            int status = Integer.parseInt(request.getParameter("status"));
            String type=request.getParameter("type");
            String glassId=request.getParameter("glassId");
            ProductInfo product = new ProductInfo(glassId,glassName,description,type,image,price,status);
            ProductDAO dao = new ProductDAO();
            boolean checkUpdate = dao.update(product);
            if (checkUpdate) {
                request.setAttribute("MESSAGE", "UPDATE SUCCESFULLY");
                url = SUCCESS;
            }else{
                request.setAttribute("ERROR", "UPDATE FAIL");
            }
            System.out.println(checkUpdate);
        } catch (Exception e) {
            log("Error at Update Controller" + e.toString());
             request.setAttribute("ERROR", "update that bai");
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
