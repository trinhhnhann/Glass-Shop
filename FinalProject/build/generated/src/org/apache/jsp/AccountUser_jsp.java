package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Account.UserInfo;

public final class AccountUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <div>\n");
      out.write("                <img src=\"https://i.pinimg.com/564x/e7/d4/50/e7d450d8c31ae10aa663d082fdbb3db9.jpg\">\n");
      out.write("                <input type=\"text\" name=\"Search\" name=\"action\"/>      \n");
      out.write("                ENTY GLASSES      \n");
      out.write("                <input type=\"submit\" name=\"action\" value=\"LOGOUT\"/>\n");
      out.write("                <img src=\"https://i.pinimg.com/564x/b5/ae/19/b5ae19e2ff80badebcad2b1867af21f6.jpg\">\n");
      out.write("                <a href=\"Cart.jsp\"><img src=\"https://i.pinimg.com/564x/37/cf/6b/37cf6bcf59d414a7fd39393621ffc5cf.jpg\"></a>\n");
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
      out.write("                    <input type=\"submit\" name=\"action\" value=\"ACCOUNT\"/>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <br>Home/ Account\n");
      out.write("        <br>\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("            <h3>Account Information</h3>\n");
      out.write("            ");

                UserInfo loginUser = (UserInfo) session.getAttribute("loggedUser");

                if (loginUser != null) {
            
      out.write("\n");
      out.write("            <form action=\"Controller\" method=\"POST\">\n");
      out.write("                User ID:<input type=\"text\" name=\"userId\" value=\"");
      out.print( loginUser.getUserId());
      out.write("\"/>\n");
      out.write("                Full Name:<input type=\"text\" name=\"fullName\" value=\"");
      out.print( loginUser.getFullName());
      out.write("\"/>\n");
      out.write("                Email:<input type=\"text\" name=\"email\" value=\"");
      out.print( loginUser.getGmail());
      out.write("\"/>\n");
      out.write("                Address:<input type=\"text\" name=\"address\" value=\"");
      out.print( loginUser.getAddress());
      out.write("\"/>\n");
      out.write("                Password:<input type=\"text\" name=\"password\" value=\"");
      out.print( loginUser.getPassword());
      out.write("\"/>\n");
      out.write("                <input type=\"hidden\" name=\"userId\" value=\"");
      out.print( loginUser.getRoleId());
      out.write("\"/> \n");
      out.write("                <input type=\"hidden\" name=\"productId\" value=\"");
      out.print( loginUser.getStatus());
      out.write("\"/>\n");
      out.write("                <input type=\"submit\" name=\"action\" value=\"UPDATE USER\"/>\n");
      out.write("            </form>\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("            ");

                String message = (String) request.getAttribute("ERROR");
                if (message == null) {
                    message = "";
                }
            
      out.write("\n");
      out.write("            <h4 style=\"color: red\">");
      out.print( message);
      out.write("</h4>\n");
      out.write("            ");

                String succes = (String) request.getAttribute("MESSAGE");
                if (succes == null) {
                    succes = "";
                }
            
      out.write("\n");
      out.write("            <h4 style=\"color: green\">");
      out.print( succes);
      out.write("</h4>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
