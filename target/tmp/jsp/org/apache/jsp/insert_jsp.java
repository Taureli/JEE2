package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class insert_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t<title>Dodano nowa osobe</title>\n");
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
      pl.servlet.service.DB DB = null;
      synchronized (application) {
        DB = (pl.servlet.service.DB) _jspx_page_context.getAttribute("DB", PageContext.APPLICATION_SCOPE);
        if (DB == null){
          DB = new pl.servlet.service.DB();
          _jspx_page_context.setAttribute("DB", DB, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\t\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("osoba"), request);
      out.write(" \n");
      out.write("\t\t\n");
      out.write("\t\t\t");
DB.dodaj(osoba);
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<h2>Pomyslnie wprowadzono nowe dane!</h2><br>\n");
      out.write("\t\t\t<b>Imie:</b> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${osoba.getImie()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br>\n");
      out.write("\t\t\t<b>Nazwisko:</b> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${osoba.getNazwisko()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br>\n");
      out.write("\t\t\t<b>Data urodzenia:</b> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${osoba.getDataUr()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("<br>\n");
      out.write("\t\t\t<b>Zawod:</b> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${osoba.getZawod() }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" <br>\n");
      out.write("\t\t\t<b>Przedmioty: </b>\n");
      out.write("\t\t\t");
	
				int size = ( DB.zawartosc() ).size();
				for(String przedmiot: ( ( DB.zawartosc() ).get(size-1) ).getPrzedmioty()){
					if(przedmiot != null)
						out.println(przedmiot + ", ");
				}
						
			
      out.write("<br><br>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<form action=\"form.jsp\">\n");
      out.write("    \t\t\t<input type=\"submit\" value=\"Dodaj kolejna osobe\">\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t<form action=\"list.jsp\">\n");
      out.write("    \t\t\t<input type=\"submit\" value=\"Wyswietl wszystkie osoby\">\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t\n");
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
