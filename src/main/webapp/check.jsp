<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Potwierdzenie danych</title>
	</head>
	<body>
		<jsp:useBean id="osoba" class="pl.servlet.domain.Osoba" scope="session" />
		<jsp:setProperty name="osoba" property="*" />
		
		<h2>Wprowadzane dane:</h2><br>
		
		<b>Imie:</b> ${osoba.imie }<br>
		<b>Nazwisko:</b> ${osoba.nazwisko }<br>
		<b>Data urodzenia:</b> ${osoba.dataUr }<br>
		<b>Zawod:</b> ${osoba.zawod }<br>
		
		<b>Przedmioty:</b> 
		<%for(String przedmioty: osoba.getPrzedmioty()){
			if(przedmioty!=null){
				out.println(przedmioty + ", ");
			}
		} %><br><br>
		
		<form action = "insert.jsp">
			<input type="submit" value="Zaakceptuj i dodaj te dane do bazy">
		</form>
		
		<form action = "form.jsp">
			<input type="submit" value="Wroc i edytuj podane dane">
		</form>
	
	</body>
</html>