package pl.servlet.service;

import java.util.ArrayList;
import java.util.List;

import pl.servlet.domain.Osoba;

public class DB {
	
	private List<Osoba> baza = new ArrayList<Osoba>();
	
	
	public void dodaj(Osoba osoba){
		
		Osoba o = new Osoba();
		o.setImie(osoba.getImie());
		o.setNazwisko(osoba.getNazwisko());
		o.setDataUr(osoba.getDataUr());
		o.setZawod(osoba.getZawod());
		o.setPrzedmioty(osoba.getPrzedmioty());
		
		baza.add(o);
		
	}
	
	public List<Osoba> zawartosc(){
		
		return baza;
		
	}
}
