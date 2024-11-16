package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Thanks_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\"\n");
      out.write("              integrity=\"sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==\"\n");
      out.write("              crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n");
      out.write("              integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>USER PAGE</title>\n");
      out.write("        <link href=\"CSS/Thanks.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"row head clo-md-12\">\n");
      out.write("            <div class=\"col-md-4 headsearch\">\n");
      out.write("                <img src=\"IMG/INTRO/FindIcon.jpg\" alt=\"Search\" class=\"search-icon\">\n");
      out.write("                <input type=\"text\" placeholder=\"Search\" class=\"search-input\">\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 headname\">\n");
      out.write("                <a href=\"AboutShop.jsp\">\n");
      out.write("                    <h2>ENTY GLASSES</h2>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-md-4 headact\">\n");
      out.write("                <div class=\"col-md-2\">\n");
      out.write("                    <form action=\"Controller\" method=\"post\" class=\"logout-form\">\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-link p-0 text-dark\" name=\"action\" value=\"LOG OUT\">\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-1\">\n");
      out.write("                    <a href=\"AccountUser.jsp\" class=\"action-link a\">\n");
      out.write("                        <img src=\"IMG/INTRO/AccountIcon.jpg\" alt=\"Account\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-1\">\n");
      out.write("                    <a href=\"Cart.jsp\" class=\"action-link b\">\n");
      out.write("                        <img src=\"IMG/INTRO/CartIcon.jpg\" alt=\"Cart\">\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                <div class=\"collapse navbar-collapse navb\" id=\"navbarNav\">\n");
      out.write("                    <ul class=\"navbar-nav\">\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"UserScreen.jsp\">HOME</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <input class=\"dropbtn\" type=\"submit\" name=\"action\" value=\"SHOP\"/>\n");
      out.write("                            <div class=\"dropdown-content\">\n");
      out.write("                                <input type=\"submit\" name=\"action\" value=\"WOMEN GLASSES\"/>\n");
      out.write("                                <input type=\"submit\" name=\"action\" value=\"MEN GLASSES\"/>\n");
      out.write("                                <input type=\"submit\" name=\"action\" value=\"SUN GLASSES\"/>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"AboutShop.jsp\">ABOUT</a>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"nav-item\">\n");
      out.write("                            <a class=\"nav-link\" href=\"AccountUser.jsp\">ACCOUNT</a>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </form>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <div class=\"tag\">\n");
      out.write("                <p>Home / Thank You</p>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <div class=\"thank\">\n");
      out.write("                <img src=\"IMG/greentick.jpg\"/>\n");
      out.write("                <h2>Thank you!</h2>\n");
      out.write("                <br>Your order was successfully completed.\n");
      out.write("                <br><input type=\"submit\" name=\"action\" value=\"BACK TO SHOP\"/>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <footer class=\"text-center text-lg-start text-muted footer\">\n");
      out.write("            <section class=\"d-flex justify-content-center justify-content-lg-between p-4 border-bottom\">\n");
      out.write("                <div></div>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"\">\n");
      out.write("                <div class=\"container text-center text-md-start mt-5\">\n");
      out.write("                    <div class=\"row mt-3\">\n");
      out.write("                        <div class=\"col-md-3 col-lg-4 col-xl-3 mx-auto mb-4\">\n");
      out.write("                            <h6 class=\"text-uppercase fw-bold mb-4\">\n");
      out.write("                                ENTY GLASSES\n");
      out.write("                            </h6>\n");
      out.write("                            <p>\n");
      out.write("                                Whether you are looking for a professional look for the office, a funky pair for the weekends, or a sturdy set for outdoor activities, we have got you covered.\n");
      out.write("                            </p>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-3 col-lg-2 col-xl-2 mx-auto mb-4\">\n");
      out.write("                            <h6 class=\"text-uppercase fw-bold mb-4\">\n");
      out.write("                                ABOUTS\n");
      out.write("                            </h6>\n");
      out.write("                            <form action=\"Controller\" method=\"post\">\n");
      out.write("                                <input type=\"submit\" name=\"action\" class=\"btn btn-link p-0 text-dark\" value=\"WOMEN GLASSES\"/>\n");
      out.write("                                <input type=\"submit\" name=\"action\" class=\"btn btn-link p-0 text-dark\" value=\"MEN GLASSES\"/>\n");
      out.write("                                <input type=\"submit\" name=\"action\" class=\"btn btn-link p-0 text-dark\" value=\"SUN GLASSES\"/>\n");
      out.write("                                <br><a href=\"AboutShop.jsp\">ABOUT</a>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 col-lg-3 col-xl-3 mx-auto mb-md-0 mb-4\">\n");
      out.write("                            <h6 class=\"text-uppercase fw-bold mb-4\">Contact</h6>\n");
      out.write("                            <p><i class=\"fa fa-home me-3\"></i> FPT Universary, HCM Campus.</p>\n");
      out.write("                            <p>\n");
      out.write("                                <i class=\"fas fa-envelope me-3\"></i>\n");
      out.write("                                nhantttse180345@fpt.edu.vn\n");
      out.write("                            </p>\n");
      out.write("                            <p><i class=\"fas fa-phone me-3\"></i> 0974969904</p>\n");
      out.write("                            <p><i class=\"fas fa-print me-3\"></i> 0347060426</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </footer>\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\n");
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
