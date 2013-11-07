package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class check_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t<title>Potwierdzenie danych</title>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t\t");
      pl.servlet.domain.Osoba osoba = null;
      synchronized (session) {
        osoba = (pl.servlet.domain.Osoba) _jspx_page_context.getAttribute("osoba", PageContext.SESSION_SCOPE);
        if (osoba == null){
          osoba = new pl.servlet.domain.Osoba();
          _jspx_page_context.setAttribute("osoba", osoba, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("osoba"), request);
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t<h2>Wprowadzane dane:</h2><br>\n");
      out.write("\t\t\n");
      out.write("\t\t<b>Imie:</b> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${osoba.imie }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("\t\t<b>Nazwisko:</b> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${osoba.nazwisko }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("\t\t<b>Data urodzenia:</b> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${osoba.dataUr }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("\t\t<b>Zawod:</b> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${osoba.zawod }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("\t\t\n");
      out.write("\t\t<b>Przedmioty:</b> \n");
      out.write("\t\t");
for(String przedmioty: osoba.getPrzedmioty()){
			if(przedmioty!=null){
				out.println(przedmioty + ", ");
			}
		} 
      out.write("<br><br>\n");
      out.write("\t\t\n");
      out.write("\t\t<form action = \"insert.jsp\">\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Zaakceptuj i dodaj te dane do bazy\">\n");
      out.write("\t\t</form>\n");
      out.write("\t\t\n");
      out.write("\t\t<form action = \"form.jsp\">\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Wroc i edytuj podane dane\">\n");
      out.write("\t\t</form>\n");
      out.write("\t\n");
      out.write("\t</body>\n");
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
