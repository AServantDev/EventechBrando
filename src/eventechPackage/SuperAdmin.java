package eventechPackage;

public class SuperAdmin {
	
	int id_superAdmin;
	String nom;
	String prenom;
	String compte;
	String motDePasse;
	
	
	
	public SuperAdmin(int id_superAdmin, String nom, String prenom, String compte, String motDePasse) {
		this.id_superAdmin = id_superAdmin;
		this.nom = nom;
		this.prenom = prenom;
		this.compte = compte;
		this.motDePasse = motDePasse;
	}
	
	public int getId_superAdmin() {
		return id_superAdmin;
	}
	public void setId_superAdmin(int id_superAdmin) {
		this.id_superAdmin = id_superAdmin;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getCompte() {
		return compte;
	}
	public void setCompte(String compte) {
		this.compte = compte;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	

}
