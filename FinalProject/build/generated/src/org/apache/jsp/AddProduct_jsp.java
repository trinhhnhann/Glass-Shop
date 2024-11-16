package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Account.UserInfo;

public final class AddProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>ADMIN PAGE</title>\n");
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
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><button><a href=\"AdminScreen.jsp\">HOME</a></button></li>\n");
      out.write("                    <li class=\"dropdown\">\n");
      out.write("                        <input class=\"dropbtn\" type=\"submit\" name=\"action\" value=\"GLASSES\"/></li>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <li><input type=\"submit\" name=\"action\" value=\"WOMEN GLASSES\"/></li>\n");
      out.write("                        <li><input type=\"submit\" name=\"action\" value=\"MEN GLASSES\"/></li>\n");
      out.write("                        <li><input type=\"submit\" name=\"action\" value=\"SUN GLASSES\"/></li>\n");
      out.write("                    </div>\n");
      out.write("                    <li><input type=\"submit\" name=\"action\" value=\"ADD NEW PRODUCT\"/></li>\n");
      out.write("                        ");

                            UserInfo loginUser = (UserInfo) session.getAttribute("loggedUser");
                            if (loginUser != null) {
                                int roleId = loginUser.getRoleId();
                                if (roleId == 2) {
                        
      out.write("    \n");
      out.write("                    <li><button><a href=\"AdminError.jsp\">MANAGE USER</a></button></li>\n");
      out.write("                    <li><button><a href=\"AdminError.jsp\">MANAGE INVOICE</a></button></li>\n");
      out.write("                                ");
 } else if (roleId == 3) { 
      out.write("\n");
      out.write("                    <li><input type=\"submit\" name=\"action\" value=\"MANAGE USER\"/></li>\n");
      out.write("                    <li><input type=\"submit\" name=\"action\" value=\"MANAGE INVOICE\"/></li>\n");
      out.write("                        ");
 }
                            } else {
                                response.sendRedirect("Login.jsp");
                            }
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <br>Home / Create Glasses\n");
      out.write("        <h4>Create Glasses</h4>\n");
      out.write("        <div>\n");
      out.write("            <div>\n");
      out.write("                <form action=\"Controller\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("                    <div>\n");
      out.write("                        ID <span style=\"color:red\">*</span><br>\n");
      out.write("                        <input type=\"text\" placeholder=\"GlassID\" name=\"userId\" required/><br>\n");
      out.write("\n");
      out.write("                        Name <span style=\"color:red\">*</span><br>\n");
      out.write("                        <input type=\"text\" placeholder=\"Glass Name\" name=\"fullName\" required/><br>\n");
      out.write("\n");
      out.write("                        Description <span style=\"color:red\">*</span><br>\n");
      out.write("                        <input type=\"text\" placeholder=\"Description\" name=\"description\" required/><br>\n");
      out.write("\n");
      out.write("                        Type <span style=\"color:red\">*</span><br>\n");
      out.write("                        <input type=\"text\" placeholder=\"Type\" name=\"type\" required/><br>\n");
      out.write("\n");
      out.write("                        Price $<span style=\"color:red\">*</span><br>\n");
      out.write("                        <input type=\"number\" placeholder=\"Price\" name=\"price\" required/><br>\n");
      out.write("                    </div>\n");
      out.write("                    <div>\n");
      out.write("                        Image <span style=\"color:red\">*</span><br>\n");
      out.write("                        <input type=\"file\" name=\"image\" required/><br>\n");
      out.write("                        <input type=\"hidden\" name=\"status\" value=\"1\"/>\n");
      out.write("                        <input type=\"submit\" name=\"action\" value=\"CREATE\"/>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                ");

                    String message = (String) request.getAttribute("MESSAGE");
                    if (message == null) {
                        message = "";
                    }
                
      out.write("\n");
      out.write("                <h4 style=\"color: red\">");
      out.print( message);
      out.write("</h4>\n");
      out.write("                ");

                    String er = (String) request.getAttribute("error");
                    if (er == null) {
                        er = "";
                    }
                
      out.write("\n");
      out.write("                <h4 style=\"color: red\">");
      out.print( message);
      out.write("</h4>\n");
      out.write("            </div>\n");
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
