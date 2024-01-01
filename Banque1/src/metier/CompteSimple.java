package metier;

public class CompteSimple extends Compte{
	
	private float decouvert;
	
	public CompteSimple() {
		super();
	}
	
	public CompteSimple(float solde, float decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}
	

	public float getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(float decouvert) {
		this.decouvert = decouvert;
	}

	

	@Override
	public void retirer(float montant) {
		
		if((this.getSolde()+decouvert)>=montant) {
			
			this.setSolde(this.getSolde()-montant);
			
		}else {
			System.out.println("Solde insufisant");
		}
	}

	@Override
	public String toString() {
		return "CompteSimple ["+super.toString()+", decouvert=" + decouvert + "]";
	}
	
	

}
