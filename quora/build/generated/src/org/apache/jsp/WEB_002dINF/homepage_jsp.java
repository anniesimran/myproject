package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write(" <center><title>COLLEGE MANAGEMENT</title></center>\n");
      out.write("<body bgcolor=\"black\"><h1 style=\"color:white\"><center>ONLINE STUDENT AND ASSESSMENT MANAGEMENT</center></h1>\n");
      out.write("\n");
      out.write("<style text=\"text/css\">\n");
      out.write("body{\n");
      out.write("\n");
      out.write("background-attachment: fixed;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("#Tesla\n");
      out.write("{\n");
      out.write("    background-color: white;\n");
      out.write("    width: 91%;\n");
      out.write("    border: 2px grey;\n");
      out.write("    padding: 25px;\n");
      out.write("    margin: 25px;\n");
      out.write("\theight:250px;height:250px;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("#Tesla img {\n");
      out.write("  float: left;\n");
      out.write("}\n");
      out.write("#SpaceX{\n");
      out.write("    background-color: lightgrey;\n");
      out.write("    width: 91%;\n");
      out.write("    border: 2px grey;\n");
      out.write("    padding: 25px;\n");
      out.write("\tmargin: 25px;\n");
      out.write("\theight:250px;\n");
      out.write("}\n");
      out.write("#SpaceX img {\n");
      out.write("  float: left;}\n");
      out.write("  \n");
      out.write("#hyperloop{\n");
      out.write("    background-color: white;\n");
      out.write("    width: 91%;\n");
      out.write("    border: 2px grey;\n");
      out.write("    padding: 25px;\n");
      out.write("    margin: 25px;\n");
      out.write("\theight:250px;\n");
      out.write("}\n");
      out.write("#hyperloop img {\n");
      out.write("  float: left;}\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  \n");
      out.write("#SolarCity{\n");
      out.write("    background-color: lightgrey;\n");
      out.write("    width: 91%;\n");
      out.write("    border: 2px grey;\n");
      out.write("    padding: 25px;\n");
      out.write("    margin: 25px;\n");
      out.write("\theight:250px;\n");
      out.write("}\n");
      out.write("#SolarCity img {\n");
      out.write("  float: left;}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("ul {\n");
      out.write("    list-style-type: none;\n");
      out.write("    margin: 0;\n");
      out.write("    padding: 0;\n");
      out.write("    overflow: hidden;\n");
      out.write("    background-color:grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li {\n");
      out.write("    float: right;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a {\n");
      out.write("    display: block;\n");
      out.write("    color: white;\n");
      out.write("    text-align: center;\n");
      out.write("    padding: 16px;\n");
      out.write("    text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("li a:hover {\n");
      out.write("    background-color:#0000ff;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<ul>\n");
      out.write("  <li><a class=\"active\" href=\"home.html\">Logout</a></li>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("  <li><a href=\"#news\">Time Table</a></li>\n");
      out.write("  <li><a href=\"contact.html\">Attendance</a></li>\n");
      out.write("  <li><a href=\"aboutus.html\">Marks</a></li>\n");
      out.write("   <li><a href=\"#news\">Profile</a></li>\n");
      out.write("   <li><a href=\"index.html\">Home</a></li>\n");
      out.write("</ul>\n");
      out.write("\n");
      out.write("    <div class=\"w3-content w3-section\" style=\"max-width:1350px\">\n");
      out.write("\n");
      out.write("  \n");
      out.write("  <img class=\"mySlides w3-animate-fading\" src=\"122.jpg\" style=\"width:100%\" height=\"550\">\n");
      out.write("\n");
      out.write(" \n");
      out.write("    </div><br><br>\n");
      out.write("  \n");
      out.write("\n");
      out.write("</body>\n");
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
