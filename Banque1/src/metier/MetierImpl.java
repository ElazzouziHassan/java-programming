package metier;

import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements IMetier{
	
	Agence agence;
	
	

	public MetierImpl() {
		agence=new Agence();
	}

	@Override
	public void ajouterClient(Client c) {
		agence.getClients().add(c);
		
	}

	@Override
	public List<Client> getAllClients() {
		return agence.getClients();
	}

	@Override
	public List<Client> getClientsParMC(String mc) {
		List<Client> clts=new ArrayList<Client>();
		for(Client c :agence.getClients()) {
			if (c.getNom().contains(mc) || c.getPrenom().contains(mc) ) {
				clts.add(c);
			}
		}
		return clts;
	}

	@Override
	public void ajouterCompte(Compte c,String cin) {
		Client cl=null;
		for(Client cl1 :agence.getClients()) {
			if (cl1.getCin().equals(cin) ) {
				cl=cl1;
				break;
			}
		}
		if(cl!=null) c.setClient(cl);
		else System.out.println();
	}

	@Override
	public Compte getCompteParclient(String cin) {
		Compte c=null;
		for(Client cl :agence.getClients()) {
			if (cl.getCin().equals(cin) ) {
				c=cl.getCompte();
				break;
			}
		}
		return c;
	}

	@Override
	public List<Compte> getAllComptes() {
		ArrayList<Compte> comptes=new ArrayList<Compte>();
		for(Client cl :agence.getClients()) {
			comptes.add(cl.getCompte());
		}
		return comptes;
	}

}
