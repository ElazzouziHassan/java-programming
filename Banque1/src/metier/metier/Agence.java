package metier;

import java.util.ArrayList;

public class Agence {
	
	private String nom;
	private ArrayList<Client> clients=new ArrayList<Client>();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agence(String nom) {
		super();
		this.nom = nom;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
	
	

}
