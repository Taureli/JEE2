<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Dodano nowa osobe</title>
	</head>
	<body>
		<jsp:useBean id="osoba" class="pl.servlet.domain.Osoba" scope="session" />
		<jsp:useBean id="DB" class="pl.servlet.service.DB" scope="application"/>
		<jsp:setProperty name="osoba" property="*" /> 
		
			<%DB.dodaj(osoba);%>
			
			<h2>Pomyslnie wprowadzono nowe dane!</h2><br>
			<b>Imie:</b> ${osoba.getImie()} <br>
			<b>Nazwisko:</b> ${osoba.getNazwisko()} <br>
			<b>Data urodzenia:</b> ${osoba.getDataUr()}<br>
			<b>Zawod:</b> ${osoba.getZawod() } <br>
			<b>Przedmioty: </b>
			<%	
				int size = ( DB.zawartosc() ).size();
				for(String przedmiot: ( ( DB.zawartosc() ).get(size-1) ).getPrzedmioty()){
					if(przedmiot != null)
						out.println(przedmiot + ", ");
				}
						
			%><br><br>
			
			<form action="form.jsp">
    			<input type="submit" value="Dodaj kolejna osobe">
			</form>
			<form action="list.jsp">
    			<input type="submit" value="Wyswietl wszystkie osoby">
			</form>
			
	</body>
</html>