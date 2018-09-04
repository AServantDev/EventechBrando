package eventechPackage;

import java.util.Date;

public class Evenement {
	
	int id_event;
	String nom;
	int nbParticipant;
	boolean isCagnotte;
	int montantCagnotte;
	String lieu;
	Date dateEvenement;
	String description;
	String theme;
	int placeRestante;
	int placeMax;
	
	
	
	public Evenement(int id_event, String nom, int nbParticipant, boolean isCagnotte, int montantCagnotte, String lieu,
			Date dateEvenement, String description, String theme, int placeRestante, int placeMax) {
		this.id_event = id_event;
		this.nom = nom;
		this.nbParticipant = nbParticipant;
		this.isCagnotte = isCagnotte;
		this.montantCagnotte = montantCagnotte;
		this.lieu = lieu;
		this.dateEvenement = dateEvenement;
		this.description = description;
		this.theme = theme;
		this.placeRestante = placeRestante;
		this.placeMax = placeMax;
	}
	
	public int getId_event() {
		return id_event;
	}
	public void setId_event(int id_event) {
		this.id_event = id_event;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getNbParticipant() {
		return nbParticipant;
	}
	public void setNbParticipant(int nbParticipant) {
		this.nbParticipant = nbParticipant;
	}
	public boolean isCagnotte() {
		return isCagnotte;
	}
	public void setCagnotte(boolean isCagnotte) {
		this.isCagnotte = isCagnotte;
	}
	public int getMontantCagnotte() {
		return montantCagnotte;
	}
	public void setMontantCagnotte(int montantCagnotte) {
		this.montantCagnotte = montantCagnotte;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Date getDateEvenement() {
		return dateEvenement;
	}
	public void setDateEvenement(Date dateEvenement) {
		this.dateEvenement = dateEvenement;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	public int getPlaceRestante() {
		return placeRestante;
	}
	public void setPlaceRestante(int placeRestante) {
		this.placeRestante = placeRestante;
	}
	public int getPlaceMax() {
		return placeMax;
	}
	public void setPlaceMax(int placeMax) {
		this.placeMax = placeMax;
	}
	
	
	
}
