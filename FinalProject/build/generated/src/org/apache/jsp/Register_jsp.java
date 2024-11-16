package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Register Account</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function validateForm() {\n");
      out.write("                var password = document.forms[\"registerForm\"][\"password\"].value;\n");
      out.write("                var confirmPassword = document.forms[\"registerForm\"][\"confirmPassword\"].value;\n");
      out.write("                if (password !== confirmPassword) {\n");
      out.write("                    alert(\"Passwords do not match!\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Register Account</h1>\n");
      out.write("        <form name=\"registerForm\" action=\"Controller\" method=\"post\" onsubmit=\"return validateForm()\">\n");
      out.write("            User ID <span style=\"color:red\">*</span><br>\n");
      out.write("            <input type=\"text\" placeholder=\"UserID\" name=\"userId\" required/><br>\n");
      out.write("            Full Name <span style=\"color:red\">*</span><br>\n");
      out.write("            <input type=\"text\" placeholder=\"Full Name\" name=\"fullName\" required/><br>\n");
      out.write("            Email <span style=\"color:red\">*</span><br>\n");
      out.write("            <input type=\"email\" placeholder=\"Email\" name=\"email\" required/><br>\n");
      out.write("            Address <span style=\"color:red\">*</span><br>\n");
      out.write("            <input type=\"text\" placeholder=\"Address\" name=\"address\" required/><br>\n");
      out.write("            Password <span style=\"color:red\">*</span><br>\n");
      out.write("            <input type=\"password\" placeholder=\"Password\" name=\"password\" required/><br>\n");
      out.write("            Confirm Password <span style=\"color:red\">*</span><br>\n");
      out.write("            <input type=\"password\" placeholder=\"Confirm Password\" name=\"confirmPassword\" required/><br>\n");
      out.write("            <input type=\"hidden\" name=\"roleId\" value=\"1\"/> \n");
      out.write("            <input type=\"hidden\" name=\"status\" value=\"1\"/> \n");
      out.write("            <input type=\"submit\" name=\"action\" value=\"REGISTER\"/>\n");
      out.write("        </form>\n");
      out.write("        ");

            String message = (String) request.getAttribute("error");
            if (message == null) {
                message = "";
            }
        
      out.write("\n");
      out.write("        <h4 style=\"color: red\">");
      out.print( message);
      out.write("</h4>\n");
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
