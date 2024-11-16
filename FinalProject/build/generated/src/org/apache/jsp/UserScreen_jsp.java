package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserScreen_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\n");
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
      out.write("                <img src=\"IMG/INTRO/AdminScreen.jpg\" alt=\"\"/>\n");
      out.write("                <h2>Finding Your Perfect Glass</h2>\n");
      out.write("                <br>Welcome to Enty Glasses! We believe that the right pair of glasses can not only improve your vision, but also express your unique personality and style. Whether you are looking for a professional look for the office, a funky pair for the weekends, or a study set for outdoor activities, we have got you covered.\n");
      out.write("                <br><input type=\"submit\" name=\"action\" value=\"SHOP NOW\"/>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("        <div>\n");
      out.write("            <div>\n");
      out.write("                <img src=\"IMG/shipcar.jpg\" alt=\"\"/>\n");
      out.write("                <h4>FREE SHIPPING</h4>\n");
      out.write("                <br>Enjoy our Free Shipping service as we ensure your glasses reach you safety, no matter where you are. We handle all shipping costs, making your shopping experience hassle-free and enjoyable.\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <img src=\"IMG/return.jpg\" alt=\"\"/>\n");
      out.write("                <h4>FREE RETURNS</h4>\n");
      out.write("                <br>We stand behind the quality of our products. If you are not completely satisfied with your purchase, return it for free. We believe in making your experience with us as smooth as possible.\n");
      out.write("            </div>\n");
      out.write("            <div>\n");
      out.write("                <img src=\"IMG/question.jpg\" alt=\"\"/>\n");
      out.write("                <h4>CUSTOMER SUPPORT</h4>\n");
      out.write("                <br>Our dedicated Customer Support team is here to help you every step of the way. Whether you have questions about our products, need help with your order, or want advice on choosing perfect pair, we are just call or click away.\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <h2>HOT VOUCHER FOR USER!!! BUY NOW!!!</h2>\n");
      out.write("            <img src=\"IMG/INTRO/voucher.jpg\" alt=\"\"/>            \n");
      out.write("            <div><h1>5%</h1> For bill exceeds 500$</div>\n");
      out.write("            <div><h1>10%</h1> For bill exceeds 800$</div>\n");
      out.write("            <div><h1>15%</h1> For bill exceeds 1000$</div>\n");
      out.write("        </div>\n");
      out.write("        <form action=\"Controller\" method=\"post\">\n");
      out.write("            <div>\n");
      out.write("                <div>\n");
      out.write("                    <button type=\"submit\" name=\"action\" value=\"WOMEN GLASSES\">\n");
      out.write("                        <img src=\"IMG/INTRO/womenintro.jpg\" alt=\"\"/>\n");
      out.write("                        <br>COLLECTIONS\n");
      out.write("                        <br>WOMEN GLASSES\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <button type=\"submit\" name=\"action\" value=\"MEN GLASSES\">\n");
      out.write("                        <img src=\"IMG/INTRO/menintro.jpg\" alt=\"\"/>\n");
      out.write("                        <br>COLLECTIONS\n");
      out.write("                        <br>MEN GLASSES\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("                    <button type=\"submit\" name=\"action\" value=\"SUN GLASSES\">\n");
      out.write("                        <img src=\"IMG/INTRO/sunintro.jpg\" alt=\"\"/>\n");
      out.write("                        <br>COLLECTIONS\n");
      out.write("                        <br>SUN GLASSES\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </body> \n");
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
