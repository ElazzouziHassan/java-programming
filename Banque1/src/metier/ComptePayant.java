package metier;

public class ComptePayant extends Compte{

	
	
	
	
	
	
	public ComptePayant() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComptePayant(float solde) {
		super(solde);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public void retirer(float montant) {
		float t=(montant*5)/100;
		if(this.getSolde()>=(t+montant)) {
			this.setSolde(this.getSolde()-(t+montant));
		} else {
			System.out.println("Montant negatif");
		}
	}
	
	
	public void verser(float montant) {
		float t=(montant*5)/100;
		if(montant>0) {
			this.setSolde((this.getSolde()+montant)-t);
		}else {
			System.out.println("Solde insufisant");
		}
		
	}

	@Override
	public String toString() {
		return "ComptePayant ["+super.toString()+"]";
	}
	
	

}
