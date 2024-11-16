package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Account.UserInfo;
import Product.ProductInfo;
import java.util.List;

public final class UserShop_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
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
      out.write("                Home/ Shop\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <div>\n");
      out.write("                CATEGORIES\n");
      out.write("                <br><input type=\"submit\" name=\"action\" value=\"MEN GLASSES\"/>\n");
      out.write("                <br><input type=\"submit\" name=\"action\" value=\"WOMEN GLASSES\"/>\n");
      out.write("                <br><input type=\"submit\" name=\"action\" value=\"SUN GLASSES\"/>\n");
      out.write("                <br><input type=\"submit\" name=\"action\" value=\"ALL GLASSES\"/>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <div>\n");
      out.write("                FILTER BY PRICE\n");
      out.write("                Min Price: <input type=\"number\" min=\"0\" name=\"minPrice\" />\n");
      out.write("                Max Price: <input type=\"number\" min=\"0\" name=\"maxPrice\" />\n");
      out.write("                <input type=\"submit\" value=\"Filter\" name=\"action\" /><br/>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <br>Shop All\n");
      out.write("        <br>\n");
      out.write("        <div>\n");
      out.write("            ");

                UserInfo loginUser = (UserInfo) session.getAttribute("loggedUser");
                if (loginUser != null) {
            
      out.write("\n");
      out.write("                ");

                    List<ProductInfo> list = (List<ProductInfo>) request.getAttribute("data");
                    if (list != null) {
                        for (ProductInfo i : list) {
                
      out.write("\n");
      out.write("                <form action=\"Controller\" method=\"POST\">\n");
      out.write("                    <img src=\"");
      out.print(i.getImage());
      out.write("\">\n");
      out.write("                    <br>");
      out.print(i.getGlassName());
      out.write("\n");
      out.write("                    <br>");
      out.print(i.getDescription());
      out.write("\n");
      out.write("                    <br>$");
      out.print(i.getPrice());
      out.write("\n");
      out.write("                    <input type=\"hidden\" name=\"invId\" value=\"null\">\n");
      out.write("                    <input type=\"hidden\" name=\"quantity\" value=\"1\">\n");
      out.write("                    <br><input type=\"submit\" value=\"ADD TO CART\" name=\"action\" />\n");
      out.write("                    <br><input type=\"hidden\" name=\"glassName\" value=\"");
      out.print(i.getGlassName());
      out.write("\"/>\n");
      out.write("                    <br><input type=\"hidden\" name=\"description\" value=\"");
      out.print(i.getDescription());
      out.write("\"/>\n");
      out.write("                    <br>$<input type=\"hidden\" name=\"price\" value=\"");
      out.print(i.getPrice());
      out.write("\"/>\n");
      out.write("                    <input type=\"hidden\" name=\"type\" value=\"");
      out.print(i.getType());
      out.write("\"/>\n");
      out.write("                    <input type=\"hidden\" name=\"glassId\" value=\"");
      out.print(i.getGlassId());
      out.write("\"/>\n");
      out.write("                    <input type=\"hidden\" name=\"status\" value=\"");
      out.print(i.getStatus());
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"image\" value=\"");
      out.print(i.getImage());
      out.write("\">\n");
      out.write("                    <input type=\"hidden\" name=\"userId\" value=\"");
      out.print(loginUser.getUserId());
      out.write("\">\n");
      out.write("                </form>\n");
      out.write("                ");

                    }
                } else {
                
      out.write("\n");
      out.write("                <h3>No results found</h3>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            ");

                }
            
      out.write("\n");
      out.write("        </div>\n");
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
