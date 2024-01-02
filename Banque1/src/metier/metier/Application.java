package metier;

public class Application {

	public static void main(String[] args) {
		
		
		MetierImpl metier=new MetierImpl();
		
		metier.ajouterClient(new Client("A123", "Ahmed", "TAZI"));
		metier.ajouterClient(new Client("B123", "ALi", "Benani"));
		
		
		metier.ajouterCompte(new CompteEpargne(10000), "A123");
		metier.ajouterCompte(new CompteSimple(10000,1000), "B123");
		
		
		for(Client c:metier.getClientsParMC("Ah")) System.out.println("Solde du client commence par 'Ah' : "+c.getCompte().getSolde());
		
		
		System.out.println("Compte de client : B123 - "+metier.getCompteParclient("B123").toString());
		

	}

}
