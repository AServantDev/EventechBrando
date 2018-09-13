package eventechPackage;

public class User {

	int id_user;
	String nom;
	String prenom;
	int age;
	String centreInteret;
	String email;
	String password;
	boolean isPro;
	int id_event;
	int id_entreprise;
	
	
	
	public User() {
	
		this.id_user = id_user;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.centreInteret = centreInteret;
		this.email = email;
		this.password = password;
		this.isPro = isPro;
		this.id_event = id_event;
		this.id_entreprise = id_entreprise;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCentreInteret() {
		return centreInteret;
	}
	public void setCentreInteret(String centreInteret) {
		this.centreInteret = centreInteret;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isPro() {
		return isPro;
	}
	public void setPro(boolean isPro) {
		this.isPro = isPro;
	}
	public int getId_event() {
		return id_event;
	}
	public void setId_event(int id_event) {
		this.id_event = id_event;
	}
	public int getId_entreprise() {
		return id_entreprise;
	}
	public void setId_entreprise(int id_entreprise) {
		this.id_entreprise = id_entreprise;
	}
	
	
	
	
	
	
	
}
