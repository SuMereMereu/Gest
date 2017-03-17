package Gestore;

import java.util.List;

public class Viaggio {

	private int travellersNumber;
	private String destination;
	private String room;
	private String transport;
	private String passWave;
	private String how;
	private int dinnerH;
	private int dinnerM;
	private boolean annualInsurance;
	private List<Viaggiatore> travellers;
	
	public Viaggio (String destinazione, String camera, String trasporto, String passWave, 
			String come, int numeroViaggiatori, int hCena, int mCena, boolean assicurazione) {
		
		this.destination = destinazione;
		this.room = camera;
		this.transport = trasporto;
		this.passWave = passWave;
		this.how = come;
		this.dinnerH = hCena;
		this.dinnerM = mCena;
		this.travellersNumber = numeroViaggiatori;
		this.annualInsurance = assicurazione;
		
	}
	
	public void addTraveller (Viaggiatore v) {
		if(travellersNumber > 1 && travellers.size() < travellersNumber) {
			travellers.add(v);
		}
	}

	public int getTravellersNumber() {
		return travellersNumber;
	}

	public String getDestination() {
		return destination;
	}

	public String getRoom() {
		return room;
	}

	public String getTransport() {
		return transport;
	}

	public String getPassWave() {
		return passWave;
	}

	public String getHow() {
		return how;
	}

	public int getDinnerH() {
		return dinnerH;
	}

	public int getDinnerM() {
		return dinnerM;
	}

	public boolean isAnnualInsurance() {
		return annualInsurance;
	}

	public List<Viaggiatore> getTravellers() {
		return travellers;
	}
	
	
}
