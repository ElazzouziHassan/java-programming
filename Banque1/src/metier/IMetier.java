package metier;

import java.util.List;

public interface IMetier {
	
	
	
	public void ajouterClient(Client c);
	public List<Client> getAllClients();
	public List<Client> getClientsParMC(String mc);
	
	
	public void ajouterCompte(Compte c,String cin);
	public Compte getCompteParclient(String cin);
	public List<Compte> getAllComptes();
	
	

}
