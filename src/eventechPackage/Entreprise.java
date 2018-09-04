package eventechPackage;

public class Entreprise {

	int id_entreprise;
	String nom;
	String raisonSociale;
	int nbEmployes;
	
	
	
	public Entreprise(int id_entreprise, String nom, String raisonSociale, int nbEmployes) {
		this.id_entreprise = id_entreprise;
		this.nom = nom;
		this.raisonSociale = raisonSociale;
		this.nbEmployes = nbEmployes;
	}
	
	public int getId_entreprise() {
		return id_entreprise;
	}
	public void setId_entreprise(int id_entreprise) {
		this.id_entreprise = id_entreprise;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRaisonSociale() {
		return raisonSociale;
	}
	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}
	public int getNbEmployes() {
		return nbEmployes;
	}
	public void setNbEmployes(int nbEmployes) {
		this.nbEmployes = nbEmployes;
	}
	
	
	
}
