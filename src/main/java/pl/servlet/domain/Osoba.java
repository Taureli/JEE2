package pl.servlet.domain;

public class Osoba {
	private String imie;
	private String nazwisko;
	private String dataUr;
	private String zawod;
	private String[] przedmioty = new String[3];
	
	public Osoba(){
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getDataUr() {
		return dataUr;
	}

	public void setDataUr(String dataUr) {
		this.dataUr = dataUr;
	}

	public String getZawod() {
		return zawod;
	}

	public void setZawod(String zawod) {
		this.zawod = zawod;
	}

	public String[] getPrzedmioty() {
		return przedmioty;
	}

	public void setPrzedmioty(String[] przedmioty) {
		this.przedmioty = przedmioty;
	}
	
}



