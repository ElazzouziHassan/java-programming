package metier;

public class CompteEpargne extends Compte{
	
	
	
	private float taux;
	
	

	
	public CompteEpargne(float solde,float taux) {
		super(solde);
		this.taux = taux;
	}

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(float solde) {
		super(solde);
	}

	public float getTaux() {
		return taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	

	@Override
	public void retirer(float montant) {
		if(this.getSolde()>=montant) {
			this.setSolde(this.getSolde()-montant);
		}else {
			System.out.println("Solde insufisant");
		}
		
	}
	
	public void calculerInteret() {
		
		this.setSolde(this.getSolde()+((this.getSolde()*taux)/100));
	}

	@Override
	public String toString() {
		return "CompteEpargne ["+super.toString()+",taux=" + taux + "]";
	}
	
	

}
