<%@page import="pl.servlet.domain.Osoba"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Baza osob</title>
	</head>
	<body>
	<jsp:useBean id="DB" class="pl.servlet.service.DB" scope="application" />
	
	<h2>Wszystkie osoby w systemie:</h2><br>
	
	<%
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
	%><br>
	
	<form action="index.jsp">
    	<input type="submit" value="Powrot na strone glowna">
	</form>
	
	</body>
</html>