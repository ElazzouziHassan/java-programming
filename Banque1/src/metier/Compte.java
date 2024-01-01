package metier;

public abstract class Compte {
	
	private static int nbCompte=0;
	private int code;
	private float solde;
	
	private Client client;
	
	public Compte(){
        code=++nbCompte;
    }

	public Compte(float solde) {
		super();
		this.solde = solde;
		code=++nbCompte;
	}
	
	public float getSolde() {
		return solde;
	}

	public void setSolde(float solde) {
		this.solde = solde;
	}

	public  int getCode() {
		return code;
	}
	
	
	

	
	public  void  verser(float montant) {
		
		if (montant > 0) {
			this.setSolde(this.getSolde() + montant);
		} else {
			System.out.println("Montant negatif");
		}
	}
	
	
	
	public abstract void  retirer(float montant);
	
	public String toString() {
		return " code=" + code + ", solde=" + solde ;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
		client.setCompte(this);
	}
	
}
