package eventechPackage;

public class Entreprise {

		
		int id_entreprise;
		String nom;
		String raisonSociale;
		int nbEmploye;
		
		
		
		public Entreprise(int id_entreprise, String nom, String raisonSociale, int nbEmploye) {
			this.id_entreprise = id_entreprise;
			this.nom = nom;
			this.raisonSociale = raisonSociale;
			this.nbEmploye = nbEmploye;
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
		public int getNbEmploye() {
			return nbEmploye;
		}
		public void setNbEmploye(int nbEmploye) {
			this.nbEmploye = nbEmploye;
		}
		
		
	
}
