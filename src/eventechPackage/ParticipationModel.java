package eventechPackage;

public class ParticipationModel {

	int ourIDuser ;
	int ourIDevent ;
	String emailUser ;
	String nomEvent ;
	int nbPlacesRestantes;
	
	public int getNbPlacesRestantes() {
		return nbPlacesRestantes;
	}
	public void setNbPlacesRestantes(int nbPlacesRestantes) {
		this.nbPlacesRestantes = nbPlacesRestantes;
	}
	public int getOurIDuser() {
		return ourIDuser;
	}
	public void setOurIDuser(int ourIDuser) {
		this.ourIDuser = ourIDuser;
	}
	public int getOurIDevent() {
		return ourIDevent;
	}
	public void setOurIDevent(int ourIDevent) {
		this.ourIDevent = ourIDevent;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getNomEvent() {
		return nomEvent;
	}
	public void setNomEvent(String nomEvent) {
		this.nomEvent = nomEvent;
	}
	
	
	
}
