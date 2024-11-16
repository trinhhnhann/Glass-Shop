package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminError_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>USER PAGE</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <div>\n");
      out.write("                <img src=\"https://i.pinimg.com/564x/e7/d4/50/e7d450d8c31ae10aa663d082fdbb3db9.jpg\">\n");
      out.write("                <form action=\"Controller\" method=\"post\">\n");
      out.write("                    <input type=\"text\" name=\"query\" />\n");
      out.write("                    <input type=\"submit\" value=\"Search\" name=\"action\" />\n");
      out.write("                </form>     \n");
      out.write("                <a href=\"AboutShop.jsp\">ENTY GLASSES</a>\n");
      out.write("                <input type=\"submit\" name=\"action\" value=\"LOGOUT\"/>\n");
      out.write("                <a href=\"AccountUser.jsp\"><img src=\"https://i.pinimg.com/564x/b5/ae/19/b5ae19e2ff80badebcad2b1867af21f6.jpg\"></a>\n");
      out.write("                <a href=\"Cart.jsp\"><img src=\"https://i.pinimg.com/564x/37/cf/6b/37cf6bcf59d414a7fd39393621ffc5cf.jpg\"></a>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><button><a href=\"AdminScreen.jsp\">HOME</a></button></li>\n");
      out.write("                    <li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <input class=\"dropbtn\" type=\"submit\" name=\"action\" value=\"GLASSES\"/></li>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"WOMEN\"/></li>\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"MEN\"/></li>\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"SUN\"/></li>\n");
      out.write("                    </div>\n");
      out.write("                    </li>\n");
      out.write("                    <input type=\"submit\" name=\"action\" value=\"ADD NEW PRODUCT\"/>\n");
      out.write("                    <button><a href=\"AdminError.jsp\">ADD NEW PRODUCT</a></button>\n");
      out.write("                    <button><a href=\"AdminError.jsp\">MANAGE USER</a></button>\n");
      out.write("                    <button><a href=\"AdminError.jsp\">MANAGE INVOICE</a></button>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <h2 style=\"color:red\">Your operation is not supported, please log in with the correct function <a href=\"Login.jsp\">(here)</a> or return to the home page <a href=\"AdminScreen.jsp\">(here)</a></h2>\n");
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
