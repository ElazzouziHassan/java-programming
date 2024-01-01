package metier;

public class Client {
	
	private String cin,nom,prenom;
	private Compte compte;
	
	

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String cin, String nom, String prenom) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
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

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	

}
