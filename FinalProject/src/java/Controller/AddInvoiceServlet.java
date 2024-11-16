/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Invoice.InvoiceDAO;
import Invoice.InvoiceInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author nhana
 */
public class AddInvoiceServlet extends HttpServlet {

    private static final String ERROR = "Invoice.jsp";
    private static final String SUCCESS = "Thanks.jsp";

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
        response.setContentType("text/html;charset=UTF-8");
        String url = ERROR;
        InvoiceDAO dao = new InvoiceDAO();
        try {
            String invId = request.getParameter("invId");
            String userID = request.getParameter("userId");
            String dateBuy = request.getParameter("dateBuy");

            Date date = new Date();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            dateBuy = formatter.format(date);

            String gmail = request.getParameter("email");
            String address = request.getParameter("address");
            float total = Float.parseFloat(request.getParameter("total"));

            InvoiceInfo invoice = new InvoiceInfo(invId, userID, dateBuy, gmail, address, total);
            boolean checkInsert = dao.AddInvoice(invoice);
            if (checkInsert) {
                
                request.getSession().removeAttribute("cartList");
                request.removeAttribute("cartList");
                log("Adding invoice successful, clearing session attributes.");
                request.getSession().removeAttribute("invId");
                request.getSession().removeAttribute("invoice");
                url = SUCCESS;
            } else {
                log("Failed to add invoice.");
            }
        } catch (Exception e) {
            log("Error at CreateInvoiceController: " + e.toString());
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
