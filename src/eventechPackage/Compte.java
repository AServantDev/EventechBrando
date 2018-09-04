package eventechPackage;

public class Compte {
	
	int id;
	String email;
	String password;
	int idUser;
	boolean isPro;
	
	
	
	public Compte(int id, String email, String password, int idUser, boolean isPro) {
		this.id = id;
		this.email = email;
		this.password = password;
		this.idUser = idUser;
		this.isPro = isPro;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public boolean isPro() {
		return isPro;
	}
	public void setPro(boolean isPro) {
		this.isPro = isPro;
	}
	
	
	
	}
