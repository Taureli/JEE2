<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
				"http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Formularz</title>
		
	</head>
	
	<body>
		<jsp:useBean id="osoba" class="pl.servlet.domain.Osoba" scope="session" />
		
		<% boolean go = ((osoba.getPrzedmioty()[0]!=null)?true:false);
		int len = osoba.getPrzedmioty().length; %>
		
		<form action="check.jsp">
		
			<h2>Wypelnienie formularza:</h2>
			<br>
			<br> Imie: <input type="text" name="imie" value="${osoba.imie}">
			<br> Nazwisko: <input type="text" name="nazwisko" value="${osoba.nazwisko}"> <br>
			<br> Data urodzenia: <input type="date" name="urodziny" value="${osoba.dataUr}"> <br>
			
			<br> Zawod: <br> 
			<input type="radio" name="zawod" value="Nauczyciel"
				<%if(osoba.getZawod() != null) if( osoba.getZawod().equals("Nauczyciel") )out.print("Checked");%>>Nauczyciel<br>
			<input type="radio" name="zawod" value="Student"
				<%if(osoba.getZawod() != null) if( osoba.getZawod().equals("Student") )out.print("Checked");%>>Student<br>
			
			<br> Wybierz swoje przedmioty: <br> 
			<input type="checkbox" name="przedmioty" value="Java"
				<%if(go)
					for(int i=0; i<len; i++)
						if(osoba.getPrzedmioty()[i].equals("Java"))
							out.print("Checked");%>>
			Java<br> 
			<input type="checkbox" name="przedmioty" value="Scala"
				<%if(go)
					for(int i=0; i<len; i++)
						if(osoba.getPrzedmioty()[i].equals("Scala"))
							out.print("Checked");%>>
			Scala<br> 
			<input type="checkbox" name="przedmioty" value="Szeregowanie"
				<%if(go)
					for(int i=0; i<len; i++)
						if(osoba.getPrzedmioty()[i].equals("Szeregowanie"))
							out.print("Checked");%>>
			Szeregowanie zadan<br> 
			
			<br>
			<p>
				<input type="submit" value="Zatwierdz ">
		</form>
	
		<%osoba.setPrzedmioty(new String[3]);%>
	
	</body>
</html>