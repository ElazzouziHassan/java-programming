package metier;

public class TestMetier {
	
	
	
	public static void main(String[] args) {
		
		
		CompteSimple cs=new CompteSimple(2000, 500);
		
		
		
		CompteEpargne ce=new CompteEpargne(30000, 5);
		
		
		ComptePayant cp=new ComptePayant(4000);
		
		cs.retirer(2500);
		
		ce.calculerInteret();
		
		cp.verser(1000);
		cp.retirer(1000);
		
		System.out.println(cs.toString());
		System.out.println(ce.toString());
		
		System.out.println(cp.toString());
	}
	

}
