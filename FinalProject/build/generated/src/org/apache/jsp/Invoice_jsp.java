package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Invoice.InvoiceInfo;
import Cart.CartInfo;
import java.util.List;
import Account.UserInfo;

public final class Invoice_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>USER PAGE</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <div>\n");
      out.write("                <img src=\"IMG/INTRO/FindIcon.jpg\" alt=\"\"/>\n");
      out.write("                <form action=\"Controller\" method=\"post\">\n");
      out.write("                    <input type=\"text\" name=\"query\" />\n");
      out.write("                    <input type=\"submit\" value=\"Search\" name=\"action\" />\n");
      out.write("                </form> \n");
      out.write("                <a href=\"AboutShop.jsp\">ENTY GLASSES</a>\n");
      out.write("                <input type=\"submit\" name=\"action\" value=\"LOGOUT\"/>\n");
      out.write("                <a href=\"AccountUser.jsp\"><img src=\"IMG/INTRO/AccountIcon.jpg\" alt=\"\"/></a>\n");
      out.write("                <a href=\"Cart.jsp\"><img src=\"IMG/INTRO/CartIcon.jpg\" alt=\"\"/></a>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><button><a href=\"UserScreen.jsp\">HOME</a></button></li>\n");
      out.write("                    <li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <input class=\"dropbtn\" type=\"submit\" name=\"action\" value=\"SHOP\"/></li>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"WOMEN GLASSES\"/></li>\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"MEN GLASSES\"/></li>\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"SUN GLASSES\"/></li>\n");
      out.write("                    </div>\n");
      out.write("                    </li>\n");
      out.write("                    <button><a href=\"AboutShop.jsp\">ABOUT</a></button>\n");
      out.write("                    <button><a href=\"AccountUser.jsp\">ACCOUNT</a></button>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <div>\n");
      out.write("                Home/ Shop / Cart / Checkout\n");
      out.write("            </div>\n");
      out.write("            <form action=\"AddInvoiceServlet\" method=\"post\">\n");
      out.write("                <div>\n");
      out.write("                    <br>Billing Details\n");
      out.write("                    <div>\n");
      out.write("                        ");

                            UserInfo loginUser = (UserInfo) session.getAttribute("loggedUser");
                            InvoiceInfo invoice = (InvoiceInfo) session.getAttribute("invoice");

                        
      out.write("\n");
      out.write("                        <br>Invoice ID:\n");
      out.write("                        <br><input type=\"text\" name=\"invId\" value=\"");
      out.print(invoice.getInvId());
      out.write("\" readonly>\n");
      out.write("                        <br> User ID:\n");
      out.write("                        <br> <input type=\"text\" name=\"userId\" value=\"");
      out.print(loginUser.getUserId());
      out.write("\" readonly>\n");
      out.write("                        <br> Date of Purchase:\n");
      out.write("                        <input type=\"datetime-local\" name=\"dateBuy\">\n");
      out.write("                        <br> Email <span style=\"color:red\">*</span><br>\n");
      out.write("                        <input type=\"email\" name=\"email\" value=\"");
      out.print(loginUser.getGmail());
      out.write("\"/><br>\n");
      out.write("                        Address <span style=\"color:red\">*</span><br>\n");
      out.write("                        <input type=\"text\" name=\"address\" value=\"");
      out.print(loginUser.getAddress());
      out.write("\"/><br>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <br>Your Order\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <table class=\"table site-block-order-table mb-5\">\n");
      out.write("                        <thead>\n");
      out.write("                        <th>Product</th>\n");
      out.write("                        <th>Total</th>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                List<CartInfo> cartList = (List<CartInfo>) session.getAttribute("cartList");
                                float totalCost = 0;
                                for (CartInfo cart : cartList) {
                                    totalCost += cart.getTotalprice();
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(cart.getGlassId());
      out.write(" <strong class=\"mx-2\">x</strong> ");
      out.print(cart.getQuantity());
      out.write("</td>\n");
      out.write("                                <td>$");
      out.print(cart.getTotalprice());
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                        </tr>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td><strong>Order Total</strong></td>\n");
      out.write("                            <td><strong>$");
      out.print(totalCost);
      out.write("</strong></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            ");

                                if (totalCost >= 500 && totalCost <= 799) {
                                    totalCost = totalCost / 100 * 95;
                            
      out.write("\n");
      out.write("                            <td>Voucher: 5% </td>\n");
      out.write("                            <td><b style=\"color:green\">$");
      out.print(totalCost);
      out.write("</b></td>\n");
      out.write("                            ");
 } else if (totalCost >= 800 && totalCost <= 999) {
                                totalCost = totalCost / 100 * 90;
                            
      out.write("\n");
      out.write("                            <td>Voucher: 10% </td>\n");
      out.write("                            <td><b style=\"color:green\">$");
      out.print(totalCost);
      out.write("</b></td>\n");
      out.write("                            ");
 } else if (totalCost >= 1000) {
                                totalCost = totalCost / 100 * 85;
                            
      out.write("\n");
      out.write("                            <td>Voucher: 15% </td>\n");
      out.write("                            <td><b style=\"color:green\">$");
      out.print(totalCost);
      out.write("</b></td>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                        </tr>\n");
      out.write("                        <input type=\"hidden\" name=\"total\" value=\"");
      out.print(totalCost);
      out.write("\">\n");
      out.write("                        \n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"PLACE ORDER\"/>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
