package Gestore;

public class Capogruppo {

	private String name;
	private String surname;
	private String mail;
	private String dateOfBirth;
	private String ssn;
	private String telephone;
	private String address;
	private String city;
	private String district;
	private String cap;
	private String occupation;
	private Viaggio travel;

	public Capogruppo(String nome, String cognome, String mail, String dataDiNascita, String cf, String telefono,
			String indirizzo, String citta, String provincia, String cap, String lavoro) {
		super();
		this.name = nome;
		this.surname = cognome;
		this.mail = mail;
		this.dateOfBirth = dataDiNascita;
		this.ssn = cf;
		this.telephone = telefono;
		this.address = indirizzo;
		this.city = citta;
		this.district = provincia;
		this.cap = cap;
		this.occupation = lavoro;
	}
	
	public void setViaggio (Viaggio viaggio) {
		this.travel = viaggio;
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

	public String getSsn() {
		return ssn;
	}

	public String getTelephone() {
		return telephone;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getDistrict() {
		return district;
	}

	public String getCap() {
		return cap;
	}

	public String getOccupation() {
		return occupation;
	}

	public Viaggio getTravel() {
		return travel;
	}


	

}
