/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Account.UserDAO;
import Account.UserInfo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author nhana
 */
public class UpdateAccountUser extends HttpServlet {

    private static final String ERROR = "AccountUser.jsp";
    private static final String SUCCESS = "AccountUser.jsp";

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
        UserInfo sessionUser = (UserInfo) session.getAttribute("loggedUser");
        String url = ERROR;
        try {
            String userId = request.getParameter("userId");
            String fullName = request.getParameter("fullName");
            String gmail = request.getParameter("email");
            String address = request.getParameter("address");
            String password = request.getParameter("password");
            int roleId = Integer.parseInt(request.getParameter("roleId"));
            int status = Integer.parseInt(request.getParameter("status"));
            UserInfo user = new UserInfo(userId, fullName, password, roleId, gmail, address, status);
            UserDAO dao = new UserDAO();
            boolean checkUpdate = dao.update(user);
            if (checkUpdate) {
                session.setAttribute("loggedUser", user);
                request.setAttribute("MESSAGE", "UPDATE SUCCESFULLY");
                url = SUCCESS;
            } else {
                request.setAttribute("ERRORR", "UPDATE FAIL");
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
