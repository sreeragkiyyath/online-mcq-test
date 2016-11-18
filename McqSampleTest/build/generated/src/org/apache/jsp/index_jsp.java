package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      out.write("        <!--    <h1>ONLINE TEST</h1>\n");
      out.write("        <div align=\"center\"><hr>\n");
      out.write("            <form action=\"\" method=\"post\">\n");
      out.write("<input type=\"radio\" name=\"group1\" value=\"Milk\" checked> Milk<br>\n");
      out.write("<input type=\"radio\" name=\"group1\" value=\"Butter\" > Butter<br>\n");
      out.write("<input type=\"radio\" name=\"group1\" value=\"Butter\" > Butter<br>\n");
      out.write("<input type=\"radio\" name=\"group1\" value=\"Cheese\"> Cheese\n");
      out.write("<hr>\n");
      out.write("        \n");
      out.write("        import com.mcq.servletss.loginServlet.java \n");
      out.write("        \n");
      out.write("        \n");
      out.write("<input type=\"radio\" name=\"group2\" value=\"Water\"> Water<br>\n");
      out.write("<input type=\"radio\" name=\"group2\" value=\"Beer\"> Beer<br>\n");
      out.write("<input type=\"radio\" name=\"group2\" value=\"Wine\" checked> Wine<br>\n");
      out.write("</div>\n");
      out.write("            <input type=\"submit\"/>\n");
      out.write("                \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        --> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"LoginServlet\">  \n");
      out.write("            \n");
      out.write("            username<input type=\"text\" name=\"username\"/><br/><br/>  \n");
      out.write("            password<input type=\"password\" name=\"password\"/><br/><br/>  \n");
      out.write("            <input type=\"submit\" value=\"login\"/>  \n");
      out.write("            \n");
      out.write("        </form>  \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
