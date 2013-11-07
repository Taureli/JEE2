package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import pl.servlet.domain.Osoba;

public final class list_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\t\t<title>Baza osob</title>\n");
      out.write("\t</head>\n");
      out.write("\t<body>\n");
      out.write("\t");
      pl.servlet.service.DB DB = null;
      synchronized (application) {
        DB = (pl.servlet.service.DB) _jspx_page_context.getAttribute("DB", PageContext.APPLICATION_SCOPE);
        if (DB == null){
          DB = new pl.servlet.service.DB();
          _jspx_page_context.setAttribute("DB", DB, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\t\n");
      out.write("\t<h2>Wszystkie osoby w systemie:</h2><br>\n");
      out.write("\t\n");
      out.write("\t");

	for(Osoba o : DB.zawartosc()){
		
		out.println("<br><b>Imie: </b>");
		if(o.getImie() != null)
		out.println(o.getImie());
		
		out.println("<br><b>Nazwisko: </b>");
		if(o.getNazwisko()!=null)
		out.println(o.getNazwisko());
		
		out.println("<br><b>Data urodzenia: </b>");
		if(o.getDataUr() != null)
		out.println(o.getDataUr());
		
		out.println("<br><b>Zawod: </b>");
		if(o.getZawod() != null)
		out.println(o.getZawod());
		
		out.println("<br><b>Przedmioty: </b>");
		for(String przedmiot: o.getPrzedmioty()){
			if(przedmiot != null){
				out.println(przedmiot + ", ");
			}
		}
		
		out.println("<br><br>");
		
	}
	
      out.write("<br>\n");
      out.write("\t\n");
      out.write("\t<form action=\"index.jsp\">\n");
      out.write("    \t<input type=\"submit\" value=\"Powrot na strone glowna\">\n");
      out.write("\t</form>\n");
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
