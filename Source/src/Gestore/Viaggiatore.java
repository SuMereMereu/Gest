package Gestore;

public class Viaggiatore {
	
	private String name;
	private String surname;
	private String mail;
	private String dateOfBirth;
	private Capogruppo capogruppoRef;
	private Viaggio travel;
	
	public Viaggiatore(String nome, String cognome, String mail, String dataDiNascita) {
		this.name = nome;
		this.surname = cognome;
		this.mail = mail;
		this.dateOfBirth = dataDiNascita;
	}
	
	public void setCapogruppo (Capogruppo capo) {
		this.capogruppoRef = capo;
	}
	
	public void setViaggio (Viaggio viaggio) {
		this.travel = viaggio;
	}
	
	public Capogruppo getCapogruppo () {
		return capogruppoRef;
	}
	
	public Viaggio getViaggio () {
		return travel;
	}
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public String getMail() {
		return mail;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

}
